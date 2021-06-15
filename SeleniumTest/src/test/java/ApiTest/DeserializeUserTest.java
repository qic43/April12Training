package ApiTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import ApiTest.ApiTest.User;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

public class DeserializeUserTest {
  @Test
  public void singletest() {
	  
	  
	 User myUser = get("https://reqres.in/api/users/2").as(User.class);
	 System.out.println("user is : " + myUser.toString());
	  
	 // assertEquals(myUser.getId(),2);
  }
  
  @Test
  public void listtest() {
	  
	  
		 List<User> myUser = Arrays.asList(get("https://reqres.in/api/users?page=2").as(User.class));
		 System.out.println("user is : " + myUser.toString());
		  
		 // assertEquals(myUser.getId(),2);
	  }
  
}
