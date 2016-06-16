import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CommandLineInput {
	
	public static void main(String[] args) {

		
		System.out.println("What is your name : ");
		   
		try{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    int s = Integer.parseInt(bufferRead.readLine());
		    
		    System.out.println(s);
		    System.out.println("What is your age");
		    
		    //s = bufferRead.readLine();
		    //System.out.println(s);
		    
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
