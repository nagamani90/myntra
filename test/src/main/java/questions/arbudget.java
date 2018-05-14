package questions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class arbudget 
{
	WebDriver driver;
	@Test(dataProvider="PAVAN")
	public void arbudget(String username,String mailid,String mobile,String password,String confirmpsw)
	{   
		Logger logger=Logger.getLogger("arbudget");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte262_pavan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		   driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		logger.info("browser launced");	
		driver.get("http://arbudgetbasket.com/Account/Registration");
		logger.info("app launced");	
		driver.findElement(By.xpath(".//*[@id='MainContent_TxtUName']")).sendKeys(username);
		logger.info("entered username");	
		driver.findElement(By.xpath(".//*[@id='MainContent_TxtEmail']")).sendKeys(mailid);
		logger.info("entered mailid");	
		driver.findElement(By.xpath(".//*[@id='MainContent_TxtMobile']")).sendKeys(mobile);
		logger.info("entered mobile number");	
		driver.findElement(By.xpath(".//*[@id='MainContent_TxtPwd']")).sendKeys(password);
		logger.info("entered password");	
		driver.findElement(By.xpath(".//*[@id='MainContent_TxtCPwd']")).sendKeys(confirmpsw);
		logger.info("entered password");	
		driver.findElement(By.xpath(".//*[@id='MainContent_SubmitBtn']")).click();
		logger.info("clicked on submitnuttion");	
	}
	@DataProvider(name="PAVAN")
	public Object[][] getData() throws IOException{
		
	ExcelDataProvider excel= new ExcelDataProvider("C:\\Users\\arte262_pavan\\Desktop\\PAVAN.xlsx");
	

	int row=excel.getRow("PAVAN");
	Object[][]data=new Object[row][5];
	for (int i = 0; i<row; i++)
	{
		data[i][0]=excel.getStringData("PAVAN", i, 0);
		data[i][1]=excel.getStringData("PAVAN", i, 1);
		data[i][2]=excel.getStringData("PAVAN", i, 2);
		data[i][3]=excel.getStringData("PAVAN", i, 3);
		data[i][4]=excel.getStringData("PAVAN", i, 4);
		
	}
	return data;
	}
}	
	

	
	
	
	
	
	
	
	
	
	
