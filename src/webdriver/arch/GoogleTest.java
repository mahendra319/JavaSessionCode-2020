package webdriver.arch;

public class GoogleTest {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		//top casting : WebDriver is a parent Interface and ChromeDriver is a  child class
		//WebDriver driver = new ChromeDriver(); // call constructor from chrome driver child class
		//ChromeDriver driver = new ChromeDriver(); // it will only applicable for chrome
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			
			driver = new FirefoxDriver();
		}
		driver.get("https://www.google.com");
		
		driver.findElement("Search");
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
