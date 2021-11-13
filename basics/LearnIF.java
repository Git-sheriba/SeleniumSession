package javaConcepts.basics;

public class LearnIF {
// conditional statement
// Problem statement : check if the number is positive or negative or zero
	
	public static void main(String[] args) {
		int number = 0;
		// IF : condition : validated and should be true ( returns boolean)
		
		if (number>0) {
			System.out.println(" The number is positive");
		}
		else if (number<0)
			System.out.println(" The number is negative");
		else
			System.out.println(" Zero is my number");

	}
}
