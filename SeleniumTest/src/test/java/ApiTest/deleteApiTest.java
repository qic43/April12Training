package ApiTest;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class deleteApiTest {
	
	@Test
	public void deleteTest() {
		when().delete("https://reqres.in/api/users/2").then().statusCode(204);
	}

}
