package oops.abstractconcept;

public class HomePage extends Page{

	@Override
	public void header() { //overridden method
		System.out.println("HOmePage ....Header");
		
	}

	@Override
	public void title() { //overridden method
		
		System.out.println("HOmePage....title");
		
	}
	
	public void showAccountDetails() { //non abstract and non-static method
		
		System.out.println("HomePage...accountdetails");
	}
	
	@Override
	public void display() {
		
		System.out.println("HomePage....Display with some Welcome message");
	}
	
	

}
