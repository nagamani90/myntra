package questions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class pavan
{
	WebDriver driver;
	@Test
	public void arbudget()throws IOException, Exception
	{   
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arte262_pavan\\Downloads\\geckodriver-v0.20.1-win64 (1)\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http:www.facebook.com/");
}
}