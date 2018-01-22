package methods;


public class Main4 {

    public static void main(String[] args) {
    	String name = "Otis", surname = "Taylor", nickname = "otist";
    	String resoult = createName(name, surname, nickname);
    	System.out.println(resoult);
    	
   
        

    }
    static String createName(String name, String surname, String nickname){
    	String resoult = name + " \"" + nickname +"\" "+ surname;
    	return resoult;
    	
    }
}
