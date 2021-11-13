package javaConcepts.basics;

public class LearnForLoop {
	// why: 
	
	public static void main(String[] args) {
		
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		
	// 	
		for (int i = 5; i <= 10; i++) {
		//	System.out.println("1");
			System.out.println(i);
		}
		// i++ --> i = i+1;
		// i=0; 0 <= 3 (true); excute the code --> print 0; i=1
		// i=1; 1 <= 3 (true); excute the code --> print 1; i=2
		// i=2; 2 <= 3 (true); excute the code --> print 2; i=3
		// i=3; 3 <= 3 (true); excute the code --> print 3; i=4
		// i=4; 4 <= 3 (flase); exit the loop

	}
}
