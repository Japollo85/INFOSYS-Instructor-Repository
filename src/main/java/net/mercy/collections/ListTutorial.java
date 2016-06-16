package net.mercy.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTutorial {
	
	
	static List<String> arrayList = new ArrayList<String>();
	public static void main(String[] args) {
		arrayList.add("Honda");
		arrayList.add("Toyota");
		arrayList.add("Nissan");
		dataLoader();		
	}
	
	
	public static void dataLoader(){
		
		TestLists tl = new TestLists();
		tl.loadList(arrayList);
		
		for(String s:arrayList){
			System.out.println("here "+s);
		}
		
		

	}

}



