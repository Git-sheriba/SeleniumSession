package javaConcepts.basics;

public class PrimeNumber {

	public static void main(String[] args) {

		int input = 13;
		int count = 0;

		int num = 20;

		for (int j = 2; j <= num; j++) {
			count = 0;
			for (int i = 1; i <= j / 2; i++) {
				if (j % i == 0)
					count = count + 1;
			}

			if (count == 1) {
				System.out.println(j + "is a prime number");
			} else
				System.out.println(j + "is not a prime number");
			System.out.println(" count :" + count);
		}
		//ArrayUtils

	}
}
