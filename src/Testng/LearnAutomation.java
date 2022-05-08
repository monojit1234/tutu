package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LearnAutomation 

{
	public WebDriver dvr;
	@BeforeClass
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");          //SET THE DRIVER PATH BASED ON LOCAL SYSTEM
		dvr=new ChromeDriver();
		dvr.manage().window().maximize();
		dvr.get("http://automationpractice.com");
		dvr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void steps()
	{
		dvr.findElement(By.linkText("Sign in")).click();
		dvr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		dvr.findElement(By.id("email")).sendKeys("paulmonojit.mount@gmail.com");
		dvr.findElement(By.id("passwd")).sendKeys("joygobinda");
		dvr.findElement(By.id("SubmitLogin")).click();
		dvr.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")).click();
	}
	
	
	@AfterClass
	public void close()
	{
		
		dvr.close();
	}
	

}
