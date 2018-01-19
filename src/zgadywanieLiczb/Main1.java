package zgadywanieLiczb;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(101);
		int answer = -1;

		Scanner scan = new Scanner(System.in);
		while (number != answer) {
			System.out.println("Zgadnij liczb� od 0 do 100");

			try {
				answer = scan.nextInt();
				if (answer > number) {
					System.out.println("Za du�o!");
				} else if (answer < number) {
					System.out.println("Za ma�o!");
				}
			} catch (InputMismatchException e) {
				System.out.println("To nie jest liczba!");
				scan.nextLine();// scanera do nowej lini nie int żeby while
								// wiedziało co robić debuger
			}

		}
		System.out.println("Zgad�e�!");
		scan.close();

	}

}