

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonPage {

	private WebDriver _driver;

	public ButtonPage(WebDriver driver) {
		_driver = driver;
	}

	public String ClickButtonAndGetClickedButtonMessage() {

		WebElement buttonElement = _driver.findElement(By.xpath("//button[text()='Click Me']"));
		buttonElement.click();
		
		WebElement buttonTextElement = _driver.findElement(By.id("dynamicClickMessage"));
		String buttonTextElementText = buttonTextElement.getText();
		
		return buttonTextElementText;		
	}

	public String DoubleClickButtonAndGetClickedButtonMessage() {
		WebElement buttonElement = _driver.findElement(By.id("doubleClickBtn"));	
	
		Actions actions = new Actions(_driver);
		actions.doubleClick(buttonElement).perform();
		
		WebElement buttonTextElement = _driver.findElement(By.id("doubleClickMessage"));

		String buttonTextElementText = buttonTextElement.getText();
		
		return buttonTextElementText;	
	}
}
