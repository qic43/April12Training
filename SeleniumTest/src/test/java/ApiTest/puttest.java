package ApiTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class puttest {
	@Test
	public void putTest() {

		JSONObject request = new JSONObject();
		request.put("name", "morpheus2");
		request.put("job", "zion resident");

		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").then().body("name",equalTo("morpheus2")).log().all();

	}
}
