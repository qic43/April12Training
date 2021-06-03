package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TextBoxPage extends PageSuperClass{
	
	@FindBy(how = How.ID, using="userName")
	private WebElement fullNameTextBox;
	
	@FindBy(how = How.ID, using="userEmail")
	private WebElement emailTextBox;
	
	@FindBy(how = How.ID, using="currentAddress")
	private WebElement currentAddressTextBox;
	
	@FindBy(how = How.ID, using="permanentAddress")
	private WebElement permanentAddressTextBox;
	
	@FindBy(how = How.ID, using="submit")
	private WebElement submitButton;
	
	public TextBoxPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public TextBoxPage navigate() {
		
		driver.navigate().to("https://demoqa.com/text-box");
		
		return this;
	}

	public TextBoxPage enterData(String fullName, String email, String currentAddress, String permanentAddress) {
		fullNameTextBox.sendKeys(fullName);
		emailTextBox.sendKeys(email);
		currentAddressTextBox.sendKeys(currentAddress);
		permanentAddressTextBox.sendKeys(permanentAddress);
		return this;
	}
	
	public String[] submitAndGetResult() {
		submitButton.click();
		String name = driver.findElement(By.id("name")).getText();
		String email = driver.findElement(By.id("email")).getText();
		String currentAddress = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[6]/div/p[3]")).getText();
		String permanentAddress = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[6]/div/p[4]")).getText();
		String[]result = {name,email,currentAddress,permanentAddress};
		return result;

	}

	

}
