package javaConcepts.basics;

import java.util.Arrays;
import java.util.Iterator;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int intArr[] = {12,13,100,24,35,36,45,56};
		//sort the array
		// ascending order
		System.out.println("Before sorting array");
		for (int i = 0; i < intArr.length; i++) {
			System.out.println("intArr["+i+"]: " + intArr[i]);	
		}
		Arrays.sort(intArr);
		System.out.println("Sorted array");
		for (int i = 0; i < intArr.length; i++) {
			System.out.println("intArr["+i+"]: " + intArr[i]);
		}
		
		// print the last element of the array( largest)
		System.out.println(" Largest value:" + intArr[intArr.length-1]);
		
		// SecondLargestNumber
		System.out.println(" Second Largest value:" + intArr[intArr.length-2]);
		
		// Smallest value
		System.out.println(" Smallest value:" + intArr[0]);

	}
}
