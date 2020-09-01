package exceptionhandling.concept;

public class ThrowsKeyword {

	public static void main(String[] args) {
//if main method also throws, then JVM will handle exception and print Exception information		
		//main method handling exception with try catch block
		ThrowsKeyword th = new ThrowsKeyword();
		try {
		th.getName();
		}catch (ArithmeticException e) {
			System.out.println("Handling Exception..in main method......");
		}
		
//whenever we want to read Exception thread, we have to read from bottom(StackTrace). example below 	
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at exceptionhandling.concept.ThrowsKeyword.getAddress(ThrowsKeyword.java:29)
		//at exceptionhandling.concept.ThrowsKeyword.getCity(ThrowsKeyword.java:23)
		//at exceptionhandling.concept.ThrowsKeyword.getName(ThrowsKeyword.java:18)
		//at exceptionhandling.concept.ThrowsKeyword.main(ThrowsKeyword.java:10)	

	}

	public void getName() throws ArithmeticException{
		//getName also not handling exception. it is also just throwing 
		//who will catch: it this method calls from main method then main method will handle exception
		getCity();
	}
	
	public void getCity() throws ArithmeticException{
// getCity can handle. if getCity not handling , it must throwing exception.
		//As getName calling getCity method. getName method will handle
		getAddress();
	}
	
	public void getAddress() throws ArithmeticException {
	// here we know get Address method having exception. but here we are not handling exception
		// we are throwing exception with help of 'throws' keyword.
		// get city will catch this exception sine get city calling this method
		System.out.println("Get Address");
		int i=9/0;
	}
	
	
	
	
	
	
	
	
	
}
