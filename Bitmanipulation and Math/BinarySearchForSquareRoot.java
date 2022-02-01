
public class BinarySearchForSquareRoot {

	public static void main(String[] args) {
		int n = 256;
		int target = n;
		System.out.println(sqrt(target, 0, n));

	}

	static int sqrt(int target, int s, int e) {
		int mid = s + (e - s) / 2;
		if (mid * mid == target) {
			return mid;
		}

		if (mid * mid < target) {
			return sqrt(target, mid + 1, e);
		}
		return sqrt(target, s, mid - 1);

	}

}
