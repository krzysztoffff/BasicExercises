package signs;

public class Main6 {

    public static void main(String[] args) {
    	String word = "ra";
    	System.out.println(firstHalf(word));
    }

    static String firstHalf(String str){
    	
        return str.substring(0, str.length() /2);//str.length zwraca liczby ca�kowite zaczyna od 1
        //substring zwraca litery od 0 w��cznie do nr indeksu nie w��czaj�c go.
    }
}
