package restassuredscript3;

import static org.hamcrest.Matchers.equalTo;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script005GETCall {

	
	@Test
	public void get_Method() {

		
		// URL: https://petstore.swagger.io/v2/user/Uname001
		
		

		Response response = RestAssured
				.given()
				.baseUri("https://petstore.swagger.io")
				.basePath("/v2/user/Uname001")
				.contentType("application/json")
				.when()
				.get()
				.then()
				.statusCode(200)
				.body("username", equalTo("Uname001"))
				.body("email", equalTo("Positive@Attitude.com"))
				.body("userStatus",equalTo(1))
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
