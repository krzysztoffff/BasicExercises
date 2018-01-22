package tables;


import java.util.Random;

public class Main2 {

    public static void main(String[] args) {
    	
    	int [] tab = createTable();
    	displayTab(tab);
    	int min;
    	min = min(tab);
    	System.out.println("\nminimum is: " + min);
    
    	
        

    }
    
    static int[] createTable(){
    	int [] tab = new int [20];
    	Random r = new Random();
    	for(int i = 0; i < tab.length; i++){
    		tab[i] = r.nextInt(101);
    	}
    	return tab;
    	
    }
    
    static void displayTab(int[] tab){
    		System.out.print("Numbers: ");
    	for (int i = 0; i < tab.length; i++){
    		System.out.print(tab[i] + " ");
    	}
    }
    static int min (int[] tab){
    	int min = tab[0];
    	for (int number : tab){
    		if(number<min){
    			min = number;
    		}
    		
    	}
    	return min;
    	
    }
}
