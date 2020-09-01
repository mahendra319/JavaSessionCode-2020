package JuneBatch;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		
		int num=11;
		
		switch (num) {
		case 10:
			System.out.println("Hiii...");
			break;
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("Bye...");
			break;
		
		default:
			System.out.println("not found....");
			break;
		}
		
		
		/*
		 * String browser ="chrome";
		 * 
		 * switch (browser) { case "chrome":
		 * System.out.println("Launch chrome browser.."); break; case "Firefox":
		 * System.out.println("Launch Firefox Browser"); break; default:
		 * System.out.println("browser not found"); break; }
		 */
			
		
		launchBrowser("Firefox"); // calling mthod
		
		
		

	}
	
	
	public static void launchBrowser(String browser) {
		
		//String (browser) ="chrome";
		
		switch (browser) {
			case "chrome":
				System.out.println("Launch chrome browser..");
				break;
			case "Firefox":
				System.out.println("Launch Firefox Browser");
				break;
			default:
				System.out.println("browser not found");
				break;
		}
	}
	
	
	
	
	
	
	
	

}
