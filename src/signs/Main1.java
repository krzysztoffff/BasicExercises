package signs;

public class Main1 {

	public static void main(String[] args) {

		String str = "CodersLab jak dobrze zacz�� programowa�";

		
		char a = str.charAt(str.length() - 2);
		System.out.println(a);

		int counter = 0;
		for (char sign : str.toCharArray()) { //to mo�na te� przeiterowa� po literce i por�wna�
			if (sign == a) {
				counter += 1;
			}
			
		}
		System.out.println(counter);

		
	}
}
