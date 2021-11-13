package javaConcepts.basics;

public class ClassObject {
//  variables - Instance variables(global variable), local variables
	String mainObj = "Mobile";
	float screenSize;
	int resolution;
	int memory;
	String brandName;
	char logo;
	boolean isTouch;

	// signature : AccessSpecifiers returnType methodName ()-arguments {method body}
	// AccessSpecifiers : define the visibility of the method
	// public : 
	// private :
	// protected : reserve until oops
	// package/default :
	public void makeCalls() {
		// local variables - scope - within method
		String str  = " Making calls";
		System.out.println("make calls");
		System.out.println(str);
	}

	private void payBills() {
		System.out.println(" Bills paid");
	}

	protected void textMsg() {
	//	brandName = "Samsung";
		System.out.println(" texting a msg");
	}

	public void viewGallery() {
		System.out.println(" Viewing gallery");
	}

	// main()
	// create object
	// call through the objects
	
	public static void main(String[] args) {
		
		// Instantiate, creating an instance
		// className objectName = new constructor();
		
		ClassObject samsung = new ClassObject();  // memeory is  allocated ( empty)
	//	samsung.brandName = "galaxy";
	//	samsung.logo = 'S';
	//	samsung.memory = 126;
		samsung.resolution = 1028;
		System.out.println(" samsung brand: " + samsung.brandName);
		System.out.println(" samsung memory: " + samsung.memory);
		System.out.println(" samsung logo" + samsung.logo);
		System.out.println(" samsung isTouch" + samsung.isTouch);
		
		
		samsung.payBills();
		
		ClassObject apple = new ClassObject();
		apple.brandName = "apple";
		apple.logo = 'A';
		apple.memory = 1023;
		apple.resolution = 234;
		System.out.println(" Apple brand: " + apple.brandName);
		apple.payBills();
		
	//	ClassObject vivo = new ClassObject();
		
	}

}
