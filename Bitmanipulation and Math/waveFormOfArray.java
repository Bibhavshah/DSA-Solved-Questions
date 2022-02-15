import java.util.Arrays;

public class waveFormOfArray {
	public static void convertToWave(int arr[], int n) {
		int i = 0;
		if ((n & 1) == 1) {
			helper1(arr, i);
		} else {
			helper2(arr, i);
		}
	}

	public static void helper1(int[] arr, int i) {
		if (i > arr.length - 2) {
			return;
		}

		int temp = arr[i];
		arr[i] = arr[i + 1];
		arr[i + 1] = temp;
		helper1(arr, i + 2);
	}

	public static void helper2(int[] arr, int i) {
		if (i > arr.length - 1) {
			return;
		}

		int temp = arr[i];
		arr[i] = arr[i + 1];
		arr[i + 1] = temp;
		helper2(arr, i + 2);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 7, 8, 9, 10 };
		convertToWave(arr, arr.length);
		System.out.println(Arrays.toString(arr));

	}

}
