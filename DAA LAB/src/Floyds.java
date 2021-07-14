import java.util.Scanner;
public class Floyds {
	static int n;
	
	void floydWarshall(int graph[][]) {
		int dist[][] = new int[n][n];
		int i, j, k;
		
		for(i=0; i<n; i++)
			for(j=0; j<n; j++)
				dist[i][j] = graph[i][j];
		
		for(k=0; k<n; k++) {
			for(i=0; i<n; i++) {
				for(j=0; j<n; j++) {
					if(dist[i][k] + dist[k][j] < dist[i][j])
						dist[i][j] = dist[i][k] + dist[k][j];
				}
			}	
		}
		printSolution(dist);
	}
	
	void printSolution(int dist[][]) {
		int i, j;
		
		System.out.println("Shortest path using Floyd Warshall Algorithm: ");
		
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.print(dist[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int i, j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices: ");
		n = sc.nextInt();
		
		int graph[][] = new int[n][n];
		
		System.out.println("Enter cost matrix: ");
		
		for(i=0; i<n; i++)
			for(j=0; j<n; j++)
				graph[i][j] = sc.nextInt();
		
		Floyds a = new Floyds();
		a.floydWarshall(graph);
	}
}
