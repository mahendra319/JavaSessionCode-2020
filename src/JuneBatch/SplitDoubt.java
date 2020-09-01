package JuneBatch;

public class SplitDoubt {

	public static void main(String[] args) {
		
		System.out.println("....| as a separator.....");
		
		String str = "Java|Python|Rub|JavaScript";
		//String str = "Java$Python$Rub$JavaScript";
		
		String [] lang = str.split("\\|");
		
		for (String s : lang) {
			
			System.out.println(s);
			//System.out.println();
		}

		System.out.println("\n... ; as a separator.....");
		String str1 = "Java;Python;Rub;JavaScript";
		
		String [] progLan=str1.split(";");
		for (String s : progLan) {
			
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
