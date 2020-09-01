package JuneBatch;

public class GetterAndSetterLoginFeature {
	
	private String uName;
	private String password;
	
	
	//constructor using along with setter and getter method
	//constructor and setter both are doing exactly same thing
	//we have to choose either constructor or setter when we define in another class
	public GetterAndSetterLoginFeature(String uName, String password) {
		this.uName = uName;
		this.password = password;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
