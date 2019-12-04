package week1.day3;

public class EmployeeDetails {

	int empId;

	String empName;

	static String company;

	public void setData(int id, String name, String comp) {
		empId = id;
		empName = name;
		company = comp;

	}

	public void printData() {
		System.out.println(empId + " " + empName + " " + company);

	}

	public static void main(String[] args) {
		EmployeeDetails emp1 = new EmployeeDetails();

		emp1.setData(100, "Hari", "Testleaf");

		

		EmployeeDetails emp2 = new EmployeeDetails();

		emp2.setData(200, "Prasad", "Testleaf Software Solution");
		
		
		emp1.printData();

		emp2.printData();

	}

}
