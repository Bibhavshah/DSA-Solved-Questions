package Binary_Search;

public class AgnosticBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 20, 15, 11, 9, 6, 1, 0, -5, -10 };
		int target = 6;
		if (arr[0] < arr[arr.length - 1]) {
			System.out.println(binarySearchAscending(arr, target, 0, arr.length - 1));
		} else {
			System.out.println(binarySearchDescending(arr, target, 0, arr.length - 1));
		}
	}

	static int binarySearchAscending(int[] arr, int target, int s, int e) {
		if (s > e) {
			return -1;
		}

		int mid = s + (e - s) / 2;
		if (target == arr[mid]) {
			return mid;
		}

		if (target < arr[mid]) {
			return binarySearchAscending(arr, target, s, mid - 1);
		}

		return binarySearchAscending(arr, target, mid + 1, e);
	}

	static int binarySearchDescending(int[] arr, int target, int s, int e) {
		if (s > e) {
			return -1;
		}

		int mid = s + (e - s) / 2;
		if (target == arr[mid]) {
			return mid;
		}

		if (target < arr[mid]) {
			return binarySearchDescending(arr, target, mid + 1, e);
		}

		return binarySearchDescending(arr, target, s, mid - 1);
	}

}
