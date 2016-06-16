package net.mercy.exceptions;

public class Car {
	
	int tirePressure;
	
	public int getTirePressure() {
		return tirePressure;
	}

	public void setTirePressure(int tirePressure) {
		this.tirePressure = tirePressure;
	}

	public void drive() throws FlatTireException{
		if(tirePressure < 10){
			throw new FlatTireException("Tire pressure: "+tirePressure);
		}else{
			System.out.println("Tire Pressure is : "+tirePressure);
		}
	}
}
