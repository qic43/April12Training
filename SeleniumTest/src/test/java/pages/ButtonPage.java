package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ControlExtensions.IButton;

public class ButtonPage extends PageSuperClass{

	private final String pageUrl = "buttons";

	public ButtonPage(WebDriver driver, String baseUrl) {
		super(driver,baseUrl);
	}

	public ButtonPage navigate() {
		super.navigate(pageUrl);

		return this;
	}

	public String clickButtonAndGetClickedButtonMessage() {

		WebElement buttonElement = driver.findElement(By.xpath("//button[text()='Click Me']"));
		buttonElement.click();

		WebElement buttonTextElement = driver.findElement(By.id("dynamicClickMessage"));
		String buttonTextElementText = buttonTextElement.getText();

		return buttonTextElementText;		
	}

	public String doubleClickButtonAndGetClickedButtonMessage() {
		WebElement buttonElement = driver.findElement(By.id("doubleClickBtn"));	

		Actions actions = new Actions(driver);
		actions.doubleClick(buttonElement).perform();

		WebElement buttonTextElement = driver.findElement(By.id("doubleClickMessage"));

		String buttonTextElementText = buttonTextElement.getText();

		return buttonTextElementText;	
	}

	public String rightClickButtonAndGetClickedButtonMessage() {
		WebElement buttonElement = driver.findElement(By.id("rightClickBtn"));
		Actions actions = new Actions(driver);
		actions.contextClick(buttonElement).perform();
		
		WebElement buttonTextElement = driver.findElement(By.id("rightClickMessage"));

		String buttonTextElementText = buttonTextElement.getText();

		return buttonTextElementText;
	}

}
