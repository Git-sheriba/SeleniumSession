package javaConcepts.basics;

public class CharacterOccurence {
// Have a good day
// find how many times 'a' occurs
	
	// PSEUDO CODE:
	// 1. initialise a string "Have a good day:
	// 2. use for loop - charAT()
	// 3. if( see if the character is == 'a')
	// 4. increment count
	
	public static void main(String[] args) {
		String str = "Have a good day";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char charAt = str.charAt(i);
			if(charAt=='a') {
				count = count + 1;
			}
			// charAt(0) --> H
			// H == a (false) --> count --> 0
			
			// charAt(1) --> a
			// a == a ( true) --> count = 1
		}
		System.out.println(" Count of a:" + count);
	}
}
