package signs;

public class Main6 {

    public static void main(String[] args) {
    	String word = "ra";
    	System.out.println(firstHalf(word));
    }

    static String firstHalf(String str){
    	
        return str.substring(0, str.length() /2);//str.length zwraca liczby ca³kowite zaczyna od 1
        //substring zwraca litery od 0 w³¹cznie do nr indeksu nie w³¹czaj¹c go.
    }
}
