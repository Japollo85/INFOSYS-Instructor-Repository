package edu.umsl.annotations;


@EmployeeAnnotation(name="Hello",salary=100000,dob="1552005")
public class Employee {

	private String name;
	private String dob;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
