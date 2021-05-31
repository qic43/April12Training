import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class StudentRegistrationTests {
	private ChromeDriver _driver;
	
	@Test
	public void canSubmitMinimunForm() {
		String firstName = "fName";
		String lastName = "lName";
		String gender = "Male";
		String mobileNumber = "1234567890";
		String studentName = firstName + " " + lastName;

		StudentRegistrationPage page = new StudentRegistrationPage(_driver);

		String actualFirstName = page.navigate()
			.enterData(firstName,lastName,gender,mobileNumber)
			.submit().getStudentName();
		
		assertEquals(actualFirstName,studentName, "the student registration confirmation form ");
		//assert values
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\53402\\git\\April12Training\\SeleniumTest\\src\\test\\resources\\chromedriver.exe");  

		_driver = new ChromeDriver();
		_driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		_driver.quit();
	}

}
