
public class magicNumber {

	public static void main(String[] args) {
		// 1 = 001 = 0*5^3+0*5^2+1*5^1 = 5
		// 2 = 010 = 0*5^3+1*5^2+0*5^1 = 25
		// 3 = 011 = 0*5^3+1*5^2+1*5^1 = 30
		// 4 = 100 = 1*5^3+0*5^2+0*5^1 = 125
		// This is the definition of magic numbers, write a code that
		// finds the nth magic number;

		int n = 5;
		int ans = 0;
		int base = 5;
		while (n > 0) {
			int temp = n & 1;
			ans = ans + temp * base;
			base = base * 5;
			n = n >> 1;
		}
		System.out.println(ans);
	}

}
