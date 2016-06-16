package net.mercy.objcomparison;

public class Car {
	private int tires;
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub	
		if(obj instanceof Car){
			Car c = (Car) obj;
			return this.tires == c.tires; //equal if the same # of tires
		}
		return super.equals(obj);
	}

}
