package JuneBatch;

public class MethodOverLoadingLoginPage {

//MethodOverloading: With in a class when we have different methods;
	//  with same method name,
	//with different no .of parameter,
	// with different sequence of parameters
	// with parameters with different data types - then it is called MethodOverloading
	
	public static void main(String[] args) {
		
		MethodOverLoadingLoginPage obj = new MethodOverLoadingLoginPage();
		obj.loginSite(916011, "Mahi");
		obj.loginSite(2020);
	}

	//methods with same name with in a class is not allowed. but with different parameters, different data types, different sequence allowed
	
	/**
	 * 
	 */
	public void login() { // zero parameters
		System.out.println("simple login....");
	}
	public void login(int otp) {// one parameter
		System.out.println(".....Login with otp.... ");
	}
	public void login(String str) { // one parameter but different data type
		System.out.println(".....Login with string parameter.... ");
	}
	public void login(int otp, String str) { // 2 parameters but different data types
		System.out.println(".....Login with two prameters..with different data types.... ");
	}
	public void login(int otp, int i) {
		System.out.println(".....Login with two parameters.... ");
	}
	public void login(String str, int otp) {
		System.out.println(".....Login with ..two  params..with different data types...different sequence.... ");
	}
	
// Real-Time scenario's for MethodOverloading - ways of login
	
	public void loginSite() {
		System.out.println("simple login");
	}
	public void loginSite(int OTP) {
		System.out.println(".. login with OTP....");
	}
	public void loginSite(String UserName, String Password) {
		System.out.println("login with username and password....");
	}
	public void loginSite(String userName, String Password, int OTP) {
		System.out.println("login userName and password and OTP");
	}
	public void loginSite(String userName, String Password, String email) {
		System.out.println("login with username, password and email");
	}
	public void loginSite(String usrname, long phoneNumber) {
		System.out.println("sogin with username and phone number");
	}
	public void loginSite(long phoneNumber, String usrName) { // sequence change
		System.out.println("login with phoneNumber and usrName");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
