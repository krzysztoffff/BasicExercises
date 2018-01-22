package signs;

public class Main1 {

	public static void main(String[] args) {

		String str = "CodersLab jak dobrze zacz¹æ programowaæ";

		
		char a = str.charAt(str.length() - 2);
		System.out.println(a);

		int counter = 0;
		for (char sign : str.toCharArray()) { //to mo¿na te¿ przeiterowaæ po literce i porównaæ
			if (sign == a) {
				counter += 1;
			}
			
		}
		System.out.println(counter);

		
	}
}
