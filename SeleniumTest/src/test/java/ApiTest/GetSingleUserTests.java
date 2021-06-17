package ApiTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetSingleUserTests {
	@Test
	public void getUserData() {

		given().get("https://reqres.in/api/users/2").then().body("data.id", equalTo(2));

		given().get("https://reqres.in/api/users/2").then().body("data.email", equalTo("janet.weaver@reqres.in")); 

	}
	
}
