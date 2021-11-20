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
		
		// 3. Second occurence index of the character
		int indexOf2 = testStr.indexOf('e', indexOf+1);
		
		System.out.println(" Second Index of e:" + indexOf2);
		// 4. third occurence
		
		int indexOf3 = testStr.indexOf('e', indexOf2+1);
		System.out.println(" Third Index of e:" + indexOf3);
		
		
		// 5. Finding a character giving its position(index)
		char charAt = testStr.charAt(3);
		System.out.println(" Character at that position: " + charAt);
		
		//  6. Welceoeme
		System.out.println(testStr);
		for (int i = 0; i < testStr.length(); i++) {
			System.out.println("charAt["+i+"]: " + testStr.charAt(i));
		}
		
		// 7. Converts this string to a new character array.
		char[] charArray = testStr.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("charArray["+i+"]: " + charArray[i]);
		}
		System.out.println(charArray[5]);
		// 8. split the string into words
				String strTest1 = "Have-a-good-Day";
	//	String[] strArray = strTest1.split("a");
		String[] strArray = strTest1.split("-");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("strArray["+i+"]: " + strArray[i]);
		}
		
		
		//9. get only the integers from the string 
		// regular expression  RegEx 
		// d--> integers
		// D --> non-integers
		String testStr3 = "34TN01ABCD";
		// op --> 3401
		String replaceAll = testStr3.replaceAll("\\D", "");
		System.out.println(replaceAll);
		
		//11. get only the non integers from the string 
		// op--> TNABCD
		String replaceAll2 = testStr3.replaceAll("\\d","");
		System.out.println(replaceAll2);
		
		// Registration done successfully - RE00986
		// purchase amount --> 11,499 - will get only as a string 
		String purVal = "Rs.11,499/";
		//int purValInt = 11499;
		// add 100 rs
		// see if it is less than 10000 
		String purValReplaced = purVal.replaceAll("\\D", "");
		System.out.println(" purValReplaced: " + purValReplaced);
		// 11499 --> String
		
		// 11499A
		// NumberFormatException
		// 12. convert the string to integers
		
		int parseInt = Integer.parseInt(purValReplaced);
		System.out.println(" Converted purValReplaced: " + parseInt);
		
		int sum = parseInt+100;
		System.out.println(sum);
		
		//13. replace
		String replace = testStr1.replace('l', 'L');
		System.out.println(" replaced L:" + replace);
		
		// 14. to get a part of the string
		// Good day
		String testStr4 = "Good day always";
		String substring = testStr4.substring(5);
		System.out.println("substring : " + substring);
		// startIndex-inclusive, stopIndex-exclusive
		System.out.println(testStr4.substring(5,8)); // day
		
		String amount = "Rs.100053656";
		String cost = amount.substring(3);
		System.out.println(cost);
		
		// 15. Concatenation
		String concatStr1 = "Hi";
		String concatStr2 = " Hello";
		
		System.out.println(" Concatenated output:" + concatStr1.concat(concatStr2));
		
		System.out.println(concatStr1 + concatStr2 + " " + concatStr1 + concatStr2);
		
		// sheriba
		// *SHERIBA*
		
		System.out.println("*"+"concatStr2"+"*");
		
		int num = 100;
		System.out.println(concatStr1 + num);
		String intStr = "100";
		
		System.out.println(intStr + num); // 100100
		
		int num2 = 200;
		System.out.println(num2 + num); // 300
		
		// 16. String comparison
		
		String strComp1 = "ABC";
		String strComp2 = "ABC";
		// strComp1 --> m1
		// strComp2 --> m1
		boolean equals = strComp1.equals(strComp2); // true or false
		// equals() -- content of the string
		if (strComp1.equals(strComp2)) {
			System.out.println(" same string");
		}
		else
			System.out.println(" Different strings");
		
		// == --> compares the memory location 
		if(strComp1==strComp2) {
			System.out.println(" using == same string");
		}
		else {
			System.out.println("using == Different strings");
		}
		
		String strComp3 = new String("ABC"); 
		String strComp4 = new String("ABC");
		// strComp3 m2
		// strComp4 m3
		
		// == --> compares the memory location 	
		if(strComp3==strComp4) {
			System.out.println(" using new keyword == same string");
		}
		else {
			System.out.println("using new keyword== Different strings");
		}
		
		// 17. if a part of the string is present in another string
		String strComp6 = "Hi hello";
		String strComp5 = "Hi";
		
		boolean contains = strComp6.contains(strComp5);
		System.out.println(contains);
	

	}

}
