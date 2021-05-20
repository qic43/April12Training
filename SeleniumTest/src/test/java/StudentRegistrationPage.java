
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.*;


public class StudentRegistrationPage {
	private WebDriver _driver;
	private String pageUrl = "https://www.demoqa.com/automation-practice-form";
	
	@FindBy(how = How.ID, using ="firstName")
	private WebElement firstNameTextBox;
	
	@FindBy(how = How.ID, using ="lastName")
	private WebElement lastNameTextBox;

	@FindBy(how = How.CSS, using ="label[for='gender-radio-1']")
	private WebElement malegenderRadioButton;
	
	@FindBy(how = How.ID, using ="userNumber")
	private WebElement mobileNumberTexbox;
	
	@FindBy(how = How.ID, using ="submit")
	private WebElement submitButton;
	
	public StudentRegistrationPage(ChromeDriver driver) {
		_driver = driver;
		
		PageFactory.initElements(_driver, this);
	}

	public StudentRegistrationPage enterData(String firstName, String lastName, String gender, String mobileNumber) {
		firstNameTextBox.sendKeys(firstName);
		lastNameTextBox.sendKeys(lastName);
		malegenderRadioButton.click();
		mobileNumberTexbox.sendKeys(mobileNumber)
;		return this;
	}

	public ConfirmationForm submit() {
		
		submitButton.click();
		
		WebElement confirmationFormElement = _driver.findElement(By.className("modal-dialog"));
		return new ConfirmationForm(confirmationFormElement);
	}

	public StudentRegistrationPage navigate() {
		_driver.navigate().to(pageUrl);
		return this;
	}
	
	public class ConfirmationForm{
		
		private WebElement _parentElement;
		
		private By firstNameLocator = By.cssSelector("");
		
		public ConfirmationForm(WebElement confirmationFormElement) {
			_parentElement = confirmationFormElement;
			
		}
		
		public String getStudentName() {
			WebElement studentNameElement = _parentElement.findElement(firstNameLocator);
			
			return studentNameElement.getText();
		}
		
		
	}
	
}
