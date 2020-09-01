package oops_interface.multipleinheritance;

public class TestHospital {

	public static void main(String[] args) {
		
		ApolloHospital ah = new ApolloHospital();
		ah.cardioServices();
		ah.oncologyServices();
		ah.entServices();
		ah.emergencyServices();
		ah.neuroServices();
		ah.medicalInsurance();
		ah.medicalTrainng();
		
		USmedical.covid19Test(); //static method hence calling with interface name
		ah.billing();
		ah.swineFlu();
		ah.covid();
		
		System.out.println(USmedical.fee);
		System.out.println("\n..US medical top casting ........");
		
		//USmedical us = new USmedical(); // object for interface not allowed 

		//top casting
		
		
		USmedical us = new ApolloHospital(); //child class Object referred by parent interface reference variable
		
		us.ambulanceServices();
		us.cardioServices();
		us.emergencyServices();
		us.orthoServices();
		us.billing();
		us.swineFlu();
		us.covid();
		
		//UK and Indian medical interface methods can not access. since java perform reference type check and USmedical fail it.
		//also individual methods from child class can not access
		
		System.out.println("\n...UKmedical top casting.............");
		UKmedical uk = new ApolloHospital();
		uk.entServices();
		uk.neuroServices();
		//US and Indian medical interface methods not access. since java perform reference type check and UKmedical fails it
		//also individual child class methods can not access
		uk.swineFlu();
		uk.covid();
		
		
	
		
		
		
		
		
		
		
	}

}
