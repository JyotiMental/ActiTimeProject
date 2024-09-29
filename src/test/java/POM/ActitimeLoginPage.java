package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.Base;
import Utils.ExcelLibClass;
import Utils.Helper;

public class ActitimeLoginPage extends ExcelLibClass
{
	String expectedversionofActitime = "actiTIME 2024 Online";
	String expectedtitle ="actiTIME -  Login";
	String expectedurl = "https://online.actitime.com/qspider/login.do";
	WebDriver driver;
	//declaration

	@FindBy (xpath = "//input[@name='username']")
	private WebElement usernametextfield;

	@FindBy (xpath = "//input[@placeholder='Password']")
	private WebElement passwordtextfield;

	@FindBy (xpath = "//input[@id='keepLoggedInCheckBox']")
	private WebElement keepmelogincheckbox;

	@FindBy (xpath = "//div[.='Login ']")
	private WebElement loginbutton;

	@FindBy (xpath = "//a[.='Forgot your password?']")
	private WebElement forgotpasswordlink;

	@FindBy (xpath = "//nobr[.='actiTIME 2024 Online']")
	private WebElement versionofActitime;

	@FindBy (xpath = "//a[.='actiTIME Inc.']")
	private WebElement inclink;


	//initialization

	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//utilization

	public void loginvalidation ()
	{
		String actualtitle = driver.getTitle();
		if (expectedtitle.equals(actualtitle)) 
		{
			System.out.println("Title is matching");
		}
		else 
		{
			System.out.println("Title is not matching");
		}
		String actualurl = driver.getCurrentUrl();
		if (expectedtitle.equals(actualurl)) 
		{
			System.out.println("Url is matching");
		}
		else
		{
			System.out.println("Url is not matching");
		}
		String actualversion = versionofActitime.getText();
		if (expectedversionofActitime.equals(actualversion)) 
		{
			System.out.println("version is matching");
		}
		else 
		{
			System.out.println("version is not matching");
		} 

		System.out.println("Username is Displayed :- "+usernametextfield.isDisplayed());
		System.out.println("Username is Enable :- "+usernametextfield.isEnabled());

		System.out.println("Password is Displayed :- "+passwordtextfield.isDisplayed());
		System.out.println("Password is Enable :- "+passwordtextfield.isEnabled());

		System.out.println("loginButton is Displayed :- "+loginbutton.isDisplayed());
		System.out.println("loginButton is Enable :- "+loginbutton.isEnabled());

		System.out.println("INCLink is Displayed :- "+inclink.isDisplayed());
		System.out.println("INCLink is Enable :- "+inclink.isEnabled());

		System.out.println("ForgottenPassword is Displayed :- "+forgotpasswordlink.isDisplayed());
		System.out.println("ForgottenPassword is Enable :- "+forgotpasswordlink.isEnabled());

		System.out.println("Checkbox is Displayed :- "+keepmelogincheckbox.isDisplayed());
		System.out.println("CheckBox is Enable :- "+keepmelogincheckbox.isEnabled());
	}
	public void login() throws Throwable 
	{
		Helper.heighlightElement(usernametextfield);
		usernametextfield.sendKeys(ExcelLibClass.getcradencials(0, 0));
		Helper.heighlightElement(passwordtextfield);
		passwordtextfield.sendKeys(ExcelLibClass.getcradencials(1, 0));
		Thread.sleep(1000);
		keepmelogincheckbox.click();
		Thread.sleep(3000);
		loginbutton.click();
	}
	public void forgotpassword() 
	{
		forgotpasswordlink.click();
	}
	public void inclink() 
	{
		inclink.click();
	}
}
