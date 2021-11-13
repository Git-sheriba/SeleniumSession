package javaConcepts.basics;

public class ContinueStatement {

	public static void main(String[] args) {
	for (int i = 0; i <= 5; i++) {
		
			if (i == 3) {
				//System.out.println(" Inside if");
				continue; //skip
			}
			System.out.println(i);
		}
		
		System.out.println(" Out for loop");
		System.out.println(" other statements in my mthd");

	}

}
