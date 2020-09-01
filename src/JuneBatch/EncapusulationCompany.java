package JuneBatch;

public class EncapusulationCompany {

	public String name;
	public int empCnt;
	public String HQ;
	public String logo;
	private String policy;
	
	private void getSalary() {
		System.out.println("Salary Info");
	}
	
	public void getEmpData() { // wrapping getSalary() method (Encapsulation process)
		getSalary(); //both are non-static method ...hence object not required to call the method
	}
	
	public EncapusulationCompany(String name, int empCnt, String hQ, String logo, String policy) {
		this.name = name;
		this.empCnt = empCnt;
		HQ = hQ;
		this.logo = logo;
		this.policy = policy;
	}
	
//Wrapping policy class variable (Encapsulation) as a public ...it can be accessible from another class using this method 
	public String getPolicy() {
		return policy;
	}
	
	
	public static void main (String [] arg) {
		
		EncapusulationCompany c1 = new EncapusulationCompany("DXC",100000,"Seattle","DXC","Project Estimates");
		System.out.println(c1.name);
		System.out.println(c1.policy); // private class variable - we can access private variables/methods with in same class
		System.out.println(c1.getPolicy()); //accessing via Encapsulation concept
		c1.getSalary();
	
	}
	
	
	
}
