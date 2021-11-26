package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAmazon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// maximize the screen
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");

		// step 1 : identify the web element
		WebElement drpDwn = driver.findElement(By.id("searchDropdownBox"));
		// Select class - drop down elements
		// Step 2: Pass the web element to the select class
		Select drop = new Select(drpDwn);

		// Step 3: Select the options
		// three mthds to select the option from a drop down
		/*
		 * drop.selectByIndex(0); --> random selection of an option
		 * drop.selectByValue(null); // drop.selectByVisibleText(0); --> Not a
		 * multilingual project
		 */
		// Select Automotive option
		// drop.selectByIndex(2);
		// drop.selectByVisibleText("Automotive");
		drop.selectByValue("search-alias=automotive-intl-ship");

		// number of options in the drop down element
		List<WebElement> options = drop.getOptions(); // checks the options available
		// ctrl+2, L
		int sizeList = options.size();
		System.out.println(" Number of options in the drop down: " + sizeList);

		/*
		 * MultiSelect drop.selectByVisibleText(null); drop.selectByVisibleText(null);
		 * drop.selectByVisibleText(null); drop.deselectAll();
		 */

	}

}
