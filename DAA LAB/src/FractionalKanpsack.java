import java.util.Scanner;

public class FractionalKanpsack {
	public static void main(String[] args) {
		int n, i, mcap, m, j=0;
		float sum=0, max;
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
		mcap = sc.nextInt();
		m = mcap;
		
		while(m>=0) {
			max = 0;
			
			for(i=0; i<n; i++) {
				if(((float)val[i])/((float)wt[i]) > max) {
					max = (((float)val[i])/((float)wt[i]));
					j = i;
				}
			}
			
			if(wt[j] <= m) {
				System.out.println("Quantity of item number: " + (j+1) + " and weight is " + wt[j]);
				m = m - wt[j];
				sum = sum + (float)val[j];
				val[j] = 0;
			}
			else {
				System.out.println("Quantity of item number: " + (j+1) + " and weight is " + m);
				sum = sum + m*max;
				m = -1;
			}
		}
		System.out.println("Maximum value: " + sum);
	}
}
