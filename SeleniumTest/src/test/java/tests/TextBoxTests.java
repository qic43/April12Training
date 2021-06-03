package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.TextBoxPage;

public class TextBoxTests {
	private WebDriver _driver;
	protected String baseurl = "https://demoqa.com/";
	@Test
	public void canSubmitTextBox() {
		String fullName = "fName lName";
		String email = "123@123.com";
		String currentAddress = "currentAddress";
		String permanentAddress = "permanentAddress";

		TextBoxPage page = new TextBoxPage(_driver, baseurl)
				.navigate()
				.enterData(fullName,email,currentAddress,permanentAddress);

		String[]result = page.submitAndGetResult();

		assertEquals("Name:" + fullName, result[0], "the name text box message should be expected");
		assertEquals("Email:" + email, result[1], "the email text box message should be expected");
		assertEquals("Current Address :currentAddress", result[2], "the current address text box message should be expected");
		assertEquals("Permananet Address :permanentAddress", result[3], "the permanent address text box message should be expected");
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
