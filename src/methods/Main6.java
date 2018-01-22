package methods;


public class Main6 {

    public static void main(String[] args) {
        int age = 16;
        boolean isMaturity = checkMaturity(age);
        System.out.println(isMaturity);

    }
    static boolean checkMaturity(int age){
    	if (age >= 18){
    		return true;
    	}
    	return false;
    	
    }
}
