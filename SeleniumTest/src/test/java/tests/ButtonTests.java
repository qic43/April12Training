package tests;

import org.testng.annotations.Test;

import pages.ButtonPage;

import static org.testng.Assert.assertEquals;

public class ButtonTests extends TestSuperClass {

	@Test
	public void canClickButton() {
		String expectedMessage = "You have done a dynamic click";

		String message = new ButtonPage(driver, baseUrl)
				.navigate()
				.clickButtonAndGetClickedButtonMessage();

		assertEquals(message, expectedMessage, "the button click message should be as expected.");
	}

	@Test
	public void canDoubleClickButton() {
		String expectedMessage = "You have done a double click";

		String message = new ButtonPage(driver, baseUrl)
				.navigate()
				.doubleClickButtonAndGetClickedButtonMessage();

		assertEquals(message, expectedMessage, "the button doubleclick message should be as expected.");		
	}
	
	@Test
	public void canRightClickButton() {
		String expectedMessage = "You have done a right click";

		String message = new ButtonPage(driver, baseUrl)
				.navigate()
				.rightClickButtonAndGetClickedButtonMessage();

		assertEquals(message, expectedMessage, "the button doubleclick message should be as expected.");		
	}
}
