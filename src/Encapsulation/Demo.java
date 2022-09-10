package Encapsulation;

public class Demo {
	//declaring the variable as private to acheive encapsulation
	private String name;
	private int age;
	private int EmployeeID;

	//setting gettes and setter method as public
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public static void main(String[] args) {
		Demo d = new Demo(); //creating the object for class
		
		d.setAge(26); //calling the setters
		d.setName("Suhas");
		d.setEmployeeID(123456);

		System.out.println("Employee name " + d.getName()); //calling the getters
		System.out.println("Employee age " + d.getAge());
		System.out.println("Employee ID " + d.getEmployeeID());

	}

}
