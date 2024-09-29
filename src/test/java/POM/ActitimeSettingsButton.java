package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ExcelLibClass;

public class ActitimeSettingsButton extends ExcelLibClass
{
	WebDriver driver;

	@FindBy (xpath = "//a[text()='Types of Work']")
	private WebElement typesofworkbutton;
	
	@FindBy (xpath = "//a[text()='Leave Types']")
	private WebElement leavetypebutton;

	//initialization

	public ActitimeSettingsButton(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//utilization
	
	public void typesofwork() 
	 {
		typesofworkbutton.click();
	}
	public void leavetype()
	{
		leavetypebutton.click();
	}
}
