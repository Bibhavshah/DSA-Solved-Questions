package Binary_Search;

public class rotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = { 3, 1 };
		int target = 1;
		System.out.println(binarySearchinRotatedSortedArray(nums, target));

	}

	static int binarySearchinRotatedSortedArray(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			// checking if right part is sorted or not
			if (nums[start] <= nums[mid]) {
				if (target >= nums[start] && target < nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
			// If right part is not sorted then for sure the left part will be
			else {
				if (target > nums[mid] && target <= nums[end]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
		}
		return -1;
	}
}
