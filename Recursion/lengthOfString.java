
public class lengthOfString {

	public static void main(String[] args) {
		String str = "GEEKSFORGEEKS";
		System.out.println(stringLength(str, str.length(), 0));

	}

	public static int stringLength(String str, int length, int count) {
		if (length == 0) {
			return count;
		}

		return stringLength(str, length - 1, count + 1);
	}

}
