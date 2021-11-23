package seleniumConcepts;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchURL {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
	//	driver.navigate().to("https://www.google.co.in/");
		
	//	driver.navigate().refresh();
	//	driver.navigate().back();
		
		// title of the page
		String title = driver.getTitle();
		System.out.println(" Title:" + title);	
		System.out.println(driver.getTitle());
		
		// get the url of the page
		String currentUrl = driver.getCurrentUrl();
		System.out.println(" currentUrl: " + currentUrl);
		
		// close the page
		driver.close();
		
		
		
		
		
		

	}

}
