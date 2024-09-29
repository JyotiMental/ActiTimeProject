package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Helper extends Base
{
	public static void heighlightElement(WebElement element) throws Throwable
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].setAttribute('style','background: purple')", element);
		Thread.sleep(3000);
		js.executeScript("arguments[0].setAttribute('style','background: lavender')", element);
	}

}
