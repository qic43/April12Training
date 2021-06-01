package ControlExtensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonControlExtensions extends ControlExtensionSuperClass implements IButton{
	
	public ButtonControlExtensions(WebElement mappedElement, WebDriver driver) {
		super(mappedElement, driver);
	}

	public void ClickButton() {
		_mappedElement.click();	
	}

	public void DoubleClick() {
		Actions actions = new Actions(_driver);
		actions.doubleClick(_mappedElement).perform();
	}

	public void RightClickButton() {
		Actions actions = new Actions(_driver);
		actions.contextClick(_mappedElement).perform();	
	}


}
