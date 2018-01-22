package signs;

public class Main2 {

	public static void main(String[] args) {

		String str = "koby³a ma ma³y bok";
		boolean check;
		check = palindrom(str);
		System.out.println(check);

	}

	static boolean palindrom(String str) {
		String str1 = str.replaceAll(" ", "").toLowerCase();
		boolean check = false;

		for (int i = 0; i < str1.length() / 2; i++) {
			if (str1.charAt(i) == str1.charAt(str1.length() - 1 - i)) {

				check = true;
			}else {
				check = false;
				break;
			}
		}

		return check;
	}

}
