package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ExcelLibClass;
import Utils.Helper;

public class ActitimeCreateLeaveType extends ExcelLibClass
{
	WebDriver driver;
	//declaration

	@FindBy (xpath = "(//input[@class='components-Input-input--VrbmUCOo'])[1]")
	private WebElement enterleavetypename;


	@FindBy (xpath = "//span[.='Save']")
	private WebElement saveleavetype;

	//initialization
	public  ActitimeCreateLeaveType(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//utilization
	
	public void createnewleavetype() throws Throwable 
	{
		Helper.heighlightElement(enterleavetypename);
		enterleavetypename.sendKeys(ExcelLibClass.getcradencials(0, 1));
		saveleavetype.click();
	}
	
	
	
}
