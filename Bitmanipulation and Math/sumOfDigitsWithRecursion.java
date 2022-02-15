
public class sumOfDigitsWithRecursion {

	public static void main(String[] args) {
		int num = 53;
		System.out.println(digitSum(num, 0));
		System.out.println(isPrime(num, num / 2));
		String su = "235";
		int n = Integer.parseInt(su);
		System.out.println(n);
	}

	static int digitSum(int num, int sum) {
		if (num <= 0) {
			return sum;
		}

		sum = sum + num % 10;
		return digitSum(num / 10, sum);
	}

	static boolean isPrime(int num, int i) {
		if (i == 1) {
			return true;
		}
		if (num % i == 0) {
			return false;
		}

		return isPrime(num, i - 1);
	}

}
