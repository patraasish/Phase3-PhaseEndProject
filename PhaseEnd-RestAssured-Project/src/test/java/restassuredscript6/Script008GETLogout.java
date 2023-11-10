package restassuredscript6;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script008GETLogout {
	 
		 @Test(priority = 2)
		public void get_Method2() {

			
			//URL: https://petstore.swagger.io/v2/user/logout
			
			
			Response response = RestAssured
					.given()
					.baseUri("https://petstore.swagger.io")
					.basePath("/v2/user/logout")
					.contentType("application/json")
					.when()
					.get()
					.then()
					.statusCode(200).log().all()
					.body("message", equalTo("ok"))
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
