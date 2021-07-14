import java.util.*;
public class Kruskals {
	static void find(int u, int v, int parent[]) {
		if(parent[u]!=parent[v]) {
			union(u, v, parent);
		}
	}
	static void union(int u, int v, int parent[]) {
		int prev = parent[v];
		parent[v] = parent[u];
		for(int i=0; i<parent.length; i++) {
			if(parent[i]==prev) {
				parent[i] = parent[u];
			}
		}
		System.out.println("Edge selected is " + u + " -> " + v);
	}
	public static void main(String[] args) {
		int i, j=0, n, u=0, v=0;
		int ne = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of vertices: ");
		n = sc.nextInt();
		int[][] adj = new int[n][n];
		int[][] cost = new int[n][n];
		System.out.println("Enter the matrix: ");
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				cost[i][j] = sc.nextInt();
			}
		}
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				adj[i][j] = cost[i][j];
			}
		}
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				if(adj[i][j]!=999 && adj[i][j]!=0) {
					ne++;
				}
				adj[i][j] = adj[j][i] = 999;
			}
		}
		int parent[] = new int[n];
		for(i=0; i<n; i++) {
			parent[i] = i;
		}
		for(int count=0; count<ne; count++) {
			int min=999;
			for(i=0; i<n; i++) {
				for(j=0; j<n; j++) {
					if(cost[i][j] < min && cost[i][j]!=0) {
						min = cost[i][j];
						u = i;
						v = j;
					}
				}
			}
			find(u, v, parent);
			cost[u][v] = cost[v][u] = 999;
		}
	}
}
