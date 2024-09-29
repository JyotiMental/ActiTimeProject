package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ExcelLibClass;

public class ActimeTaskPage extends ExcelLibClass
{
	WebDriver driver;
	//declaration
	@FindBy (xpath = "//div[.='Add New']/..")
	private WebElement addnewbutton;
	
	@FindBy (xpath = "//div[@class='item createNewCustomer']")
	private WebElement createnewcustomerlink;
	
	@FindBy (xpath = "(//input[@placeholder='Start typing name ...'])[1]/../../..")
	private WebElement starttypingnamesearchbar;
	
	@FindBy (xpath = "//span[text()='jyotishree']/../../..//div[@class='editButton']")
	private WebElement clicktoviewcustomerbutton;
	//initialization
	public void ActitimeTaskpage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	//utilization
	
	public void CreateNewCustomer()
	{
		addnewbutton.click();
		createnewcustomerlink.click();
	}
	public void searchbar() 
	{
		starttypingnamesearchbar.click();
		starttypingnamesearchbar.sendKeys("jyotishree");
	    clicktoviewcustomerbutton.click();
	}
}
