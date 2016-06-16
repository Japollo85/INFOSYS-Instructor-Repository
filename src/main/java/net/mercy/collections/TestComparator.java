package net.mercy.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestComparator {

	public static void main(String[] args) {
		// Use a customized Comparator for Strings
		Comparator<String> compStr = new StringComparator();
		
		// Sort and search an "array" of Strings
		String[] array = { "Hello", "Hi", "HI", "hello" };
	//	Arrays.sort(array);
	//	System.out.println(Arrays.toString(array));// [HI, Hello, Hi, hello]

		Arrays.sort(array, compStr);
		System.out.println(Arrays.toString(array)); // [Hello, hello, Hi, HI]
		//System.out.println(Arrays.binarySearch(array, "Hello", compStr)); // 1
		//System.out.println(Arrays.binarySearch(array, "HELLO", compStr)); // 1
																			// (case-insensitive)

		// Use a customized Comparator for Integers
		Comparator<Integer> compInt = new IntegerComparator();

		// Sort and search a "List" of Integers
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(42); // auto-box
		lst.add(21);
		lst.add(34);
		lst.add(13);
		Collections.sort(lst, compInt);
		System.out.println(lst); // [21, 42, 13, 34]
		System.out.println(Collections.binarySearch(lst, 22, compInt)); // 1
		System.out.println(Collections.binarySearch(lst, 35, compInt)); 
	}

	// Define a Comparator<Integer> to order Integers based on the least
	// significant digit
	public static class IntegerComparator implements Comparator<Integer> {

		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1 % 10 - o2 % 10;
		}

		// Define a Comparator<String> to order strings in case-insensitive
		// manner
		

	}
	
	public static class StringComparator implements Comparator<String> {
		public int compare(String s1, String s2) {
			return s1.compareToIgnoreCase(s2);
		}
	}

}
