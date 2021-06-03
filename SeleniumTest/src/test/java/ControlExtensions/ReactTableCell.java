package ControlExtensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReactTableCell extends ControlExtensionSuperClass{
	
	public ReactTableCell(WebElement mappedElement, WebDriver driver) {
		super(mappedElement, driver);
	}

	public String getValue() {
		return _mappedElement.getText();
	}
}