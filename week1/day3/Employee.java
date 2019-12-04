package week1.day3;

public class Employee {
	
	int empId;
	String empName;
	boolean empStatus;
		
	Employee(){
		this(100,"Hari");
		System.out.println("default constructor");
	}
	
	Employee(int id,String empName){
		/*int x=10;
		int y=20;
		System.out.println(x+y);*/
		//this();
		empId = id;
		this.empName= empName;
	}
	
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(100,"Hari");
		//Employee emp1 = new Employee();
		
		System.out.println(emp.empId);
		System.out.println(emp.empName);
		System.out.println(emp.empStatus);
		
		
		
		
		
		

	}

}
