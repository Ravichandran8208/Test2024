package Test.Testing;

public class StaticPractice {
     
      
    
   public static void add(){
    	int num3=10*10;
    	System.out.println(num3);
    	
    }
   static {
	   System.out.println("program starts here itself");
	   int num1 =10;
	   int num2= num1*num1;
		System.out.println(num2+"Hi");
   }
    public static void main(String[] args) {
		add();
		StaticPractice obj1= new StaticPractice();
		obj1.add();
		
	}
}
