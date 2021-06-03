package tests;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.AlertPage;

public class ButtonAlertTests extends TestSuperClass{
	
  @Test
  public void getAlert() {
	  String expectedMessage = "You clicked a button";
	  
	  String result = new AlertPage(driver,baseUrl).navigate().getClickButtonAlertMessage();
	  
	  //System.out.println(result);
	  assertEquals(result,expectedMessage, "The alert message should be expected");
	  
  }
  
  @Test
  public void getAlertAfter5Seconds() {
	  String expectedMessage = "This alert appeared after 5 seconds";
	  
	  String result = new AlertPage(driver,baseUrl).navigate().waitAndGetClickButtonAlertMessage();
	  
	  //System.out.println(result);
	  assertEquals(result,expectedMessage, "The alert message should be expected"); 
  }
  
  @Test
  public void clickandGetOkMessage() {
	  String expectedMessage = "You selected Ok";
	  
	  String result = new AlertPage(driver,baseUrl).navigate().clickOKfromAlert();
	  
	  //System.out.println(result);
	  assertEquals(result,expectedMessage, "The alert message should be expected");
	  
  }
  
  @Test
  public void clickandGetName() {
	  String name = "name";
	  String expectedMessage = "You entered name";
	  
	  String result = new AlertPage(driver,baseUrl).navigate().enterNameandClick(name);
	  
	  //System.out.println(result);
	  assertEquals(result,expectedMessage, "The alert message should be expected");
	  
  }
}
