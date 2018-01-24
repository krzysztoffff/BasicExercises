package signs;

public class Main4 {

	public static void main(String[] args) {

		String str1 = "TakiniE";
		String resoult1 = toogleChar(str1);
		System.out.println(resoult1);

	} 

	static String toogleChar(String str) {
		String resoult = "";
		char [] chararr = str.toCharArray();
		for (char character : chararr) {

			if (Character.isUpperCase(character)) {
				resoult += Character.toLowerCase(character);
			} else {
				resoult += Character.toUpperCase(character);
			}

		}
		return resoult;

	}
}
