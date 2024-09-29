package Utils;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import POM.ActitimeCreatNewCustomer;
import POM.ActitimeCreateLeaveType;
import POM.ActitimeCreateTypesOfWork;
import POM.ActitimeDeleteCustomer;
import POM.ActitimeHomePage;
import POM.ActitimeLeaveTypeAndDelete;
import POM.ActitimeLoginPage;
import POM.ActitimeSettingsButton;
import POM.ActitimeTypesOfWorkAndDelete;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends Base
{
	@BeforeSuite
	public void m1()
	{
		System.out.println("Execution Started in Suite Level");
	}
	@AfterSuite
	public void m2()
	{
		System.out.println("Execution ended in Suite Level");
	}
	@BeforeTest
	public void m3()
	{
		System.out.println("Execution Started in Test Level");
	}
	@AfterTest
	public void m4()
	{
		System.out.println("Execution ended in Test Level");
	}
	@BeforeClass
	public void m5()
	{
		System.out.println("Execution Started in Class Level");

	}
	@AfterClass
	public void m6() throws Throwable
	{
		System.out.println("Execution ended in Class Level");
		Thread.sleep(3000);
		driver.quit();
	}
	@BeforeMethod
	public void m7() throws Throwable
	{
		System.out.println("Execution Started in Method Level");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		login = new ActitimeLoginPage(driver);
		home = new ActitimeHomePage(driver);
		newcustomer= new ActitimeCreatNewCustomer(driver);
		deletecustomer= new ActitimeDeleteCustomer(driver);
		settings= new ActitimeSettingsButton(driver);
		createleavetype= new ActitimeCreateLeaveType(driver);
		leavetypeanddelete= new ActitimeLeaveTypeAndDelete(driver);
		createtypesofwork= new ActitimeCreateTypesOfWork(driver);
		typesofworkanddelete=new ActitimeTypesOfWorkAndDelete(driver);
		
	}
	@AfterMethod
	public void m8() throws Throwable
	{
		Thread.sleep(5000);
		home.logout();
		System.out.println("Execution ended in Method Level");
		
	}


}
