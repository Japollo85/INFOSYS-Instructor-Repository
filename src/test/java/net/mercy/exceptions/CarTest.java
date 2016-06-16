package net.mercy.exceptions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class CarTest {
	@Rule
	public ExpectedException thrownExcept=ExpectedException.none();
	@Test(expected=FlatTireException.class, timeout=1000)
	public void thisIsTestingBadArguments() throws FlatTireException{
		thrownExcept.expect(FlatTireException.class);
		thrownExcept.expectMessage("Tire Pressure");
		Car car = new Car();
		car.setTirePressure(0);
		car.drive();
	}
	
}
