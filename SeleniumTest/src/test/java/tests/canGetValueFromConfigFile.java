package tests;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;

import org.testng.annotations.Test;

import framework.ConfigurationProvider;

public class canGetValueFromConfigFile extends TestSuperClass{
  @Test
  public void getBrowserType() throws Exception {
	  HashMap<String, String> config = new ConfigurationProvider().getPropertiesFromResourceFile("config.properties");
	  String BrowserType = config.get("BrowserType");
	  
	  String expectedResult = "chrome";
	  
	  assertEquals(BrowserType, expectedResult, "the expected browser type should be returned");
	  
  }
}
