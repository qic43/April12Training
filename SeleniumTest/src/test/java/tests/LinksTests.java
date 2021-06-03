package tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.NewLinksPage;

public class LinksTests {
	protected WebDriver _driver;
	protected String baseurl = "https://demoqa.com/";
	@Test
	public void switchToNewWeb() {
		NewLinksPage page = new NewLinksPage(_driver, baseurl).navigate();
		
		String url = page.clickHomeButtonAndJoinNowButton().getURL();
		
		String expectedURL = "https://www.toolsqa.com/selenium-training/";
		
		assertEquals(url, expectedURL,"the url should be expected");
		
	}
	
	@Test
	public void clickCreateHyperlink() {
		NewLinksPage page = new NewLinksPage(_driver, baseurl).navigate();
		
		String linkResponse = page.clickCreatedButton().getTextRespone();
		
		String expectedResponse = "Link has responded with staus 201 and status text Created";
		
		assertEquals(expectedResponse,linkResponse,"the link-response message should be expected");
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
