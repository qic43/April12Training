import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void canLaunchWebBrower() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\53402\\eclipse-workspace\\SeleniumTest\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://www.google.com/?gws_rd=ssl";

		driver.navigate().to(url);
		assertEquals(driver.getCurrentUrl(),url);
		driver.quit();
	}
	@Test
	public void canClickButtonAndGetResult() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\53402\\eclipse-workspace\\SeleniumTest\\src\\test\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/buttons";

		driver.navigate().to(url);
		WebElement button = driver.findElement(By.xpath("//button[text()='Click Me']"));
		button.click();
		
		WebElement element = driver.findElement(By.id("dynamicClickMessage"));
		String message = element.getText();
		
		assertEquals(message,"You have done a dynamic click");
		
		driver.quit();
	}
}
