package signs;

public class Main7 {

	public static void main(String[] args) {

		String sentence = "CodersLAb";
		String search = "Cod";

		System.out.println(containsStr(sentence, search));
	}
	
	
	static boolean containsStr(String sentence, String search) {
		
		return sentence.contains(search);
	}

}
