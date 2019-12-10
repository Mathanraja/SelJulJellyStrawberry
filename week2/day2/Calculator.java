package week2.day2;

public class Calculator {

	public void add(int x, int y) {

		System.out.println(x + y);

	}

	public void add(double x, double y) {
		System.out.println(x + y);

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(10, 20);

		// calc.add(10, 20, 30);

		calc.add(25.35, 55.45);

		calc.add(10, 20, 30);

	}

	public void add(int a, int b, int c) {

		System.out.println(a + b+c);

	}

}
