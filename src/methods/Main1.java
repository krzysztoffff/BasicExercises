package methods;

public class Main1 {

	public static void main(String[] args) {
		int number = 2;
		int result = square(number);

		System.out.println(number + " ^ 2 = " + result);

	}

	static int square(int num) {

		int result = num * num;
		return result;

	}

}
