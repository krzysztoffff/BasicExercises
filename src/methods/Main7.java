package methods;


public class Main7 {

    public static void main(String[] args) {
    	
    	int liczba = 3;
    	String check1 = checkEven(liczba);
    	System.out.println(check1);
        

    }
    
    static String checkEven(int number){
    	if (number % 2 == 0){
    		return "even";
    	}
    	return "odd";
    }
}
