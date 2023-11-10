package restassuredscipts;

import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script001POSTCall {
	

	
	public static void post_Method(int petID) {
		
		//URL: https://petstore.swagger.io/v2/pet
				
		
		String data="{\r\n"
				+ "\"id\":"+ petID +",\r\n"
				+ "\"category\": {\r\n"
				+ " \"id\": 0,\r\n"
				+ " \"name\": \"string\"\r\n"
				+ "},\r\n"
				+ "\"name\": \"Doggie\",\r\n"
				+ "\"photoUrls\": [\r\n"
				+ " \"string\"\r\n"
				+ "],\r\n"
				+ "\"tags\": [\r\n"
				+ " {\r\n"
				+ " \"id\": 0,\r\n"
				+ " \"name\": \"string\"\r\n"
				+ " }\r\n"
				+ "],\r\n"
				+ "\"status\": \"available\"\r\n"
				+ "}";
		
		Response response = RestAssured
				.given()
				.baseUri("https://petstore.swagger.io")
				.basePath("/v2/pet")
				.contentType("application/json")
				.body(data)
				.when()
				.post()
				.then()
				.statusCode(200)
				.body("id", equalTo(petID))
				.extract()
				.response();
	
		
		System.out.println(response.getBody().asPrettyString());
		System.out.println("Status Code " + response.getStatusCode());
		System.out.println("Response Time: "+response.getTime());
		System.out.println("Content Type: "+response.getHeader("Content-Type"));
		int expectStatusCode = 200;
		int ActualStatusCode = response.getStatusCode();
		Assert.assertEquals(expectStatusCode, ActualStatusCode);
	}
}
