package com.mercy.innerclasses;

public class OuterClass {
	public void computeAverage(String[] numbers){
		InnerClass inner = new InnerClass();
		inner.computeAverage(numbers);
	}
	public class InnerClass {
		public void computeAverage(String[] numbers) {
			double i = 0;
			for (String number : numbers) {
				i = i + Double.parseDouble(number);
			}
			System.out.println("Average is : " + i / numbers.length);
		}
	}
}
