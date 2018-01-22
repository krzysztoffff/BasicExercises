package tables;

import java.util.Arrays;

public class Main6 {

	public static void main(String[] args) {
		int[] numbers = { 2, 3, 4 };
		int[] secondNumbers = { 2, 4, 5 };
		int[] sum1 = sumTable(numbers, secondNumbers);
		//nie System.out.println(sum1) bo krzaki. musi być Arrays.toString
		System.out.println(Arrays.toString(sum1));

	}

	static int[] sumTable(int[] arr1, int[] arr2) {
		int[] sumTable = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			sumTable[i] = arr1[i] + arr2[i];
		}
		return sumTable;
	}
}
