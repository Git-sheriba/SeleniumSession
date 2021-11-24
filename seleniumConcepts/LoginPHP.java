package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPHP {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// maximize the screen
		driver.manage().window().maximize();
		driver.get("https://phptravels.org/index.php?rp=/login");
		// locate the element
		driver.findElement(By.id("inputEmail")).sendKeys("sheriba.ts@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("password");
		Thread.sleep(1000);
		driver.findElement(By.id("login")).click();
		// Link Text
		driver.findElement(By.linkText("Register")).click();
	}
}
