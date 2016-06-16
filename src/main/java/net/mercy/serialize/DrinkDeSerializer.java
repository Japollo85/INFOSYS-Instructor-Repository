package net.mercy.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DrinkDeSerializer {
	public static void main(String[] args) {
		Drink d = null;
		ObjectInputStream in = null;
		
		try {
			in = new ObjectInputStream(new FileInputStream("/temp/drink.dat"));
			d = (Drink) in.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
