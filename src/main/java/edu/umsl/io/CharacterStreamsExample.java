package edu.umsl.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharacterStreamsExample {
	public static void main(String[] args) {
		writeToFile(args);
		readFromFile();
	}

	static void writeToFile(String[] args) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter("writecharstream.txt"));
			for (String s : args) {
				pw.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}

	static void readFromFile() {
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader("writecharstream.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
