package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ExcelLibClass;

public class ActitimeCreatNewCustomer extends ExcelLibClass
{
	WebDriver driver;
	//declaration
	@FindBy (xpath = "//div[.='Add New']/..")
	private WebElement AddNew;
	
	@FindBy (xpath = "//div[@class='item createNewCustomer']")
	private WebElement Newcustomer;
	
	@FindBy (xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernametextfield;

	@FindBy (xpath = "//div[text()='Create Customer']")
	private WebElement createnewcustomer;

	//initialization
	public  ActitimeCreatNewCustomer(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	//utilization
	
	
	public void Addcustomer()
	{
		AddNew.click();
		Newcustomer.click();
	}
	public void createCustomer()
	{
		
		entercustomernametextfield.sendKeys("jyotishree");
		createnewcustomer.click();
	}
}
