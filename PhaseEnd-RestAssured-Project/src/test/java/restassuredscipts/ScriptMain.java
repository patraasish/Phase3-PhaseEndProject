package restassuredscipts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ScriptMain {

	@Parameters({"petID"})
	@Test(priority = 1)
	public void post_Call_Method(int petID) {
		Script001POSTCall.post_Method(petID);
	}
	
	@Parameters({"petID"})
	@Test(priority = 2,dependsOnMethods="post_Call_Method")
	public void get_Call_Method(int petID) {
		Script002GETCall.get_Method(petID);
	}
	
	@Parameters({"petID"})
	@Test(priority = 3,dependsOnMethods="get_Call_Method")
	public void delete_Call_Method(int petID) {
		Script003DeleteCall.delete_Method(petID);
	}
	
	
}
