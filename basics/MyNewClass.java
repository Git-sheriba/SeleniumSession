package javaConcepts.basics;

public class MyNewClass {
	  // naming convention: pascal case
	// Starts with upperCase 
	// no special characters except underScore
	// No spaces allowed
	// shortcut
	// cntrl+space
     	// execute
	// RightClick --> RunAs--> JavaApplication
	// cntrl + F11
	// RunAs PlayButton on the taskBar
	
	public static void main(String[] args) {
		//syso --> cntrl+space
		String str = " God is always good";
		System.out.println("Trust in God");
		System.out.println(str);
		
		Calculator calObj = new Calculator();
		
		Calculator.add();
		Calculator.str = "Hi";
		
		calObj.add1(2, 3);
		
		calObj.addReturnArgs(2, 3.5f, 3);
		
		
	}	
}
