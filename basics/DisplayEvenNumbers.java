package javaConcepts.basics;

public class DisplayEvenNumbers {
// problem statement: display only the even numbers between 0 to 30
// 0,2,4,6,8,10....
// use continue

	public static void main(String[] args) {

		// reminder != 0 (odd) -- skip
		for (int i = 0; i <= 30; i++) {
			if (i % 2 != 0) // odd
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
