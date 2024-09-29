package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	public Select sel;
	public WebDriver driver;
	//Select
	public void selectByText(WebElement element,String text)
	{
		sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectByindex(WebElement element,int i)
	{
		sel = new Select(element);
		sel.selectByIndex(i);
	}
	public void selectByvalue(WebElement element,String value)
	{
		sel = new Select(element);
		sel.selectByValue(value);
	}
	//webdriverinterface
	public String getUrl()
	{
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public String getTitle()
	{
		String title = driver.getTitle();
		return title;
	}

}
