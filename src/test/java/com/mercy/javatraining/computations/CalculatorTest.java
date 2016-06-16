package com.mercy.javatraining.computations;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int a = calc.add(2, 3);
		assertEquals(5, a);
	}

}
