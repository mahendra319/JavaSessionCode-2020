package exceptionhandling.concept;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int i=9/0;
		System.out.println(i);
		}catch(Exception e) {
			System.out.println("Arithmetic Exception is coming....");
			e.printStackTrace();
		}
		
		System.out.println("Welcome to Java");
		
		try {
			int k=5/0;
					
			}catch (ArithmeticException e) {
				
				System.out.println("\nException..using specific child Exception..");
			}
		try {
			int j=8/0;
			System.out.println("hi...");
		}catch (Throwable e) {
			System.out.println("\nException ...using Throwable super class");
		}
		
		Practice obj = new Practice();
		obj=null;
		try {
		obj.getName();
		}catch (NullPointerException e) {
			System.out.println("Obj is null...exception");
		}
		
		
	}
	
	public void getName() {
		
		System.out.println("getting Name....");
	}
	
	

}
