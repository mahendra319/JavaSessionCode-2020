package HashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		//<K, V>
		
		HashMap<String, String> empMap = new HashMap<String, String>();
		empMap.put("name", "Karthi");
		empMap.put("email", "karthi@gmail.com");
		empMap.put("city", "Hyderabad");
		empMap.put(null, "India");
		empMap.put(null, null);
		//Values can be duplicate but not keys. if keys duplicate it will fetch latest key value
		//can have multiple null values, but should have only one null key
		System.out.println(empMap.get("name"));
		System.out.println(empMap.get("city"));
		System.out.println(empMap.get("eId")); // null
		System.out.println(empMap.get(null)); // India
		System.out.println(empMap.get(null));
		
		
		
		//entrySet() - it will return set which means key and value pair
		// to print all key and value pairs
		for(Map.Entry<String, String> e: empMap.entrySet()) {
			
			System.out.println("Key is: "+e.getKey()+" and Value is: "+e.getValue());
		}
		
		//OR keySet() - it will returns only keys from pair
		for(String s : empMap.keySet()) {
			
			System.out.println("Key is: "+s);
		}
		
		//value() - it will returns only from pair
		for(String v: empMap.values()) {
			
			System.out.println("Value is: "+v);
		}
		
		//forEach with Lambda expression: introduce after JDK 1.8 
		
		empMap.forEach((k,v) -> System.out.println("Key = "+k+" Value = "+v));
		
		
		
		
		HashMap<String, Integer> sMap = new HashMap<String, Integer>();
		
		sMap.put("Mahi", 85);
		sMap.put("Karthi", 95);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
