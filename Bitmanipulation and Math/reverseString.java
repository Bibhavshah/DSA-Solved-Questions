import java.util.Arrays;

public class reverseString {

	public static void main(String[] args) {
		String[] s = { "h", "e", "l", "l", "o" };
		ReverseString(s);
		System.out.println(Arrays.toString(s));
	}

	public static void ReverseString(String[] s) {
		helper(s, 0);
	}

	public static void helper(String[] s, int i) {
		if (i == s.length / 2) {
			return;
		}
		swap(s, i, s.length - 1 - i);
		helper(s, i + 1);
	}

	private static void swap(String[] s, int i, int j) {
		String temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
}
