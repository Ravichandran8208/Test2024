package Test.Testing;

import java.io.IOException;

public class Exceptionhandling {
	
	public static void main(String[] args) {
		int n1;
		
		try {
			n1=40%10;
			System.out.println(n1);
//			System.exit(0);
			
		} catch (ArithmeticException e) {
			System.out.println("Exception handled");
			n1=40%10;
			System.out.println(n1);
			e.printStackTrace();
		}
		
		catch (Exception e) {
			System.out.println("Exception handled");
			n1=40%10;
			System.out.println(n1);
			e.printStackTrace();
		}
		
		finally {
			System.out.println("DB connection has to close");
		}
		
	}

}
