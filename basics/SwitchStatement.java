package javaConcepts.basics;

public class SwitchStatement {

	public static void main(String[] args) {
		int day = 9;
		// scanner 
		// expression
		int a =2, b=2;
		String str = "Monday";
		switch (str) {
		case "Monday":
			System.out.println(" Monday");
			break;
		case "Tue":
			System.out.println("Tuesday");
			break;
	/*	case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;*/
		default:
			System.out.println(" Its an invalid day");
			break;
		}

	}

}
