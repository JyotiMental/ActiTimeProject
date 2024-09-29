 package TestCase;

import org.testng.annotations.Test;

import Utils.BasePage;
import Utils.BaseTest;

public class Tc_Delete_Leave_type extends BaseTest
{
	@Test
	public void DeleteLeaveType() throws Throwable
	{
	    home.settings();
	    settings.leavetype();
	    leavetypeanddelete.deleteleavetype();
	}

}
