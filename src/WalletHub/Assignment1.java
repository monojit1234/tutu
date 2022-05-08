package WalletHub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 extends BaseClass{

	public static void main(String[] args) 
	{
		String Username,Password,Browser;
		WebElement Status,Post;
		Browser="Chrome";                               //For other browser, for Internet Explore type IE,firefox type Firefox
		Username="paulmonojit.mount@gmail.com"; 									//PROVIDE THE Username
		Password="Joygobinda@123";                                    //PROVIDE THE Password
		
		Browsers(Browser);
		setup();
		dvr.get("https://www.facebook.com/");
		dvr.findElement(By.xpath("//*[@id='email']")).sendKeys(Username);
		dvr.findElement(By.xpath("//*[@id='pass']")).sendKeys(Password);
		dvr.findElement(By.xpath("//*[@id='loginbutton']")).click();
		WebDriverWait Wait=new WebDriverWait(dvr,30);
		Status=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("xhpc_message")));
	    Status.click();
	    Status.sendKeys("Hello World");
/*		Post=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[starts-with(@id,'js_')]/div[2]/div[3]/div/div[2]/div/button")));
	    Post.click();
	    teardown();*/
	    System.out.println("Execution of Assignment1 Completed");
		

	}

}
