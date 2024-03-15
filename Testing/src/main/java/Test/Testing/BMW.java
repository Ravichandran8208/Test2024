package Test.Testing;

import java.io.IOException;

public class BMW extends OriginalCar{
	
	public static void petrolEngine() {
		System.out.println("Able to run by petrol");

	}
	public static void diesolEngine() {
		System.out.println("Able to run by Diesol");

	}
	@Override
	public void FourWheel() throws IOException {
       System.out.println("Tyre brand should be MRF");		
	}
	
	public static void main(String[] args) throws IOException {
		petrolEngine();
		diesolEngine();
		OriginalCar objBMW = new BMW();
		
		objBMW.FourWheel();
	}

}
