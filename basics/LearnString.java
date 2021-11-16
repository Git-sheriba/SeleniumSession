package javaConcepts.basics;

public class LearnString {

	public static void main(String[] args) {
		// object creation
		
		//1. intialising a string using literals(data)
		String testStr = "Welceoeme";
		
		//2. intialising a string using new keyword
		String testStr1 = new String();
		testStr1 = "Hello";
		
		String testStr2 = new String("Good day");
		
		// 1. Length 
		int lengthStr = testStr.length(); // method
		System.out.println(" Length of the string:" + lengthStr);
	//	int lengthArr = intArr.length; //property
		
		// 2. find the position of the first occurence character
		int indexOf = testStr.indexOf('e');
		System.out.println(" Index of e:" + indexOf);
		
		int lastIndexOf = testStr.lastIndexOf('e');
		System.out.println(" Last Index of e:" + lastIndexOf);
		
		// Second occurence index of the character
		int indexOf2 = testStr.indexOf('e', indexOf+1);
		
		System.out.println(" Second Index of e:" + indexOf2);
		// third occurence
		
		int indexOf3 = testStr.indexOf('e', indexOf2+1);
		System.out.println(" Third Index of e:" + indexOf3);
		
		
		// Finding a character giving its position(index)
		char charAt = testStr.charAt(3);
		System.out.println(" Character at that position: " + charAt);
		
		//  Welceoeme
		System.out.println(testStr);
		for (int i = 0; i < testStr.length(); i++) {
			System.out.println("charAt["+i+"]: " + testStr.charAt(i));
		}
		
		// Converts this string to a new character array.
		char[] charArray = testStr.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("charArray["+i+"]: " + charArray[i]);
		}
		System.out.println(charArray[5]);
		
		// 
		String strTest1 = "Have-a-good-Day";
	//	String[] strArray = strTest1.split("a");
		String[] strArray = strTest1.split("-");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("strArray["+i+"]: " + strArray[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		

	}

}
