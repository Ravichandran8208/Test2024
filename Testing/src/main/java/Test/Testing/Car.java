package Test.Testing;

public class Car {

	String Car_Type;
	String Car_Brand;
	String Car_Wheel;
	
	
	Car (String type, String Brand){
		Car_Type = type;
		Car_Brand = Brand;
	}
	
	Car(String Wheel){
		 Car_Wheel= Wheel;
		
	}
	 public void  method (){ 
		 System.out.println("Hi");
		
		
	}
   public void	 sayaboutCar(){
	   
	   System.out.println("My car has "+Car_Wheel);
	 }
	 
	

	
	

	public static void main(String[] args) {
		Car obj= new Car ("4 wheel");
		
		obj.method();
		obj.sayaboutCar();
		
	}

}
