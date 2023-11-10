package restassuredscripts5;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script007GETParams {
	
	@Test(priority = 1)
	public void get_Method1() {

		
		//URL: https://petstore.swagger.io/v2/pet/findByStatus
		
		
		Response response = RestAssured
				.given()
				.baseUri("https://petstore.swagger.io")
				.basePath("/v2/pet/findByStatus")
				.param("status", "available")
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
	
	@Test(priority = 2)
	public void get_Method2() {

		
		//URL: https://petstore.swagger.io/v2/pet/findByStatus
		
		
		Response response = RestAssured
				.given()
				.baseUri("https://petstore.swagger.io")
				.basePath("/v2/pet/findByStatus")
				.param("status", "pending")
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
	
	@Test(priority = 3)
	public void get_Method3() {

		
		//URL: https://petstore.swagger.io/v2/pet/findByStatus
		
		
		Response response = RestAssured
				.given()
				.baseUri("https://petstore.swagger.io")
				.basePath("/v2/pet/findByStatus")
				.param("status", "sold")
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
