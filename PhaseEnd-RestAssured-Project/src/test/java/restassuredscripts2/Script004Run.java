package restassuredscripts2;

import org.testng.annotations.Test;

public class Script004Run {

	
	@Test
	public void Put_Method_Call() {

		String[] status= {"available_DEV","available_QA","available_PROD"};
		for (int i = 0; i < status.length; i++) {
			Script004PUTCall.put_Method(status[i]);
		}
	
	}
}
