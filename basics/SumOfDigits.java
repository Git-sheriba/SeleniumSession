package javaConcepts.basics;

public class SumOfDigits {
// problem statement : Calculate the sum of the digits
// 123 : 1+2+3 = 6

	public static void main(String[] args) {

		int num = 12345;
		int quotient = 0, reminder, sum = 0;
		while (num != 0) {
			quotient = num / 10;
			reminder = num % 10;
			sum = sum + reminder;
			num = quotient;
		}
		System.out.println(" result :" + sum);
	}
}




