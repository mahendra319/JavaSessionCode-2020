package oops.inheritance;

public class BMWchild extends CarParent{
	
	
	//method Overriding: when we have method in parent class and same method is in child class 
	//with same name
	//with same number of parameters is called method overriding
	// and the method is called overridden method
	
	@Override
	public void start() {
		
		System.out.println("BMW...Start");
	}

	public void autoParking() {
		
		System.out.println("BMW...AutoParking");
	}
	
	//can not Override static method
	
	//@Override
	//public static void display() {
		
		//System.out.println("BMW....display");
	//}
	
	//if we not mention @Override it will not a Override method. Its just an individual method
	//we can access this method with class name
	public static void display() {
		
		System.out.println("BMW...display");
		
	}

}
