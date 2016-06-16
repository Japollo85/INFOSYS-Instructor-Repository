package net.mercy.interfaces;

public class App {
	public static void main(String[] args) {
		Car car = new Honda();
		car.speedUp(40);
		car = new Toyota();
		car.speedUp(50);
		
		PatientInfo pi = new PatientIntoImpl();
		pi.getCurrentMedications(345435);
	}
	
	

}
