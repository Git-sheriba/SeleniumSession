package seleniumConcepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	public static void main(String[] args) {
		// abstract class
	//	WebDriverManager.chromedriver().setup();
	//	System.out.println(System.getProperty("webdriver.chrome.driver", "path"));
	//	System.setProperty("webdriver.chrome.driver", "D:\\WifeOfPrabakaran\\MySelenium\\SELENIUMTEAM\\driver\\chromedriver.exe");
		WebDriverManager.edgedriver().setup();
	//	WebDriverManager.firefoxdriver().setup();
		// launches the browser
	//	ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		// Loads the URL
		driver.get("https://www.google.co.in/");
		
		
		
		
		
	}
}
