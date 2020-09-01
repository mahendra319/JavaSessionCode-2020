package JuneBatch;

public class EcommerceExampleForMethodOverloading {
	
//Real-Time scenario  example for  Method Overloading - Search function in e-commerce  
	public void search(String name) {
		
	}
	public void search(String name, double price) {
		
	}
	public void search(String name, String color) {
	
	}
	public void search(String name, String color, double price) {
		
	}
	public void search(String name, String color, String Seller) {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EcommerceExampleForMethodOverloading e = new EcommerceExampleForMethodOverloading();
		e.search("abcd");

	}
//Real-Time scenario  example for  Method Overloading - Payment function in e-commerce  
	public void payment(long CCNumber) {
		
	}
	public void payment(String CCNumber, int OtP) {
		
	}
	public void payment(int PaypalId, int OtP) {
		
	}
	public void payment(int bankacctNo, int OtP, String email) {
	
	}
	
	
}
	