package net.mercy.javatraining;

/*
 * A copy of the reference is sent. It is really a pass by value as the reference is copied
 * not the object
 * strBuilder and strBuilder1 are two 32bit reference variables that point to the same physical object
 * on the heap
 * */

public class PassByReference {
	
	public static void main(String[] args) {
		StringBuilder strBuilder = new StringBuilder("Mercy");
		System.out.println("String before changing "+strBuilder);
		ChangeStrings cs = new ChangeStrings();
		cs.changeStrings(strBuilder); //a copy of the reference is sent
		//changeIt(strBuilder);
		System.out.println("String after changing "+strBuilder);
	}
	
	static void changeIt(StringBuilder strBuilder1){
		
		strBuilder1.append(" Hospital");
		
	}

}
