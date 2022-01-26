public class maxAndMin {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 45, 6, -50, 10, 2 };
		int n = arr.length;
		System.out.println(minNumOfArray(arr, n));
		System.out.println(maxNumOfArray(arr, n));

	}

	public static int minNumOfArray(int[] arr, int n) {
		if (n == 1) {
			return arr[0];
		}

		return Math.min(arr[n - 1], minNumOfArray(arr, n - 1));
	}

	public static int maxNumOfArray(int[] arr, int n) {
		if (n == 1) {
			return arr[0];
		}

		return Math.max(arr[n - 1], maxNumOfArray(arr, n - 1));
	}

}
