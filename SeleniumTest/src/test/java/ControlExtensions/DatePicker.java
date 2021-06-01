package ControlExtensions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePicker extends ControlExtensionSuperClass implements DatePickers{

	public DatePicker(WebElement mappedElement, WebDriver driver) {
		super(mappedElement,driver);
	}

	public void setValue(LocalDate dateObject) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = dateObject.format(formatter);

		JavascriptExecutor js = (JavascriptExecutor)_driver;
		js.executeScript("(arguments[0]).setAttribute('value', '" + formattedDate + "')", _mappedElement);

	}


}
