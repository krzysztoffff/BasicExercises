package signs2;


public class Main2 {

    public static void main(String[] args) {

    String str = "Z Coders Lab niezale�nie od wykszta�cenia mo�esz zmieni� swoj� karier�." +
            " Jeste�my szko�� oferuj�c� bardzo intensywne kursy programowania." +
            " Przygotujemy Ci� do pracy na stanowisku junior web developera i pomo�emy znale�� zatrudnienie po kursie. ";
    	String sentencesWithutSpacesAfterDots = str.replaceAll("[.][ ]", "."); //pozbywam si� spacji po kropuniach
    	String [] zdaniaTab = sentencesWithutSpacesAfterDots.split("[.]");  // dzia�a \\. oraz [.] wyrazenia regularne. Spacja te� �eby si� nie wy�wietla�a
    	for (String zdanie : zdaniaTab){//zdania to sentences
    		System.out.println(zdanie+".");
    	}
    }
}
