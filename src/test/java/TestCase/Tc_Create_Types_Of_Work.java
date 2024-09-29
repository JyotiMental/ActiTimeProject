package TestCase;

import org.testng.annotations.Test;

import Utils.BasePage;
import Utils.BaseTest;

public class Tc_Create_Types_Of_Work extends BaseTest
{
  @Test
  public void CreateTypeOfWork()
    {
		home.settings();
		settings.typesofwork();
		typesofworkanddelete.newtypesofwork();
		createtypesofwork.newtypesofwork();
	}
}
