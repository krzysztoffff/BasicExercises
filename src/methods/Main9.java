package methods;


public class Main9 {

    public static void main(String[] args) {
        int n = 5;
        int f = factorial(n);
        System.out.println(f);

    }
    static int factorial(int n){
    	int i =1;
    	int f = 1;
    	for (i = 1; i <= n; i++){
    		f = f * i;
    	}
    	return f;
    }
}
