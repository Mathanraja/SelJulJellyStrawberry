package week2.day2;

public class Employee {

	public void findEmployee(String name, int id) {

		System.out.println(name + " " + id);

	}

	public void findEmployee(int phno, String email) {

		System.out.println(phno + " " + email);

	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.findEmployee(131231, "hari@gmail");
		emp.findEmployee("Hari", 3432);
		
	}

}
