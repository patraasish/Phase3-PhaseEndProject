package restassuredscripts2;

import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script004PUTCall {


	
		public static void put_Method(String status) {
		
		//URL: https://petstore.swagger.io/v2/pet
		
			String body="{\r\n"
					+ "\"id\": 9223372016900013000, \"category\": {\r\n"
					+ "\"id\": 20021,\r\n"
					+ "\"name\": \"string\"},\r\n"
					+ "\"name\": \"doggie\", \"photoUrls\": [\r\n"
					+ "\"string\"\r\n"
					+ "], \"tags\": [\r\n"
					+ "{\r\n"
					+ "\"id\": 0,\r\n"
					+ "\"name\": \"string\"\r\n"
					+ "}], \r\n"
					+ "\"status\":"+"\""+status+"\""+ "\r\n"
					+ "}\r\n"
					+ "";
		

		Response response = RestAssured
				.given()
				.baseUri("https://petstore.swagger.io")
				.basePath("/v2/pet")
				.contentType("application/json")
				.body(body)
				.when()
				.put()
				.then()
				.statusCode(200)
				.body("category.id", equalTo(20021))
				.body("status", equalTo(status))
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
