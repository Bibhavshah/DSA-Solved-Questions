
public class firstUpperCase {

	public static void main(String[] args) {
		String str = "geeksforgeeKs";
		System.out.println(firstUppercase(str, 0));
	}

	public static char firstUppercase(String str, int i) {
		if (str.length() < 1 || i > str.length()) {
			return 0;
		}
		char ch = str.charAt(i);

		if (ch >= 65 && ch <= 90) {
			return ch;
		}

		return firstUppercase(str, i + 1);
	}
}
