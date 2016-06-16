package net.mercy.objcomparison;

public class App {
	
	public static void main(String[] args) {
		OverrideToString ots = new OverrideToString();
		ots.setFname("test");
		ots.setLname("test1");
		System.out.println("name is "+ots.toString());
	}

}
