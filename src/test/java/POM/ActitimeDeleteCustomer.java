package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ExcelLibClass;

public class ActitimeDeleteCustomer extends ExcelLibClass
{
	WebDriver driver;
	//declaration
	
	@FindBy(xpath = "(//input[@placeholder='Start typing name ...'])[1]")
	private WebElement searchButton;
	
	@FindBy (xpath = "//span[text()='jyotishree']")
	private WebElement jyotishreeclick;

	@FindBy (xpath = "//span[text()='jyotishree']/../../..//div[@class='editButton']")
	private WebElement customerEditButton;
	
	@FindBy (xpath = "(//div[.='ACTIONS'])[1]/..")
	private WebElement actionbutton;
	
	@FindBy (xpath = "(//div[@class='deleteButton'])[1]")
	private WebElement deletebutton;

	@FindBy (xpath = "//span[.='Delete permanently']/..")
	private WebElement deletepermanentlybutton;
	//initialization
	public ActitimeDeleteCustomer(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//utilization

	public void DeleteCustomer() throws Throwable
	{
		Thread.sleep(2000);
		searchButton.sendKeys("jyotishree");
		jyotishreeclick.click();
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(customerEditButton).perform();
		action.click(customerEditButton).perform();
		Thread.sleep(3000);
		actionbutton.click();
		action.scrollToElement(deletebutton).perform();
		action.moveToElement(deletebutton).perform();
		action.click(deletebutton).perform();
		action.scrollToElement(deletepermanentlybutton).perform();
		action.moveToElement(deletepermanentlybutton).perform();
		action.click(deletepermanentlybutton).perform();
		driver.switchTo().alert().accept();
		
	}

}

