package tests;

import java.time.LocalDate;
import java.util.Date;

import org.testng.annotations.Test;

import pages.DatePickerPage;

public class DatePickerTest extends TestSuperClass{
	@Test
	public void setDate() {

		String expectedDate = "05/20/2021";

		LocalDate date = LocalDate.of(2021,05,20);

		String result = new DatePickerPage(driver,baseUrl).navigate().setDate(date).getValue();
		
		String result2 = new DatePickerPage(driver,baseUrl).navigate().getValue();
		
		System.out.println("date is: " + result);
	}
}
