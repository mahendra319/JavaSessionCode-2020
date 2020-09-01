package assignment;

 
import webdriver.arch.ChromeDriver;
import webdriver.arch.WebDriver;

public class xpathWebTableTdCount {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		
		driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/8674/scorecard/1187714/new-zealand-women-vs-south-africa-women-1st-odi-icc-womens-championship-2017-18-2021");
		
		Thread.sleep(5000);
		
		
		//a[text()='B Bezuidenhout']//ancestor::tr/td
	}

}
