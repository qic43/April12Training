import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewLinksPage extends PageSuperClass{

	@FindBy(how = How.ID, using="simpleLink")
	private WebElement homeButton;

	@FindBy(how = How.ID, using="created")
	private WebElement createdButton;

	protected NewLinksPage(WebDriver driver) {
		super(driver);
	}

	public NewLinksPage navigate() {
		driver.navigate().to("https://demoqa.com/links");

		return this;
	}

	public NewLinksPage clickHomeButtonAndJoinNowButton() {

		homeButton.click();

		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}

		WebElement joinNow = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/a/img"));

		joinNow.click();

		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}

		return this;
	}

	public NewLinksPage clickCreatedButton() {

		createdButton.click();

		return this;
	}

	public String getTextRespone() {
		
		String result =  driver.findElement(By.id("linkResponse")).getText();

		return result;

	}

	public String getURL() {
		String url = driver.getCurrentUrl();

		return url;
	}



}
