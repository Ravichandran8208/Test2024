package Test.Testing;

public class AbstractChild extends AbstractionPractice implements InterfacePrcatice {

	@Override
	public void multiply() {
System.out.println("This method should be useful to do multiplication");		
	}


	@Override
	public void Method1() {
        System.out.println("Method1");		
	}

	@Override
	public void Method2() {
		System.out.println("Method2");
		
	}

	
	  @Override public void Method3() { 
		  System.out.println("Method3");
	  
	  }
	 
	public static void main(String[] args) {
		AbstractChild obj = new AbstractChild();
		obj.multiply();
		obj.Method1();
		obj.Method2();
		obj.Method3();
	}
}
