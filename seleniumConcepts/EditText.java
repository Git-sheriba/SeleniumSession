package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// maximize the screen
		driver.manage().window().maximize();
		driver.get("https://shareselenium.herokuapp.com/Edit.html");

		driver.findElement(By.id("email")).sendKeys("abc@ds.com");

		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Appended text", Keys.TAB);

		String text2 = driver.findElement(By.xpath("(//label[@for='uname'])[1]")).getText();
		System.out.println(" Text label : " + text2);

		String text = driver.findElement(By.xpath("//input[@value='ShareSelenium']")).getAttribute("value");
		System.out.println(" Text :" + text);

		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();

		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
     // enabled = false
		if (enabled)
			System.out.println(" Enabled web element");
		else
			System.out.println(" Disabled webelement");
	}
}
