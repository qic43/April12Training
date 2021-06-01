package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DragAndDropPage;

public class DragAndDropTest extends TestSuperClass{
  @Test
  public void DragAndDrop() {
	  
	  String expectedMessage = "Dropped!";
	  
	  String result = new DragAndDropPage(driver,baseUrl).navigate().drag().getText();
	  
	  assertEquals(result,expectedMessage, "The result should be expected after drag and drop");
  }
}
