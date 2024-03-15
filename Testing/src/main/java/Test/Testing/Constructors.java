package Test.Testing;

import org.testng.annotations.Test;

public class Constructors {

	
	    private String name;
	    private int age;
	    private String address;

		/*
		 * public Constructors() { this("Unknown", 0, "Unknown"); }
		 * 
		 * public Constructors(String name, int age) { this(name, age, "Unknown"); }
		 */

	    public Constructors(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }
	   
	    public static void main(String[] args) {
			
		
			/*
			 * Constructors person1 = new Constructors(); Constructors person2 = new
			 * Constructors("Alice", 25);
			 */ 
	    	Constructors person3 = new Constructors("Bob", 30, "123 Main St"); 
	    	System.out.println(person3);
	     }
		}

	    // Getters and setters (not shown in this example for brevity)
	



