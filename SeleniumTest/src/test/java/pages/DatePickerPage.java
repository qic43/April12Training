package pages;

import java.time.LocalDate;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ControlExtensions.DatePicker;

public class DatePickerPage extends PageSuperClass{

	private String pageUrl = "date-picker";
	
	@FindBy(how = How.XPATH, using="//*[@id=\"datePickerMonthYearInput\"]")
	private WebElement datePickerMonthYearInput;

	public DatePickerPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public DatePickerPage navigate() {
		super.navigate(pageUrl);
		
		return this;
	}

	public DatePickerPage setDate(LocalDate date) {
		DatePicker dp = new DatePicker(datePickerMonthYearInput, driver);
		dp.setValue(date);
		return this;
	}

	public String getValue() {

		return datePickerMonthYearInput.getAttribute("value");
	}
	
	

}
