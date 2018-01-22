package methods;

public class Main3 {
	private static final double USD = 4.04;

	public static void main(String[] args) {
		double zlote = 5;
		double resoult = convertToUsd(zlote);
		System.out.println(zlote + " z³otych to " + resoult + " USD");

	}

	static double convertToUsd(double zlotys) {

		double result = zlotys / USD;
		return result;
	}
}
