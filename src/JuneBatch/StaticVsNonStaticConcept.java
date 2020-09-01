package JuneBatch;

public class StaticVsNonStaticConcept {
	//class variables
	String name;
	static int age;

	public static void main(String[] args) {
//how to access non-static variables and methods
		//create object of the class
		
		StaticVsNonStaticConcept nonStatic = new StaticVsNonStaticConcept();
		nonStatic.name="India";
		System.out.println(nonStatic.name);
		nonStatic.getName();
		
//HOw to call static variables and methods:
		//1. direct calling: no need to create an object
		
		age=25;
		System.out.println(age);
		getValue();
		//2. call by class name
		
		System.out.println(StaticVsNonStaticConcept.age);
		StaticVsNonStaticConcept.getValue();
		
		//3. can we use object to call static Stuff
		//Yes. compiler will display warnings
		
		System.out.println(nonStatic.age);
		
		
	}
		
	public static void getValue() {
		System.out.println("getValue method...static...");
	}
	
	public void getName() {
		System.out.println("getName...non static method..");
	}

}
