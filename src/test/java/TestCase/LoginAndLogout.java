package TestCase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utils.BaseTest;

@Listeners(Utils.SingleScreenShot.class)
public class LoginAndLogout extends BaseTest
{
	@Test
	public void ActiLoginAndOut() throws Throwable
	{
		login.login();
		System.out.println("Login and Logout Done SuccessFully");
	}

}
