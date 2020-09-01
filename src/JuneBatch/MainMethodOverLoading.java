package JuneBatch;

public class MainMethodOverLoading {

	//main method overloading
	public static void main() {
		
	System.out.println("Overloading main method...with no pram...");
	}
	public static void main(int i) {
		
		System.out.println("Overloading main method...with one pram..."+i);
		}

public static void main(int i, String s) {
	
	System.out.println("Overloading main method...with two pram..."+i+s);
	}
	
	
	//with main method we can't execute program..
	public static void main(String[] args) {
		
		System.out.println("Main Method....");
		
		System.out.println("\n...calling static method without classname.....");
		main(); // main method with no param - static method hence calling without object creation
		main(319); // main method with one param - static method hence calling without object creation
		main(5, " Mahi"); // main method with two param - static method hence calling without object creation
		//OR
		System.out.println("\n...Calling static method using class name......");
		MainMethodOverLoading.main();
		MainMethodOverLoading.main(125);
		MainMethodOverLoading.main(2," karthi");
	}

}
