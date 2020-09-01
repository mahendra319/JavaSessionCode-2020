package HashMapConcept;

import java.util.HashMap;

public class Practice {

	public static void main(String[] args) {
		
		HashMap<Integer, String> objMap = new HashMap<Integer, String>();
		objMap.put(123, "Hello");
		objMap.put(321, "Bye");
		
		System.out.println(objMap.get(123));
		System.out.println(objMap.get(321));
				

	}

}
