package signs;

public class Main8 {

	public static void main(String[] args) {
		String[] strArr = { "Co", "der", "s ", "La", "b", " : Java" };
		System.out.println(stringFromArray(strArr));
	}

	static String stringFromArray(String[] strArr) {
		String res = "";
		for (String str : strArr) {
			res += str;
		}

		return res;
	}

}
