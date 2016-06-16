package edu.umsl.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromFile {
	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("file.dat");//created the low level stream
			dis = new DataInputStream(fis);//created high level stream
			int integer1 = dis.readInt();
			double double1 = dis.readDouble();
			boolean b = dis.readBoolean();		
			System.out.println(integer1+" and "+double1+" and "+b+" and "+ dis.readUTF());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
