package javaConcepts.basics;

public class FindDuplicates {
	
	public static void main(String[] args) {
		int arr1[] = { 5,6,7,8,9};
		int arr2[] = { 7,9,10,11,8};
		
		for (int i = 0; i < arr1.length; i++) {
			// index = 0
			//index = 1
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}
