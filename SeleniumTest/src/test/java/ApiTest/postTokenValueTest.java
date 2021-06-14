package ApiTest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;

public class postTokenValueTest {
	@Test
	public void postTokenValue() {

		JSONObject request = new JSONObject();
		request.put("email", "eve.holt@reqres.in");
		request.put("password", "cityslicka");

		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/login").then().body("token",equalTo("QpwL5tke4Pnpja7X4"));

	}
}
