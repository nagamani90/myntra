package questions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webtables
{   
	
	
	WebDriver driver;
	@Test
	public void table()
	{
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte262_pavan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://W3schools.com");
		
		driver.findElement(By.xpath(".//*[@id='mySidenav']/div/a[1]")).click();
		driver.findElement(By.xpath(".//*[@id='leftmenuinnerinner']/a[18]")).click();
		
		
		List<WebElement> trs =driver.findElements(By.tagName("tr"));
		
		System.out.println("no.of rows are:"+trs.size());
		
		for (int i = 0; i <=trs.size(); i++)
		{
			System.out.println(trs.size(i).getText());
		}
	}

}
