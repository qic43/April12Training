package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPropertiesPage extends PageSuperClass{

	public DynamicPropertiesPage(WebDriver driver,String baseUrl) {
		super(driver, baseUrl);
	}

	public DynamicPropertiesPage navigate() {
		
		driver.navigate().to("https://demoqa.com/dynamic-properties");

		return this;
	}
	
	public String waitForVisibleAndGetResponse() {
		
		WebElement firstResult = new WebDriverWait(driver, 5)
		        .until(ExpectedConditions.elementToBeClickable(By.id("visibleAfter")));
		
		String result = firstResult.getText();
		
		return result;
	}



}
