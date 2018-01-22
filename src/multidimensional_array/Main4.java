package multidimensional_array;

public class Main4 {

	public static void main(String[] args) {

		int[][] task4Array = { { 2, 3, 4, 6 }, { 12, 32, 12, 11 }, { 3, 2, 1, 4 }, { 5, 1, 6, 7 } };
		// macierz kwadratowa tylko macierz kwadratowa
		int sumS = 0;
		for (int i = 0; i < task4Array.length; i++) {
			sumS += task4Array[i][i];
		}
		// mo¿na te¿ zagnie¿d¿aæ pêtlê w pêtli i porównywaæ i z j ....
		System.out.println("Œlad macierzy " + sumS);
	}

}
