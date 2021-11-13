package javaConcepts.basics;

public class MyMobile {
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

	// Return Type:
	// void - empty/nothing
	
	// methodName : CamelCase
	
	// () : arguments
	
	public void makeCalls() {
		// local variables - scope - within method
		String str = " Making calls";
		System.out.println("make calls");
		System.out.println(str);
	}

	public float getAlarmTime() {
		float time = 8.00f;
		System.out.println(" Alarm time is 8.00 pm");
		return time;
	}
	
	public void printSMS(String sms) {
		System.out.println(" sms:" + sms);
	}

	private void payBills() {
		System.out.println(" Bills paid");
	}

	public void textMsg() {
		// brandName = "Samsung";
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

		MyMobile obj = new MyMobile(); // memeory is allocated ( empty)
		float alarmTime = obj.getAlarmTime();
		obj.printSMS("Hi");
		System.out.println(" alarm time + " + alarmTime);
	}
}
