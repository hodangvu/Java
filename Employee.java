package OOP;

public class Employee {
	int id, salary;
	String firstName, lastName;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getName() {
		return String.format("%s, %s" ,firstName, lastName);
	}
	public Employee(int id, int salary, String firstName, String lastName) {
		this.id = id;
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getAnnualSalary() {
		return salary * 12;
	}
	int raiseSalary(int percent) {
		return salary + salary * percent/100;
	}
	@Override
	public String toString() {
		return String.format("Employee [id=%d, salary=%d, firstName=%s, lastName=%s ]",
			id,firstName,lastName,salary);
	}
	
}
