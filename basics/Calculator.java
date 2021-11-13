package javaConcepts.basics;

public class Calculator {
	// 1. add
	// 2. subtraction
	// this program explains the usage of the arguments and the return values
	// STATIC : we dont have to craete an object for this
	
	 String str = " calculator";
	
	public static void add() {
		int x = 10, y = 12;
		int z = x + y;
		System.out.println(" Addition : " + z);
	}
	public void add1(int x, float y) {
		float sum = x + y;
		// 5 + 0.5 = 5.5
		System.out.println(" sum of the two inputs :" + sum);
	}
	public int addReturn() {
		int x = 20, y = 12;
		int z = x + y;
		return z;
	}
	public float addReturnArgs(int x, float y, int z) {
	//	int sum = (int) (x+y+z); //type casting
		float sum = x+y+z;
		System.out.println(" ");
		return sum;
		//return 5.6f;
	}
	public static void main(String[] args) {

		Calculator calc = new Calculator();
		add();
		calc.add1(5, 0.5f);
		
		int result = calc.addReturn();
		System.out.println(" result :" + result);
		
		int addReturn = calc.addReturn();
		
		float resultArgs = calc.addReturnArgs(10, 20.23f, 30);
		System.out.println(resultArgs);
		
		System.out.println(calc.str);
		

	}

}
