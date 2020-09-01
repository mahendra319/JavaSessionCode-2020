package JuneBatch;

public class ClassB {
	
	public static void main (String [] args) {
		
		System.out.println("Main method of B...");
		ClassA.main(args); //will create infinite loop and at some point throws StackOverflowError
	}

}
