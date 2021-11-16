package javaConcepts.basics;

public class changeToUpperCaseOddIndexWord {

	public static void main(String[] args) {
		
		String str = "Have a good day always";
		//Have A good DAY always
		// step 1 : use split()- string array
		// step 2 : find the odd index - change the case
		
		String[] splitArr = str.split(" ");
		
		for (int i = 0; i < splitArr.length; i++) {
			
			if(i%2 != 0 ) { // check if the index is odd
				String upperCase = splitArr[i].toUpperCase();
				System.out.print(upperCase + " ");
			}
			else { // even indexed word( requires no change)
				System.out.print(splitArr[i] + " ");
			}
		}
	}
}
