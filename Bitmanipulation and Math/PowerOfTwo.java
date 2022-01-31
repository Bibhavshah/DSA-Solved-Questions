
public class PowerOfTwo {

	public static void main(String[] args) {
		int num = 128;
		int setBitCount = 0;
		while (num > 0) {
			// This will give me the the last digit
			int temp = num & 1;
			num = num >> 1;
			if (temp == 1) {
				setBitCount += 1;
			}
		}
		if (setBitCount == 1) {
			System.out.println("The given number is power of 2");
		} else {
			System.out.println("The given number is not power of 2");
		}

	}

}
