import java.util.Scanner;

public class ZeroOneKnapsack {
	static int max(int a, int b) {
		return a>b? a:b;
	}
	static void knapSack(int c, int wt[], int val[], int n) {
		int i, w;
		
		int k[][] = new int[n+1][c+1];
		
		for(i=0; i<=n; i++) {
			for(w=0; w<=c; w++) {
				if((i==0) || (w==0))
					k[i][w] = 0;
				else if(wt[i-1]<=w)
					k[i][w] = max(val[i-1] + k[i-1][w-wt[i-1]], k[i-1][w]);
				else
					k[i][w] = k[i-1][w];
			}
		}
		System.out.println("Best value is: " + k[n][c]);
		
		int res = k[n][c];
		w = c;
		
		System.out.println("Contributed weights are: ");
		
		for(i=n; (i>0)&&(res>0); i--) {
			if(res == k[i-1][w])
				continue;
			else{
				System.out.println(wt[i-1] + " ");
				res = res - val[i-1];
				w = w - wt[i-1];
			}
		}
	}
	public static void main(String[] args) {
		int n, i, c;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of items: ");
		n = sc.nextInt();
		
		int[] wt = new int[n];
		int[] val = new int[n];
		
		System.out.println("Enter the weights of the item: ");
		for(i=0; i<n; i++)
			wt[i] = sc.nextInt();
		
		System.out.println("Enter the values of the item: ");
		for(i=0; i<n; i++)
			val[i] = sc.nextInt();
		
		System.out.println("Enter the max capacity of the knapsack: ");
		c = sc.nextInt();
		
		knapSack(c, wt, val, n);
	}
}
