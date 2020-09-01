package oops_interface.multipleinheritance;

public class ApolloHospital extends MedicalOrg implements USmedical,UKmedical,IndianMedical{

	//non overridden methods - from Apollo Hospitals
	
	public void medicalInsurance() {
		
		System.out.println("AH....medicalINsurance");
	}
	public void medicalTrainng() {
		
		System.out.println("AH....MedicalTraining");
	}
	
	//us medical 
	@Override
	public void ambulanceServices() {
	
		System.out.println("AH.....ambulanceServices");
		
	}

	@Override
	public void cardioServices() {
		
		System.out.println("AH.....cardioServices");
	}

	@Override
	public void emergencyServices() {
		
		System.out.println("AH.....emergencyServices");
	}

	@Override
	public void orthoServices() {
		System.out.println("AH....orthoServices");
		
	}
	
	
	//UK medical
	@Override
	public void neuroServices() {
		
		System.out.println("AH...neuroServices");
	}

	@Override
	public void entServices() {
		System.out.println("AH.....entServices");
		
	}

	
	//Indian medical
	@Override
	public void oncologyServices() {
		System.out.println("AH.....oncologyServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("AH....physioServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("AH....pediaServices");
		
	}

	@Override
	public void billing() {
		System.out.println("USmedical...billing");
	}
	
	//WHO
	@Override
	public void swineFlu() {
		
		System.out.println("AH...swineFlu");
	}
	@Override
	public void covid() {
		
		System.out.println("AH...covid");
	}
	
	
	
	
	
	
	

}
