package signs2;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main4 {

	public static void main(String[] args) {

		char separator = '-';
		String sentence = "Java-jest-super";

		try {
			if (onlyTwoElements(sentence, separator)[0] != "") {
				System.out.println("---------------\nTokenizerem:");
				System.out.println(Arrays.toString(onlyTwoElements(sentence, separator)));
				System.out.println("---------------\nSplitem z ograniczeniem podzia³u do 2:");
				System.out.println(Arrays.toString(onlyTwoElementsBySplit(sentence, separator)));
			}
		} catch (NullPointerException e) {
			System.out.println("Error: " + e);

		}
		

	}

	private static String[] onlyTwoElements(String sentence, char separator) {

		String[] tab = { "", "" };
		String stringSeparator = Character.toString(separator);

		try {
			StringTokenizer s = new StringTokenizer(sentence, stringSeparator);
			for (int i = 0; i < tab.length; i++) {

				if (i == 0)
					tab[i] = s.nextToken();
				else
					while (s.hasMoreTokens()) {
						tab[i] += stringSeparator + s.nextToken();
					}
			}
		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);

		}
		return tab;
	}

	private static String[] onlyTwoElementsBySplit(String str, char separator) {

		String sep = Character.toString(separator);
		String[] result = str.split(sep, 2);
		
		return result;
	}
}