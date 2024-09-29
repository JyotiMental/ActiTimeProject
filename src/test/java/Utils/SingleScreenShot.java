package Utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class SingleScreenShot implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result)
	{
		TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./ScreenShot/Failed1.png");

		try 
		{
			FileHandler.copy(source, destFile);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./ScreenShot/Failed1.png");

		try 
		{
			FileHandler.copy(source, destFile);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
