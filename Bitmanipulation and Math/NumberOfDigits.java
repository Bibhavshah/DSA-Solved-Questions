
public class NumberOfDigits {

	public static void main(String[] args) {
		int n = 523;
		int base = 2;
		int ans = (int) (Math.log(n) / Math.log(base)) + 1;
		System.out.printf("The number of digits in %d Binary representation is: %d", n, ans);

// We can use this code for any base by changing the value of base
//The main take in here is (Math.log(n) / Math.log(base)) here we have
//divided by the log to convert it in base 2
		System.out.println();
		base = 8;
		ans = (int) (Math.log(n) / Math.log(base)) + 1;
		System.out.printf("The number of digits in %d Octal representation is: %d", n, ans);

		System.out.println();
		base = 10;
		ans = (int) (Math.log(n) / Math.log(base)) + 1;
		System.out.printf("The number of digits in %d Decimal representation is: %d", n, ans);

	}

}
