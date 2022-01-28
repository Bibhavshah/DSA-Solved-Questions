import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// printTriangle(5, 0);
		int[] arr = { 4, 2, 3, 1 };
		bubbleSort(arr, arr.length - 1, 0);
		// System.out.println("Sorting using Bubble: "+Arrays.toString(arr));
		selectionSort(arr, arr.length - 1, 0, 0);
		System.out.println("Sorting using selection: " + Arrays.toString(arr));
	}

	public static void printTriangle(int row, int col) {
		if (row == 0) {
			return;
		}

		if (col < row) {
			System.out.print("* ");
			printTriangle(row, col + 1);

		} else {
			System.out.println();
			printTriangle(row - 1, 0);
		}
	}

	public static void bubbleSort(int[] arr, int row, int col) {
		if (row == 0) {
			return;
		}

		if (col < row) {
			if (arr[col] > arr[col + 1]) {
				int temp = arr[col];
				arr[col] = arr[col + 1];
				arr[col + 1] = temp;
			}
			bubbleSort(arr, row, col + 1);

		} else {
			bubbleSort(arr, row - 1, 0);
		}
	}

	public static void selectionSort(int[] arr, int row, int col, int max) {
		if (row == 0) {
			return;
		}

		if (col < row) {
			if (arr[col] > arr[max]) {
				selectionSort(arr, row, col + 1, col);
			} else {
				selectionSort(arr, row, col + 1, max);
			}

		} else {
			int temp = arr[max];
			arr[max] = arr[row - 1];
			arr[row - 1] = temp;
			selectionSort(arr, row - 1, 0, 0);
		}
	}

}
