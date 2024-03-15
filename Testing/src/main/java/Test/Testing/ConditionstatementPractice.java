package Test.Testing;

public class ConditionstatementPractice {


	public static void main(String[] args) {

		String name="Kumar";
		/*
		 * if(name=="Ravi"){ System.out.println("name is ravi"); } else if
		 * (name=="Kumar") { System.out.println("name is kumar"); } else {
		 * System.out.println("nothing"); }
		 */
		switch (name) {
		case "Karthcik":
			System.out.println("The name is Karthick");
			break;
		case "Ravi":
			System.out.println("The name is Ravi");
			
		case "Kumar":
			System.out.println("The name is Kumar");
			break;
		case "Kannan":
			System.out.println("The name is Kumar");
		default:
			System.out.println("Print nothing");
			break;
		}
	}
}