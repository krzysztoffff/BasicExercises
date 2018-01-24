package signs2;


public class Main2 {

    public static void main(String[] args) {

    String str = "Z Coders Lab niezale¿nie od wykszta³cenia mo¿esz zmieniæ swoj¹ karierê." +
            " Jesteœmy szko³¹ oferuj¹c¹ bardzo intensywne kursy programowania." +
            " Przygotujemy Ciê do pracy na stanowisku junior web developera i pomo¿emy znaleŸæ zatrudnienie po kursie. ";
    	String sentencesWithutSpacesAfterDots = str.replaceAll("[.][ ]", "."); //pozbywam siê spacji po kropuniach
    	String [] zdaniaTab = sentencesWithutSpacesAfterDots.split("[.]");  // dzia³a \\. oraz [.] wyrazenia regularne. Spacja te¿ ¿eby siê nie wyœwietla³a
    	for (String zdanie : zdaniaTab){//zdania to sentences
    		System.out.println(zdanie+".");
    	}
    }
}
