
public class BitwiseManipulation {

	public static void main(String[] args) {
		int num = 45;
		int[] nums = { 2, 3, 4, 5, 4, 2, 3 };
		int number = 0b101101001;
		int n = 6;
		isEvenOrOdd(num);
		System.out.println(uniqeNumber(nums));
		ithBitOfBinaryNumber(number, n);

	}

	private static void ithBitOfBinaryNumber(int number, int n) {
		int mask = (1 << (n - 1));
		System.out.println(Integer.toBinaryString(number & mask));
	}

	private static int uniqeNumber(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result = nums[i] ^ result;
		}

		return result;
	}

	private static void isEvenOrOdd(int num) {
		if ((num & 1) == 1) {
			System.out.println("Odd number");
		} else {
			System.out.println("Even number");
		}

	}

}
