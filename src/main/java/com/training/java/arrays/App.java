package com.training.java.arrays;

import java.util.Arrays;

public class App {

	public static void main(String args[]) throws Exception {
		int array[] = { 4, 5, 6, -1, 2, 3, 2, -1, 3, 9, 7, -2 };
		Arrays.sort(array);
		printArray("Sorted array", array);
		int index = Arrays.binarySearch(array, 3);
		System.out.println("Found 3 @ index : " + index);
		array = insertElement(array, 8, array.length+3);
		printArray("Array with new element", array);
	}

	private static void printArray(String message, int array[]) {
		System.out.println(message + ": [length: " + array.length + "]");
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}

	private static int[] insertElement(int original[], int element, int index) {
		int length = original.length;
		int destination[] = new int[length + 1];
		System.arraycopy(original, 0, destination, 0, index);
		destination[index] = element;
		System.arraycopy(original, index, destination, index + 1, length - index);
		return destination;
	}

}
