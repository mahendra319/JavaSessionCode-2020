package JuneBatch;

public class EncapsulationBrowser {
	
	public void launchBrowser()
	{
		System.out.println("Launching Browser");
		OScompatability();
		System.out.println("Browser Launched");
	}
	
	//Encapsulation is also process of hiding internal (unnecessary) implementation of the class from end user
	private void OScompatability() {
		System.out.println("checking OS compatability");
		freeSpaceRAM();
	}
	private void freeSpaceRAM() {
		System.out.println("checking RAM free space");
		browserVersion();
		
	}
	private void browserVersion() {
		
		System.out.println("Verifying browser version");
		
	}

}
