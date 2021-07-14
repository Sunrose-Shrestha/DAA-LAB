import java.util.Scanner;
import java.util.Random;

public class MergeWithRandom {
	private int[] array;
	private int[] temp;
	private int length;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int i;
		long t1, t2, t;
		System.out.print("Enter number of integer elements: ");
		int n =  sc.nextInt();
		int[] arr = new int[n];
		for(i=0; i<n; i++)
			arr[i] = random.nextInt(5000);
		MergeWithRandom m = new MergeWithRandom();
		System.out.print("Unsorted elements are: ");
		for(int i1:arr) {
			System.out.print(i1);
			System.out.print(" ");
		}
		t1 = System.currentTimeMillis();
		m.sort(arr);
		t2 = System.currentTimeMillis();
		System.out.println();
		t = t2-t1;
		System.out.println("Time taken to sort " + n + " numbers is " + t);
		System.out.print("Sorted Elements are: ");
		for(int i1:arr) {
			System.out.print(i1);
			System.out.print(" ");
		}
	}
	public void sort(int[] inputArr) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.temp = new int[length];
		doMergeSort(0, length-1);
	}
	private void doMergeSort(int low, int high) { // Divide the n size array into n sub arrays
		if(low < high) {
			int middle = low + (high-low)/2;
			doMergeSort(low, middle);
			doMergeSort(middle+1, high);
			mergeParts(low, middle, high);
		}
	}
	private void mergeParts(int low, int middle, int high) {
		for(int i = low; i<=high; i++) {
			temp[i] = array[i];
		}
		int i = low;
		int j = middle+1;
		int k = low;
		while(i<=middle && j<=high) {
			if(temp[i] <= temp[j]) {
				array[k] = temp[i];
				i++;
			}
			else {
				array[k] = temp[j];
				j++;
			}
			k++;
		}
		while(i<=middle) {
			array[k] = temp[i];
			k++;
			i++;
		}
	}
}
