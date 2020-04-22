package array;

public class RearrangeNumberMaxMinOrder {

	// complexity space o(1) and time o(n)

	public static int[] rearrangeArray(int[] a) {
		
		for (int i = 0; i < a.length-1; i++) {
			int j = a.length - i - 1;
			swap(a, i + 1, j);
		}
		printArr(a);

		return a;
	}

	static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static void printArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}

	public static void main(String[] args) {

		// array sorted
		int[] num = { 1, 2, 3, 4, 5, 6 };
		int [] temp = rearrangeArray(num);

	

	}

}
