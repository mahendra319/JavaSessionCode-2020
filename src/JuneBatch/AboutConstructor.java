package JuneBatch;

public class AboutConstructor {

		
//Constructor: is a block of code similar to method.It is called when instance of class(object) created.
	//Rules for creating java constructor:
	//1. constructor name must be same as its className
	//2. A constructor must have no explicit return type (like void, String, int , ...)
	//3. A java Constructor cann't be Abstract, Static , Final and synchronized
	// 4. we can use access modifier while declaring constructors (like public private, protected or default)
	
	//Constructor is a special type of method used to initialize the object.
	//Every time an object is created using the new() keyword, at least one constructor is called.
	
	//It calls a default constructor if there is no constructor available in the class. 
	//In such case, Java compiler provides a default constructor by default.
	

	//It is called constructor because it constructs the values at the time of object creation. 
	//It is not necessary to write a constructor for a class. 
	//It is because java compiler creates a default constructor if your class doesn't have any.
	
	//Constructors are two types: Default constructor and Parameterized constructor
	
	//Advantages of Constructors:
	//A constructor eliminates placing the default values.
	//A constructor eliminates calling the normal method implicitly.
	
	public AboutConstructor() { // 0 parameters
		System.out.println("Default constuctor.....");
	}
	
	public AboutConstructor (int i) {
		System.out.println("one Param constructor...."+i);
	}
	public AboutConstructor(String s, int i) {
		System.out.println("2 param constructor......");
	}
	
	
	
	
	public static void main(String[] args) {
		
	
		AboutConstructor EC1 = new AboutConstructor(); // constructor will be called when object is created.
		AboutConstructor EC2 = new AboutConstructor(10);
		
		

	}

}
