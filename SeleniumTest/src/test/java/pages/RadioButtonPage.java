package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RadioButtonPage extends PageSuperClass{
	
	@FindBy(how = How.CSS, using="label[for=\"yesRadio\"]")
	private WebElement yesRadioButton;
	
	@FindBy(how = How.CSS, using="label[for=\"impressiveRadio\"]")
	private WebElement impressiveRadioButton;

	public RadioButtonPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public RadioButtonPage navigate() {
		driver.navigate().to("https://demoqa.com/radio-button");

		return this;
	}

	public String clickYesButton() {
		yesRadioButton.click();
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p")).getText();
	}

	public String clickImpressiveButton() {
		impressiveRadioButton.click();
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p")).getText();
	}

}
