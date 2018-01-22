package tables;

import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        
    	int rev [] = new int [10];
    	rev = createTab();
    	System.out.println(Arrays.toString(rev));
    }
    static int [] createTab(){
    	int numbers [] = {1, 5, 8, 6, 4, 3, 5, 81, 8, 32};
    	int reverse [] = new int [10];
    	for (int i=0; i<numbers.length; i++){
    		reverse [i] = numbers[numbers.length -i - 1];
    		//int j = reverse.length - 1;
    		//reverse[j] = numbers[i];
    		//j--;
    	}
    	
    	return reverse;
    	
    	
    }
}
