package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowser 
{
   public WebDriver driver;
   
  
   @Parameters("Browser")
   @BeforeClass()
   public void Browser(String Browser)
   {
		
		switch(Browser)
		{
		case "Firefox":
			            System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");//SET THE DRIVER PATH BASED ON LOCAL SYSTEM
			            driver=new FirefoxDriver();
			            break;
			            
		case "IE":      
			            DesiredCapabilities dc=DesiredCapabilities.internetExplorer();
			            dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			            System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");//SET THE DRIVER PATH BASED ON LOCAL SYSTEM
                        driver=new InternetExplorerDriver();
                        break;
		}
		
   }
   
   
   @Test
   public void GoogleTitle()
   {
	   
	   driver.get("https://www.google.com/");
	   System.out.println(driver.getTitle());
	
   }
   
/*   @AfterTest()
   public void Close()
   {
	   driver.close();
   }
   */
	
}
