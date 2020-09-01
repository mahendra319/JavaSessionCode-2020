package JuneBatch;

public class EncapsulationCompanyExtension {

	public static void main(String[] args) {
		
		EncapusulationCompany c2 = new EncapusulationCompany("TCS",200000,"Banglore","TATA","HR Policy");
		System.out.println(c2.name);
		System.out.println("c2.policy...can't access...\nsince policy is private Class variable from another class ");
		//to access private Class variable/method from another class we need to wrap the private data/method
		//this concept is called Encapsulation. 
		
		System.out.println(c2.getPolicy()); // we access another class variable via Encapsulation process
		
		c2.getEmpData(); // wrapped getSalary() method with getEmpData() 

	}

}
