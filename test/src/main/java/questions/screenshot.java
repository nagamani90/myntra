package questions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class screenshot
{
	WebDriver driver;
	public void arbudget()throws IOException, Exception
	{   
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\arte262_pavan\\Downloads\\geckodriver-v0.20.1-win64 (1)\\geckodriver.exe");
		driver=new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("9666660919");
		
	//	driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("96666609199666660919");;
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		
		Thread.sleep(5000);
		try {
			System.out.println("no screenshot taken");
		} catch (Exception e) 
		{
			 TakesScreenshot ts= (TakesScreenshot)driver;
			 File src =ts.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src , new File("C:\\Users\\arte262_pavan\\Desktop\\pavan\\pavan workspace\\test\\pavan\\login.png"));
		}
		 driver.close();
}
	
}
