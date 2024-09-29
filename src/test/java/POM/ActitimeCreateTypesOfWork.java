package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ExcelLibClass;

public class ActitimeCreateTypesOfWork extends ExcelLibClass
{
     WebDriver driver;
	//declaration

	@FindBy (xpath = "//input[@placeholder='Enter name']")
	private WebElement entertypesofwork;

	@FindBy (xpath = "//span[text()='Save']")
	private WebElement savetypesofworkbutton;
	
	
	//initialization
	public ActitimeCreateTypesOfWork(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	//utilization
	public void newtypesofwork() 
	{
		entertypesofwork.click();
		entertypesofwork.sendKeys("cigarette tani ba ku jiba");
		savetypesofworkbutton.click();
	}
}
