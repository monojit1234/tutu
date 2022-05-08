package WalletHub;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass 
{
	public static WebDriver dvr;

	public static WebDriver Browsers(String browser)
	{
		
		switch(browser)
		{
			case "Firefox":
		            		System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");          //SET THE DRIVER PATH BASED ON LOCAL SYSTEM
		            		dvr=new FirefoxDriver();
		            		break;
		            
			case "IE":      
		            		DesiredCapabilities dc=DesiredCapabilities.internetExplorer();
		            		dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, false);
		            		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");                //SET THE DRIVER PATH BASED ON LOCAL SYSTEM
		            		dvr=new InternetExplorerDriver();
		            		break;
                    
			case "Chrome": 	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");               //SET THE DRIVER PATH BASED ON LOCAL SYSTEM
	                		dvr=new ChromeDriver();                
	   }
	                return dvr;
    }
	
	public static void setup()
	{
		dvr.manage().window().maximize();
		dvr.manage().deleteAllCookies();
		dvr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	public static void teardown()
	{
		dvr.close();
	}

}
