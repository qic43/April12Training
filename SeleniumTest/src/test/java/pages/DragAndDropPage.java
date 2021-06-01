package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DragAndDropPage extends PageSuperClass{
	
	private String pageUrl = "droppable";
	
	@FindBy(how = How.ID, using="draggable")
	private WebElement draggable;
	
	@FindBy(how = How.ID, using="droppable")
	private WebElement droppable;

	public DragAndDropPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public DragAndDropPage navigate() {
		super.navigate(pageUrl);

		return this;
	}

	public DragAndDropPage drag() {
		Actions act = new Actions(driver);
		act.dragAndDrop(draggable, droppable).build().perform();
		return this;
	}

	public String getText() {
		// TODO Auto-generated method stub
		return droppable.getText();
	}
	
		

}
