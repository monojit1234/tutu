package Testng;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_test 
{
	WebDriver driver;
	
/*	@BeforeTest
	public void Driver()
	{
		System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");          
        driver=new FirefoxDriver();
        System.out.println("Before Test");
        
	}
	@BeforeMethod
	public void Lunch()
	
	{

		driver.get("https://www.google.co.in");
		System.out.println("Before Method");
	}
	@Test
	public void TC()
	{
		System.out.println("TEST CASE 1");
	}
	@AfterMethod
	public void End()
	{
		driver.close();
		System.out.println("After Method");
	}*/
	
	@BeforeClass
	public void LunchBrow()
	{
		//WebDriver driver;
		System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");          
        driver=new FirefoxDriver();
        driver.get("https://www.google.com");
/*		DesiredCapabilities dc=DesiredCapabilities.internetExplorer();
        dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");//SET THE DRIVER PATH BASED ON LOCAL SYSTEM
        driver=new InternetExplorerDriver();
        driver.get("https://www.google.com");*/
	}
	@AfterClass
	public void CloseBrow()
	{
		//driver.close();
	}
	@Test
	public void TC1()
	{
		System.out.println("Gmail Link");
		driver.findElement(By.linkText("Gmail")).click();
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void TC2()
	{
		System.out.println("TC2");
		driver.findElement(By.linkText("Images")).click();
/*		driver.findElement(By.id("gs_htif0")).sendKeys("Selenium");
		driver.findElement(By.name("btnK")).click();*/
	}
	@Test
	public void TC3()
	{
		System.out.println("TC3");
	}
	
 
}
