import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageSuperClass {
	protected WebDriver driver;
	
	protected PageSuperClass(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

}
