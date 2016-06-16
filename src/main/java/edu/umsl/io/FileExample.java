package edu.umsl.io;

import java.io.File;

public class FileExample {
	public static void main(String[] args) {
		File filesDirectory = new File("/Users/apande1/Documents/Software Development/filesExample");
		File[] files = filesDirectory.listFiles();
		for(File file:files){
			System.out.println(file.getName());
		}	
	}
}
