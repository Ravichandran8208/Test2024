package Test.Testing;

public class StringPractice {
	
static String name1=new String ("Karthi");

public static void main(String[] args) {
	 String name="Kumar";
	 name="kannan";
	System.out.println(name);
	
	StringBuffer Name3 = new StringBuffer("Arun");
	System.out.println(Name3);
	StringBuilder Name4 = new StringBuilder("Arunq");
	System.out.println(Name4);
	int length = Name4.length();
	System.out.println(length);
	char charAt = Name4.charAt(2);
	System.out.println(charAt);
	System.out.println(Name4.substring(2, 4));
	System.out.println(Name4.insert(0, "hi"));
	System.out.println(Name4.replace(0, 4, "kumar"));
	
}
}
