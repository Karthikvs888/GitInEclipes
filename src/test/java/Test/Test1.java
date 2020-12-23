package Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1
{
	@Test
	public void tc_01()
	{
		Reporter.log("GitHub",true);
		Reporter.log("GitHub First Edit",true);
		Reporter.log("GitHub Second Edit",true);
	}

}
