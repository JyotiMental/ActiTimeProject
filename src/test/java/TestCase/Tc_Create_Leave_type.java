package TestCase;

import org.testng.annotations.Test;

import Utils.BasePage;
import Utils.BaseTest;

public class Tc_Create_Leave_type  extends BaseTest
{
	
@Test
public void CreateLeave() throws Throwable
	{
		home.settings();
		settings.leavetype();
		leavetypeanddelete.newleavetype();
		createleavetype.createnewleavetype();
	}
}
