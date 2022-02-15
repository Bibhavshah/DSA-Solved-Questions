import java.util.ArrayList;

public class linearSearch {

	public static void main(String[] args) {
		int[] nums = { 10, 20, 80, 30, 60, 50, 60, 100, 130, 60 };
		System.out.println(search(nums, 100, 0));
		findAllIndex(nums, 60, 0);
		System.out.println(list);
		System.out.println(findAllIndex2(nums, 60, 0, new ArrayList<>()));
		System.out.println(findAllIndex3(nums, 60, 0));

	}

	public static int search(int[] nums, int target, int index) {
		if (index >= nums.length) {
			return -1;
		}

		if (nums[index] == target) {
			return index;
		}

		return search(nums, target, index + 1);
	}

	static ArrayList<Integer> list = new ArrayList<>();

	public static void findAllIndex(int[] nums, int target, int index) {
		if (index == nums.length) {
			return;
		}

		if (nums[index] == target) {
			list.add(index);
		}

		findAllIndex(nums, target, index + 1);

	}

	public static ArrayList<Integer> findAllIndex2(int[] nums, int target, int index, ArrayList<Integer> list) {
		if (index == nums.length) {
			return list;
		}

		if (nums[index] == target) {
			list.add(index);
		}

		return findAllIndex2(nums, target, index + 1, list);
	}

	public static ArrayList<Integer> findAllIndex3(int[] nums, int target, int index) {
		ArrayList<Integer> list = new ArrayList<>();
		if (index == nums.length) {
			return list;
		}

		// This will contain all the answers from the particular calls
		if (nums[index] == target) {
			list.add(index);
		}

		// This will collect the answer from returning calls
		ArrayList<Integer> ansFromPrevCalls = findAllIndex3(nums, target, index + 1);
		// Then we add the answer to the main list
		list.addAll(ansFromPrevCalls);
		return list;

	}

}
