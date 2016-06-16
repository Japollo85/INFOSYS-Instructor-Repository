package edu.umsl.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoingFromStreamsToBytes {
	public static void main(String[] args) {
		BufferedReader reader = null;
		reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the book : ");
		try {
			String bookName = reader.readLine();
			System.out.println("Enter the price of the book");
			String price = reader.readLine();
			System.out.println("Book Name is : " + bookName + " and cost is : " + price);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
