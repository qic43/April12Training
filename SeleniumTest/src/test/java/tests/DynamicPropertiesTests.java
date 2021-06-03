package tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DynamicPropertiesPage;

public class DynamicPropertiesTests {
	protected WebDriver _driver;
	protected String baseurl = "https://demoqa.com/";
	@Test
	public void VisibleTest() {
		DynamicPropertiesPage page = new DynamicPropertiesPage(_driver, baseurl).navigate();
		
		String response = page.waitForVisibleAndGetResponse();
		
		String expectedResponse = "Visible After 5 Seconds";
		
		assertEquals(expectedResponse,response,"the same message should be expected");
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\53402\\git\\April12Training\\SeleniumTest\\src\\test\\resources\\chromedriver.exe");  

		_driver = new ChromeDriver();

		_driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		_driver.quit();
	}
}
