package ControlExtensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ControlExtensionSuperClass {
	protected WebElement _mappedElement;
	protected WebDriver _driver;
	
	protected ControlExtensionSuperClass(WebElement mappedElement, WebDriver driver) {
		_mappedElement = mappedElement;
		_driver = driver;
	}

}
