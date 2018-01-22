package methods;


public class Main2 {

    public static void main(String[] args) {
    	int number1 = 21, number2 = 3;
    	int result = multiply(number1, number2);
    	System.out.println(number1+" * "+number2+" = "+result);
        System.out.println(multiply(number1, number2));

    }
    
    static int multiply(int multipler, int index){
    	int result = multipler * index;
    	return result;
    }
}
