package net.mercy.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("honda");
		lst.add("toyota");
		lst.add("nissan");

		Object[] strArray1 = lst.toArray();
		System.out.println(Arrays.toString(strArray1)); 
		String[] strArray2 = lst.toArray(new String[0]);
		strArray2[0] = "hyundai"; 
		System.out.println(Arrays.toString(strArray2)); 
		System.out.println(lst); 
	}

}
