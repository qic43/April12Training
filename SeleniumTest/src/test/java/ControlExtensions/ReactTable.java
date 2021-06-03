package ControlExtensions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReactTable extends ControlExtensionSuperClass{

	public ReactTable(WebElement mappedElement, WebDriver driver) {
		super(mappedElement,driver);
	}

	public ReactTableRow row(int ordinalRow) {
		int rowIndex = ordinalRow - 1;
		List<WebElement> rowElements = _mappedElement.findElements(By.cssSelector(".rt-tbody [role='row']"));	
		WebElement selectedRowElement = rowElements.get(rowIndex);

		ReactTableRow row = new ReactTableRow(selectedRowElement, _driver);
		
		return row;
	}

	public List<ReactTableRow> getrowList() {
		List<WebElement> rowElements = _mappedElement.findElements(By.cssSelector(".rt-tbody [role='row']"));
		List<ReactTableRow> rowList = new ArrayList<ReactTableRow>();
		
		for(WebElement selectedRowElement : rowElements) {
			rowList.add(new ReactTableRow(selectedRowElement,_driver));
		}
		
		return rowList;
	}
	
	
	
}