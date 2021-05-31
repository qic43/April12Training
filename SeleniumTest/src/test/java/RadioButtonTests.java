import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtonTests {
	private WebDriver _driver;
	@Test
	public void canClickRadioButton() {
		RadioButtonPage page = new RadioButtonPage(_driver).navigate();
		
		String message = page.clickYesButton();
		String expectedmessageForYesButton = "You have selected Yes";
		assertEquals(expectedmessageForYesButton, message, "The expcted message for clicking yes button");
		
		message = page.clickImpressiveButton();
		String expectedmessageForImpressiveButton = "You have selected Impressive";
		assertEquals(expectedmessageForImpressiveButton, message, "The expcted message for clicking Impressive button");
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
