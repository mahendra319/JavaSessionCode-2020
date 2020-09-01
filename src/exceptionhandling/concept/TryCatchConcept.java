package exceptionhandling.concept;

public class TryCatchConcept {

	public static void main(String[] args) {
		
		
		System.out.println("AA");
		System.out.println("AA");
		System.out.println("AA");
		
		try {
			System.out.println("testing..");
			int i = 9/0;
			System.out.println("Hello..."); // it not print Hello..since exception in the above line..then it will go to catch block
		} catch (Exception e) { //catch(Throwable e) - it is also valid ...since Throwable is a parent class of Exception.
			//if we use Throwable ..it is not good for readability..hence Exception or specific exception is prefer 
			System.out.println("Exception is in above int i..");
			e.printStackTrace(); // it will provide the information of Exception
		}
		
		
		System.out.println("AA");
		System.out.println("AA");
		
		
		TryCatchConcept obj = new TryCatchConcept();
		obj.getName();
		System.out.println("\n...............");
		obj=null;
		try {
		obj.getName(); //NullPointerException
		} catch (NullPointerException e) {
			System.out.println("obj is null...");
		}
		
		try {
		int p =9/3;
		obj=null;
		obj.getName();
		}
		catch (ArithmeticException e) {
			System.out.println("Exception related to Arithmetic");
		}
		catch(NullPointerException e) {
			System.out.println("Exception related to Null");
		}
		
		
		
		

	}
	
	public void getName() {
		
		System.out.println("get...Name....");
	}

}
