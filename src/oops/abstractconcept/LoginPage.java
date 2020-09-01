package oops.abstractconcept;

public class LoginPage extends Page {
	
	public LoginPage() {
		
		System.out.println("LoginPage...constructor\n");
	}

	@Override
	public void header() { //overridden method
		
		System.out.println("LoginPage....Header");
	}

	@Override
	public void title() {//overridden method
		
		System.out.println("LoginPage....title");
	}
	
	
	public void doLogin() {
		
		System.out.println("LoginPage....doLogin");
	}
	
	public void doLogin(String uName,String password) { //Method Overloading
		
		System.out.println("LoginPage....doLogin with"+uName+password);
	}
	
	
	

}
