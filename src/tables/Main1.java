package tables;

public class Main1 {

	public static void main(String[] args) {
		int[] tab = createTable();
		printTable(tab);

	}

	static int[] createTable() {
		int[] tab = new int[50];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = i;
		}
		return tab;

	}

	static void printTable(int[] tab) {
		int counter = 1;
		for (int i = 0; i < tab.length; i++) {
			int number = tab[i];
			String toDisplay = number + ", ";

			if (number < 10) {
				toDisplay = "0" + number + ", ";
			}

			if (counter == 10) {
				System.out.print(toDisplay + "\n");
				counter = 1;
			} else {
				System.out.print(toDisplay);
				counter++;
			}
		}
	}
}
