package methods;


public class Main8 {

    public static void main(String[] args) {
    	int e = 10, f = 20, g = 30;
    	int max = maxOfThree(e, f, g);
    	System.out.println(max);
        

    }
    
    static int maxOfThree(int a, int b, int c){
    	int max;
    	if(a>b && a>c){
    		max = a;
    	}else if(b>a && b> c){
    		max = b;
    	}else{
    		max = c;
    	}
    	return max;
    }
}
