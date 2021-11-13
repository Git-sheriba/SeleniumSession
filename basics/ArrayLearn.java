package javaConcepts.basics;
import java.util.BitSet;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayLearn {
	
	public static void main(String[] args) {
		
		char charArr[] = {'a','e','r','e'};
		
		int intArr[] = {12,13,24,35,36,45,56,100};
		// intArr[index]
		
		//first element
		System.out.println(" first element: " + intArr[0]);
		//Second element
		System.out.println(" Second element: " + intArr[1]);
		// length of an array
		// number of elements
		int lengthArr = intArr.length;
		System.out.println(" Length of the array:" + lengthArr);
		// i =0 to i = 6
		// intArr[6]
		for (int i = 0; i <= intArr.length-1; i++) {
			System.out.println("intArr["+i+"]: " + intArr[i]);
		}
    	//ArrayIndexOutOfBoundsException
	//	System.out.println(intArr[-1]);
		
		// access the last element
		System.out.println(" The last element: " + intArr[lengthArr-1]);
		
		
		// to fing the index of an element in an array
				BitSet indexesOf = ArrayUtils.indexesOf(intArr, 35);
		System.out.println(indexesOf);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
