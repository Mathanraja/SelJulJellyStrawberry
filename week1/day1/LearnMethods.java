package week1.day1;

public class LearnMethods {

	// Syntax to write a method

	// AccessModifier returnType methodName(args)

	public int addNumbers(int a, int b) {
		int c = 0;
		c = a + b;
		return c;

	}

	public void subTwoNumber() {

	}

	private void multiply(int a, int b) {
		System.out.println(a * b);
	}
	
	
	void divide() {
		System.out.println("Divide method");
	}
	
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// Creating obj for a class
		// ClassName Obj = new constructor;

		LearnMethods obj = new LearnMethods();
		// TO call a method from a class
		// object.methodName();

		obj.multiply(5, 4);
		obj.divide();
		
		int solution = obj.addNumbers(100, 200);
		System.out.println(solution);
		
		
		sum(5, 6);
		
		
		
		
		
		
		
		
		
		
	}

}
