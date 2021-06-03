package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.TablePage;

public class ReactTableTests extends TestSuperClass {

	@Test
	public void canSelectFirstRowFirstCellInTable() {
		String expectedCellValue ="Cierra";
		
		String actualCellValue = new TablePage(driver, baseUrl)
				.navigate()
				.getFirstRowFirstCellValue();
		
		assertEquals(actualCellValue, expectedCellValue, "cell value should match as expected.");
	}
	
	@Test
	public void canSelectNonFirstRowNonFirstCellInTable() {
		String expectedCellValue ="45";
		int ordinalRow = 2;
		int ordinalCell = 2;
		
		String actualCellValue = new TablePage(driver, baseUrl)
				.navigate()
				.getCell(ordinalRow, ordinalCell);
		
		assertEquals(actualCellValue, expectedCellValue, "cell value should match as expected.");
	}
	
	@Test
	public void canFindRowNumberByCellValue() {
		String valueToFind ="Legal";
		int cellIndex = 5;
			
		int foundRow = new TablePage(driver, baseUrl)
				.navigate()
				.findRowByCellValue(valueToFind, cellIndex);
		System.out.println("Row Number = " + foundRow);
		assertTrue(foundRow > 0, "if row is found then return value should be positive.");
	}
	
	@Test
	public void canIdentifyWhenRowNotFound() {
		String valueToFind ="I don't exist.";
		int cellIndex = 5;
			
		int foundRow = new TablePage(driver, baseUrl)
				.navigate()
				.findRowByCellValue(valueToFind, cellIndex);
		
		assertTrue(foundRow == 0, "if row is not found then return value should be zero.");
	}
}