package ControlExtensions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReactTableRow extends ControlExtensionSuperClass{


	protected ReactTableRow(WebElement mappedElement, WebDriver driver) {
		super(mappedElement,driver);
	}

	public ReactTableCell cell(int ordinalCell) {
		List<WebElement> cellElements = _mappedElement.findElements(By.cssSelector("div[role='gridcell']"));
		WebElement selectedCellElement = cellElements.get(ordinalCell);
		
		ReactTableCell cell = new ReactTableCell(selectedCellElement, _driver);
		
		return cell;
	}
	
}