package Package1;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Class1 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	   System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");	
       WebDriver driver=new FirefoxDriver();
       //driver.get("http://gmail.com");
       
       //RIGHT CLICK
      /* WebElement el=driver.findElement(By.linkText("Help"));
       Actions a=new Actions(driver);
       a.contextClick(el).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
       */ 
       
       
       //SCREEN SHOT CAPTURE
        /*File fs=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fs, new File("D:\\scn1.png"));
       */
       
       //MULTIPLE PAGE LINK
       /*List<WebElement> li=driver.findElements(By.tagName("a"));
       int size=li.size();
       for(WebElement we:li)
       {
    	   System.out.println(we.getText());
    	   we.click();
    	   driver.navigate().back();
       }
       
               // OR
       for(int i=0;i<size;i++)
       {
    	   System.out.println(li.get(i).getText());
    	   li.get(i).click();
    	   driver.navigate().back();
       }*/
       
       //MOUSE OVER AN ELEMENT
      /* WebElement el=driver.findElement(By.linkText("Terms"));
       Actions a=new Actions(driver);
       a.moveToElement(el,30,20).build().perform();
      */ 
       
       //Typing text in textbox without usning sendkeys
       /*WebElement wl=driver.findElement(By.xpath("//input[@id='identifierId' and @class='whsOnd zHQkBf' ]"));
       wl.sendKeys("paulmonojit.mount");
       
       
       JavascriptExecutor jsp=(JavascriptExecutor)driver;
       jsp.executeScript("document.getElementbyId('identifierId').value='paulmonojit.mount';");
       */               
       
       
       //===========================
       driver.get("http://www.choice-fm.co.uk/");

     //Build webElement object to contain menu link xpath for all the mainmenu links
     WebElement HomeLink = driver.findElement(By.xpath("//*[@id='globalNav']/ul/li[1]/a"));
     WebElement ShowsLink = driver.findElement(By.xpath("//*[@id='globalNav']/ul/li[2]/a"));  
     WebElement MusicLink = driver.findElement(By.xpath("//*[@id='globalNav']/ul/li[3]/a"));
     WebElement EventsLink = driver.findElement(By.xpath("//*[@id='globalNav']/ul/li[6]/a"));

     //Create an action object called myMouse
     Actions myMouse = new Actions(driver);

     //there is a slight delay before each mouse movement hence the "Thread.sleep" statement
     myMouse.moveToElement(ShowsLink).build().perform();   //Shows link
     Thread.sleep(5000L);
     myMouse.moveToElement(HomeLink).build().perform();   //home link
     Thread.sleep(5000L);
     myMouse.moveToElement(MusicLink).build().perform();   //Music link
     Thread.sleep(5000L);
     myMouse.moveToElement(EventsLink ).build().perform();   //Events link
     Thread.sleep(5000L);
     myMouse.moveToElement(HomeLink).build().perform();   //Home link
     Thread.sleep(5000L);
     myMouse.moveToElement(ShowsLink).build().perform();
       
       
       
       
       //==============================
       
       
       
        //driver.close();
       
	}

}
