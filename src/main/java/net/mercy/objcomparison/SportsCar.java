package net.mercy.objcomparison;

import net.mercy.constructors.Car;

public class SportsCar extends Car {
	private int doors;
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof SportsCar) {
			if (super.equals(obj)) {
				SportsCar sc = (SportsCar) obj;
				return this.doors == sc.doors;
			}
		}
		return super.equals(obj);
	}

}
