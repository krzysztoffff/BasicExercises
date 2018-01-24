package signs;

public class Main5 {

	public static void main(String[] args) {
		String sign = "Ala ma kota";
		char c = 'a';
		System.out.println(charPos(sign, c));
	}

	static int charPos(String str, char c) {

		return str.indexOf(c);

	}
}
