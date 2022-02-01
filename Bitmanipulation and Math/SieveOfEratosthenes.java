import java.util.Arrays;

public class SieveOfEratosthenes {
	public static void main(String[] args) {
		int n = 40;
		boolean[] primeSieve = new boolean[n + 1];
		Arrays.fill(primeSieve, true);
		for (int i = 0; i * i <= n; i++) {
			if (i <= 1) {
				primeSieve[i] = false;
			}
			if (primeSieve[i] == true) {
				for (int j = i * 2; j <= n; j += i) {
					primeSieve[j] = false;
				}
			}
		}
		// System.out.println(Arrays.toString(primeSieve));
		for (int k = 0; k < primeSieve.length; k++) {
			if (primeSieve[k] == true) {
				System.out.print(k + " ");
			}
		}
	}

	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		int cnt = 1;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				cnt++;
			}
		}
		if (cnt != 1) {
			return false;
		}
		return true;
	}

}
