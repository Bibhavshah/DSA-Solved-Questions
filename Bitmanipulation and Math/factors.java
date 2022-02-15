import java.util.ArrayList;

public class factors {

	public static void main(String[] args) {
		// factors1(20);
		// factors2(40);
		factors3(100);
	}

	// brute-force O(n)
	static void factors1(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	// optimized with O(sqrt(n)) with factors printing in random way
	static void factors2(int n) {
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (n / i == i) {
					System.out.print(i + " ");
				} else {
					System.out.print(i + " " + n / i + " ");
				}
			}
		}
	}

	static void factors3(int n) {
		ArrayList<Integer> factors = new ArrayList<>();
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (n / i == i) {
					System.out.print(i + " ");
				} else {
					System.out.print(i + " ");
					factors.add(n / i);
				}
			}
		}
		for (int i = factors.size() - 1; i >= 0; i--) {
			System.out.print(factors.get(i) + " ");
		}
	}

}
