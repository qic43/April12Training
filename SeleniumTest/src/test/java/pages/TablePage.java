package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import ControlExtensions.ReactTable;
import ControlExtensions.ReactTableRow;

public class TablePage extends PageSuperClass {

	private final String pageUrl = "webtables";

	@FindBy(how = How.XPATH, using="//div[contains(@class, 'ReactTable')]")
	private WebElement tableElement;
	
	public TablePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public TablePage navigate() {
		super.navigate(pageUrl);
		
		return this;
	}

	public String getFirstRowFirstCellValue() {
		return getReactTable().row(1).cell(1).getValue();
	}
	
	public String getCell(int ordinalRow, int ordinalCell) {
		return getReactTable().row(ordinalRow).cell(ordinalCell).getValue();
	}
	
	private ReactTable getReactTable() {
		return new ReactTable(tableElement, driver);		
	}

	public int findRowByCellValue(String valueToFind, int cellIndex) {
		List<ReactTableRow> rowElements = getReactTable().getrowList();
		for(int rowIndex = 0; rowIndex < rowElements.size(); rowIndex++) {
			String s  = rowElements.get(rowIndex).cell(cellIndex).getValue();
			if(s.equals(valueToFind)) {
				return rowIndex + 1;
			}
		}
		return 0;
	}
}