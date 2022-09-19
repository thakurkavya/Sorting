import java.util.Scanner;
public class BubbleSort {
	public static void main(String args[]) {
		Scanner kt = new Scanner(System.in);
		int n = 0;
		System.out.println("Enter a number - ");
		n = kt.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array values - ");
		for(int i = 0; i<n; i++) {
			arr[i] = kt.nextInt();
		}
		int temp = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 1; j<(n-i); j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		kt.close();
	}
}
