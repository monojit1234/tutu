package Assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser 
{

	public WebDriver Browsers(String browser)
	{
		WebDriver driver=null;
		switch(browser)
		{
		case "Firefox":
			            System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");//SET THE DRIVER PATH BASED ON LOCAL SYSTEM
			            driver=new FirefoxDriver();
			            break;
			            
		case "IE":      
			            DesiredCapabilities dc=DesiredCapabilities.internetExplorer();
			            dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, false);
			            System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");//SET THE DRIVER PATH BASED ON LOCAL SYSTEM
                        driver=new InternetExplorerDriver();
                        break;
		}
		                return driver;
	}
}
