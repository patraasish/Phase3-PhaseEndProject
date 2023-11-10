package restassuredscipts;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script003DeleteCall {
	
	
	public static void delete_Method(int petID) {

		
		//URL: https://petstore.swagger.io/v2/pet/2003
		
		String path="/v2/pet/"+petID;

		Response response = RestAssured
				.given()
				.baseUri("https://petstore.swagger.io")
				.basePath(path)
				.contentType("application/json")
				.when()
				.delete()
				.then()
				.statusCode(200)
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
