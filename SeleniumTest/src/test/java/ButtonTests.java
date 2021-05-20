import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ButtonTests {

	private WebDriver _driver;

	@Test
	public void canClickButton() {
		String expectedMessage = "You have done a dynamic click";

		ButtonPage page = new ButtonPage(_driver);
		_driver.navigate().to("http://www.demoqa.com/buttons");
		String message = page.ClickButtonAndGetClickedButtonMessage();

		assertEquals(message, expectedMessage, "the button click message should be as expected.");
	}
	
	@Test
	public void canDoubleClickButton() {
		String expectedMessage = "You have done a double click";

		ButtonPage page = new ButtonPage(_driver);
		_driver.navigate().to("http://www.demoqa.com/buttons");
		String message = page.DoubleClickButtonAndGetClickedButtonMessage();

		assertEquals(message, expectedMessage, "the button doubleclick message should be as expected.");		
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\53402\\git\\April12Training\\SeleniumTest\\src\\test\\resources\\chromedriver.exe");  

		_driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		_driver.quit();
	}
}