package net.mercy.annotations;

@MyAnnotation(name = "hello", hiredDate = "333", salary = 10000)
public class MyClass {

	private String name;
	private String hiredDate;
	private int salary;

	public String getName() {
		return name;
	}

	public void setUsername(String username) {
		this.name = username;
	}

	public String getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(String hiredDate) {
		this.hiredDate = hiredDate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
