package signs2;

import java.util.StringTokenizer;

public class Main3 {

	public static void main(String[] args) {
		String sentence = "Ala ma kota kot ma ale";
		char findCharacter = 'a';
		System.out.println(countToken(sentence, findCharacter));
		
		
    	
    	
	}

	private static int countToken(String sentence, char findCharacter) {
		String sentenceWithoutSpaces = sentence.replaceAll("[ ]", ""); // pozbywam siê spacjuni. Zajdujê je regexem,
																		// zamieniam na nic.
		int counter = 0;
		for (int i = 0; i < sentenceWithoutSpaces.length(); i++) {
			if (sentenceWithoutSpaces.charAt(i) == findCharacter)
				counter++;
		}
		return counter;
	}
	

}
