package oops_interface.multipleinheritance;

public interface USmedical extends WHO{
	
	int fee = 10;
	//interface methods does not contain method body
	
	//no method body (the method without body are called as Abstract Method)
	//only method prototype
	//can not create object of interface
	public void ambulanceServices();
	
	public void cardioServices();
	
	public void emergencyServices();
	
	public void orthoServices();
	
	
	//After JDK 1.8:
	//1. we can create static method with method body
	//
	public static void covid19Test() {
		System.out.println("USmedical ....Covid19 Test");
	}
	
	//2. we can have default method:
	//default methods 
	default void billing() {
		System.out.println("USmedical...billing");
	}
	
	//we can create variables inside interface
	//interface variables are static and final in nature by default
	
	
	
	
	
	
	
	
	
	

}

