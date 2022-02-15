
public class linearSearchWithRecursion {

	public static void main(String[] args) {
		int[] arr = { -1, 6, 9, 1, 15, 11, 17, 18 };
		System.out.println(linearSearch(arr, 15, 0));
		maximumValue(arr, 7, arr[0]);

	}

	static int linearSearch(int[] arr, int target, int i) {
		if (i == arr.length) {
			return -1;
		}

		if (arr[i] == target) {
			return i;
		}

		return linearSearch(arr, target, i + 1);
	}

	static void maximumValue(int[] arr, int i, int max) {
		if (i < 0) {
			System.out.println(max);
			return;
		}

		if (arr[i] > max) {
			max = arr[i];
		}
		maximumValue(arr, i - 1, max);
	}

}
