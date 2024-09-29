package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ExcelLibClass;

public class ActitimeTypesOfWorkAndDelete extends ExcelLibClass
{
	WebDriver driver;
	//declaration

	@FindBy (xpath = "//div[text()='New Type']")
	private WebElement newtypesofwork;

	@FindBy (xpath = "(//span[.='cigarette tani ba ku jiba']/../../../..)[1]//div[@class='components-Dropdown-trigger--SPOLzjyM']")
	private WebElement threebuttontypesofwork;

	@FindBy (xpath = "//span[text()='Delete']/../..")
	private WebElement deletetypesofworkbutton;

	@FindBy (xpath = "//button[text()='OK, Delete']")
	private WebElement okdeletetypesofwork;

	//initialization
	public ActitimeTypesOfWorkAndDelete(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//utilization

	public void deletetypesofwork() throws Throwable 
	{
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(threebuttontypesofwork).perform();
		action.click(threebuttontypesofwork).perform();
		Thread.sleep(3000);
		deletetypesofworkbutton.click();
		Thread.sleep(2000);
		okdeletetypesofwork.click();
	}
	public void newtypesofwork() 
	{
		newtypesofwork.click();
	}
}
