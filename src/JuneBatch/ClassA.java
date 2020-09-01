package JuneBatch;

public class ClassA {
	
public static void main (String [] args) {
		
	System.out.println("Main method of A...");
	
	ClassB.main(args); //will create infinite loop and at some point throws StackOverflowError
	
	}

}
