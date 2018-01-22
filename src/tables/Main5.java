package tables;

import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {
    	
    	int numbers [] = {1, 43, 2, 454, 4, 56};
    	numbers = sort(numbers);
    	System.out.println(Arrays.toString(numbers));
        

    }
    
    static int [] sort (int [] arr){
    	Arrays.sort(arr);
    	return arr;
    	
    	
    	
    }
}
