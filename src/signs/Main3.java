package signs;

public class Main3 {

	public static void main(String[] args) {

		String str = null; // wprowadŸ napis

		try {
			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.print(str.charAt(i)); // wykonanie w main
			} 
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("\n");

		String reverse = reverse(str); // wykonanie z metodki reverse
		System.out.println(reverse);

	}

	static String reverse(String str1) {
		if (str1 == null) {
			return "WprowadŸ napis";
		}
		String revS = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			revS += str1.charAt(i);
		}
		return revS;
	}
}
