package TestCase;

import org.testng.annotations.Test;

import Utils.BasePage;
import Utils.BaseTest;

public class Tc_Delete_Types_Of_Work extends BaseTest
{
	@Test
	public void DeleteTypeOfWork() throws Throwable
    {
		home.settings();
		settings.typesofwork();
		Thread.sleep(2000);
		typesofworkanddelete.deletetypesofwork();
	}
}
