package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods 
{
	
	public void Login(String UserName,String Password,String browser)
	{
		WebElement Status,Post;
		Browser br=new Browser();
		WebDriver driver=br.Browsers(browser);
		WebDriverWait Wait=new WebDriverWait(driver,30);
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.xpath("//*[@id='email']")).sendKeys(UserName);
	    driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Password);
	    driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	    Status=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("xhpc_message")));
	    Status.click();
	    Status.sendKeys("Hello World");
		Post=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[starts-with(@id,'js_')]/div[2]/div[3]/div/div[2]/div/button")));
	    Post.click();
	    
	    
	}

}