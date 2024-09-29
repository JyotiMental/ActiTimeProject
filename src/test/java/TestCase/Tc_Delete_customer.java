package TestCase;

import org.testng.annotations.Test;

import Utils.BasePage;
import Utils.BaseTest;

public class Tc_Delete_customer extends BaseTest
{
	@Test
	public void DeleteCustomer() throws Throwable
	{
		home.Taskbutton();
		Thread.sleep(2000);
		deletecustomer.DeleteCustomer();
	}
}
