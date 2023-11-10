package restassuredscripts4;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script006GETUserLogin {

	
	
	@Test
	public void get_Method() {

		
		//URL: https://petstore.swagger.io/v2/user/login
		//"username": "Uname001"
		//"password": "@tt!tude",
		
		String username= "Uname001";
		String password= "@tt!tude";

		Response response = RestAssured
				.given()
				.baseUri("https://petstore.swagger.io")
				.basePath("/v2/user/login")
				.auth().preemptive().basic(username, password)
				.contentType("application/json")
				.when()
				.get()
				.then()
				.statusCode(200).log().all()
				.extract()
				.response();
	
		
		System.out.println("Status Code " + response.getStatusCode());
		System.out.println("Response Time: "+response.getTime());
		System.out.println("Content Type: "+response.getHeader("Content-Type"));
		int expectStatusCode = 200;
		int ActualStatusCode = response.getStatusCode();
		Assert.assertEquals(expectStatusCode, ActualStatusCode);
	}
}
