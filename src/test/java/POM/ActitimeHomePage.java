package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ExcelLibClass;

public class ActitimeHomePage extends ExcelLibClass
{
	String expectedurl ="https://online.actitime.com/qsp2/timetrack/enter.do";
	String expectedtitle="actiTIME -  Enter Time-Track";
	WebDriver driver;

	//declaration

	@FindBy (xpath = "(//a[@id='logoutLink'])[1]")
	private WebElement Logout;

	@FindBy (xpath = "//div[.='Tasks']/../..")
	private WebElement Taskbutton;

	@FindBy (xpath = "(//div[@class='menu_icon'])[2]/../..")
	private WebElement settinsgsbutton;

	//initialization

	public ActitimeHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//utilization

	public void HomePageValidation()
	{
		String actualtitle = driver.getTitle();
		String actualurl = driver.getCurrentUrl();

		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("Title is matching");
		}
		else
		{
			System.out.println("Title is not matching");
		}
		if (expectedurl.equals(actualurl))
		{
			System.out.println("Url is matching");
		}
		else 
		{
			System.out.println("Url is not matching");
		}
		System.out.println("LoginButton is displayed:-"+Logout.isDisplayed());
		System.out.println("LoginButton is enable:-"+Logout.isEnabled());

		System.out.println("TaskLink is displayed:-"+Taskbutton.isDisplayed());
		System.out.println("TaskLink is enable:-"+Taskbutton.isEnabled());
	}

	public void logout() throws Throwable
	{ 
		Thread.sleep(2000);
		Logout.click();
	}

	public void Taskbutton()
	{
		Taskbutton.click();
	}
	public void settings() 
	{
		settinsgsbutton.click();
	}
}


