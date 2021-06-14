package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ControlExtensions.ButtonControlExtensions;

public class AlertPage extends PageSuperClass {
	private final String pageUrl = "alerts";

	@FindBy(how = How.ID, using="alertButton")
	private WebElement alertButton;
	
	@FindBy(how = How.ID, using="timerAlertButton")
	private WebElement timerAlertButton;
	
	@FindBy(how = How.ID, using="confirmButton")
	private WebElement confirmButton;
	
	@FindBy(how = How.ID, using="promtButton")
	private WebElement promtButton;
	
	public AlertPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public AlertPage navigate() {
		super.navigate(pageUrl);
		
		return this;
	}

	public String getClickButtonAlertMessage() {
		ButtonControlExtensions button = new ButtonControlExtensions(alertButton,driver);
		button.ClickButton();
		
		return driver.switchTo().alert().getText();
	}

	public String waitAndGetClickButtonAlertMessage() {
		ButtonControlExtensions button = new ButtonControlExtensions(timerAlertButton,driver);
		button.ClickButton();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        
		return driver.switchTo().alert().getText();
	}

	public String clickOKfromAlert() {
		ButtonControlExtensions button = new ButtonControlExtensions(confirmButton,driver);
		button.ClickButton();
		
		driver.switchTo().alert().accept();
		
		
		return driver.findElement(By.id("confirmResult")).getText();
	}

	public String enterNameandClick(String name) {
		ButtonControlExtensions button = new ButtonControlExtensions(promtButton,driver);
		button.ClickButton();
		
		driver.switchTo().alert().sendKeys(name);
		driver.switchTo().alert().accept();
		return driver.findElement(By.id("promptResult")).getAttribute(name);
	}
}
