package Test.Testing;

import java.io.IOException;

public class OriginalCar {
	
	public void Engine() {
		System.out.println("engine");

	}
	 public  void FourWheel() throws IOException {
		System.out.println("Car should have four wheels");

	}
     public void  Engine(BMW Twostroke){
    	 System.out.println("engine has two strokes");
		 
	 }
     public	void  Engine (OriginalCar FourStroke) throws IOException{
    	 System.out.println("engine has Four strokes");
		 
	 }
	 public static void main(String[] args) throws IOException {
		 OriginalCar obj = new OriginalCar();
		obj.Engine();
		
		BMW BMWobj = new BMW();
		obj.Engine(BMWobj);
		obj.Engine(obj);
	}

}
