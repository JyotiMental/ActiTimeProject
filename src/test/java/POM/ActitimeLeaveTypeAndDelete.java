package POM;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.ExcelLibClass;

public class ActitimeLeaveTypeAndDelete extends ExcelLibClass
{
	WebDriver driver;
	//declaration

	@FindBy (xpath = "//div[.='New Type']")
	private WebElement newleavetype;

	@FindBy (xpath = "//div[@class='components-DraggableList-DraggableListItem-itemContainer--oHGyrzNS']")
	private List<WebElement>allsuggestion;

	@FindBy (xpath = "(//span[.='mo icha mu chutti nebi']/../../../../..)[1]//div[@class='components-Dropdown-trigger--SPOLzjyM']")
	private WebElement threebuttonleavetype;

	@FindBy (xpath = "//span[.='Delete']/../..")
	private WebElement deleteleavetypebutton;

	@FindBy (xpath = "//button[text()='OK, Delete']")
	private WebElement okdeleteleavetypebutton;

	//initialization
	public ActitimeLeaveTypeAndDelete(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//utilization

	public void newleavetype() 
	{
		newleavetype.click();
	}
	public void deleteleavetype() throws Throwable 
	{

		Actions action = new Actions(driver);
		action.moveToElement(threebuttonleavetype).perform();
		Thread.sleep(2000);
		action.click(threebuttonleavetype).perform();
		Thread.sleep(2000);
		deleteleavetypebutton.click();
		Thread.sleep(2000);
		okdeleteleavetypebutton.click();
	}

}
