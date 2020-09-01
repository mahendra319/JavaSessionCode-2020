package HashMapConcept;

import java.util.HashMap;

public class Credentials {
	
	public static HashMap<String, String> credMap;

	public static void main(String[] args) {
		
		//e-commerce role: customer , Seller , distributor, vendor, partner, CategoryManager
		
		credMap = new HashMap<String, String>();
		//username:password
		credMap.put("Customer", "karthi@gmail.com:Test123");
		credMap.put("Seller", "mahi@gmail.com:Test123");
		credMap.put("Distributor", "kotike@gmail.com:Test123");
		credMap.put("Vendor", "suri@gmail.com:Test123");
		credMap.put("Partner", "ravi@gmail.com:Test123");
		credMap.put("CategoryManager", "pallu@gmail.com:Test123");
		
		
		
		Credentials obj= new Credentials();
		
		obj.doLogin(credMap.get("Customer").split(":")[0].trim(), credMap.get("Customer").split(":")[1].trim());
		
		obj.doLogin("Customer");
		
		obj.doLogin("Vendor");
		
		obj.doLogin("Partner");
		
		
		
		
		
		
	}
	
	public void doLogin(String uName, String pwd) {
		
		System.out.println("login wiht..."+uName+" and" +pwd);
	}
	
	
	public void doLogin(String role) {
		String uName = credMap.get(role).split(":")[0].trim();
		String pwd= credMap.get(role).split(":")[1].trim();
		 System.out.println("login wiht..."+uName+" and" +pwd);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
