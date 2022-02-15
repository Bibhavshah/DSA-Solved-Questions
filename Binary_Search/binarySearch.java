package Binary_Search;

public class binarySearch {

	public static void main(String[] args) {
		int[] arr = { -1, 0, 3, 5, 9, 12 };
		System.out.println(search(arr, 9));

	}

	public static int search(int[] nums, int target) {
		return helper(nums, target, 0, nums.length);
	}

	private static int helper(int[] nums, int target, int s, int e) {
		if (s > e) {
			return -1;
		}
		int mid = s + (e - s) / 2;

		if (nums[mid] == target) {
			return mid;
		}

		if (target < nums[mid]) {
			return helper(nums, target, s, mid - 1);
		}

		return helper(nums, target, mid + 1, e);
	}

}
