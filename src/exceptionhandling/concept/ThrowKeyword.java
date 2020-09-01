package exceptionhandling.concept;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		try {
		throw new Exception("ThisIsCustomException");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		String br ="opera";
		
		if (br.equalsIgnoreCase("chrome")) {
			System.out.println("launch chrome");
		}

		else if (br.equalsIgnoreCase("Firefox")) {
			System.out.println("launch Firefox");
		}
		
		else if (br.equalsIgnoreCase("edge")) {
			System.out.println("launch edge");
		}
		else {
			System.out.println("Please pass the right browser name:"+br);
			try {
			throw new Exception("NoBrowserFoundException");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
			
			
			
	}

}
