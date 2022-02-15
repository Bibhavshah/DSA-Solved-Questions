package Binary_Search;

public class ceilingNumber {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 7, 9, 10, 11, 15, 25, 63 };
		System.out.println(ceilingOfNumber(arr, 65, 0, arr.length - 1));
		System.out.println(floorOfNumber(arr, 1, 0, arr.length - 1));
	}

	static int ceilingOfNumber(int[] arr, int target, int s, int e) {
		if (target > arr[arr.length - 1])
			return -1;
		if (s > e) {
			return arr[s];
		}
		int mid = s + (e - s) / 2;
		if (arr[mid] == target) {
			return arr[mid];
		}

		if (target < arr[mid]) {
			return ceilingOfNumber(arr, target, s, mid - 1);
		}
		return ceilingOfNumber(arr, target, mid + 1, e);
	}

	static int floorOfNumber(int[] arr, int target, int s, int e) {
		if (target < arr[0])
			return -1;
		if (s > e) {
			return arr[e];
		}
		int mid = s + (e - s) / 2;
		if (arr[mid] == target) {
			return arr[mid];
		}

		if (target < arr[mid]) {
			return floorOfNumber(arr, target, s, mid - 1);
		}
		return floorOfNumber(arr, target, mid + 1, e);
	}

}
