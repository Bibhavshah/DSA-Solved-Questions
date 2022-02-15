package Binary_Search;

public class PeakIndexInMountainArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
		int start = 0;
		int end = peakIndex(arr);
		System.out.println(binarySearch(arr, 3, start, end));
	}

	static int peakIndex(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			}

			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			}
		}

		return start;
	}

	static int binarySearch(int[] arr, int target, int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				start = mid + 1;
			}
			if (arr[mid] > target) {
				end = mid - 1;
			}
		}
		return -1;
	}

}
