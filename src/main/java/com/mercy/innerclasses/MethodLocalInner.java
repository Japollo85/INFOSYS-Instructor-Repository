package com.mercy.innerclasses;

public class MethodLocalInner {
	public void computeAverage(String[] numbers){
		class ComputeAverage{
			public void computeAverage(String[] numbers){
				double i = 0;
				for (String number : numbers) {
					i = i + Double.parseDouble(number);
				}
				System.out.println("Average is : " + i / numbers.length);
			}
		}
		//Inner class is method local and needs to be instantiated inside the method to be accessed
		ComputeAverage computeAverage = new ComputeAverage();
		computeAverage.computeAverage(numbers);
	}

}
