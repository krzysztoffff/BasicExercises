package signs2;

public class Main1 {

	public static void main(String[] args) {

		String str = "Naucz si� programowa� od podstaw i zacznij wymarzon� karier� w bran�y IT.";
		String[] words = str.split(" ");
		for (String word : words){
			System.out.println(word);
		}

	}
}
