import java.util.Scanner;

public class GeekonacciNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 3;
		int c = 2;
		int n = 5;
		System.out.println(geekNumber(a, b, c, n));
	}

	public static int geekNumber(int a, int b, int c, int n) {
		if (n == 1) {
			return a;
		}
		if (n == 2) {
			return b;
		}
		if (n == 3) {
			return c;
		}

		return geekNumber(a, b, c, n - 1) + geekNumber(a, b, c, n - 2) + geekNumber(a, b, c, n - 3);
	}

}
