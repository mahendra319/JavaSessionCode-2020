package JuneBatch;

public class GetterAndSetterLoginFeatureExtension {

	public static void main(String[] args) {
		
		
		GetterAndSetterLoginFeature lp = new GetterAndSetterLoginFeature("kotike@gmail.com","test");
		
		/*
		 * lp.setuName("mahi@gmail.com"); 
		 * lp.setPassword("Test@123");
		 */
		
		System.out.println(lp.getuName());
		System.out.println(lp.getPassword());
		
//if we want to change password use setter method - so here using Constructor along with getter and setter
	//this is the advantage of using Constructor along with getter and setter	
		lp.setPassword("java@123");
		System.out.println(lp.getPassword());
		
		
		

	}

}
