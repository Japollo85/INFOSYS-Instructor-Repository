package com.mercy.javatraining.computations;

public class App {

	public static void main(String[] args) {

		int a = 10;
		if (a > 9) {
			System.out.println("Hello World!!");
		} else {
			System.out.println("I am not saying hello yet");
		}

		for (int i = 0; i < a; i++) {
			System.out.println(i);
		}
		int i = 0;
		while (i < a) {
			System.out.println(i);
			i++;
			if (i == 5) {
				break;
			}
		}

		i = 0;

		do {
			System.out.println("I am priting this :" + i);
			i++;
		} while (i < a);

	}

}
