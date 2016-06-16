package com.mercy.innerclasses;

public class AnonymousInnerClass {

	public void computeAverage() {
		class ComputeAverage implements AnonymousInnerInterface {
			public void computeAverage(String[] numbers) {
				double i = 0;
				for (String number : numbers) {
					i = i + Double.parseDouble(number);
				}
				System.out.println("Average is : " + i / numbers.length);
			}
		}

		AnonymousInnerInterface aii = new AnonymousInnerInterface() {
			public void computeAverage(String[] numbers) {
				double i = 0;
				for (String number : numbers) {
					i = i + Double.parseDouble(number);
				}
				System.out.println("Average is : " + i / numbers.length);
			}
		};

		aii.computeAverage(new String[] { "3", "5", "7" });
		aii = new ComputeAverage();
		aii.computeAverage(new String[] { "2", "3", "4" });
	}

}
