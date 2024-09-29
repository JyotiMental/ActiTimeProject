package TestCase;

import org.testng.annotations.Test;

import Utils.BasePage;
import Utils.BaseTest;

public class Tc_create_new_customer extends BaseTest
{
	@Test
	public void  createCustomer()
	{
		home.Taskbutton();
		newcustomer.Addcustomer();
		newcustomer.createCustomer();
	}
}
