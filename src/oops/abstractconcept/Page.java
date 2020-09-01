package oops.abstractconcept;

public abstract class Page {

	public final int tout=10;
	//to provide constant values (variable)
	//to prevent method overriding (method)
	//to prevent  inheritance (class)
	public static int timeout=20;
	
		public Page() {
		
		System.out.println("Constructor for abstract page class\n");
	}
	
	//we can have abstract class constructor and it will call whenever we create object for child class
	//abstract can have abstract methods and non-abstract method
	//A method without body are called abstract method
	
	abstract public void header();
	abstract public void title();
	
	
	
	public static void logo() {
		
		System.out.println("Page....Logo");
	}
	
	public void display() {
		
		System.out.println("Page....Display");
	}
	
	
	// 0% abstraction: which means we can create abstract class without abstract methods
	// 100% abstraction: means abstract class with all abstracts methods
	// 0 - 100% - Partial Abstraction: abstract class with abstract method and non abstract methods
	// above three can be possible with abstract class
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
