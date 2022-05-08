package Assignment1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pageLink {

	public static void main(String[] args) throws IOException 
	{
		  System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");          //SET THE DRIVER PATH BASED ON LOCAL SYSTEM
          WebDriver driver=new FirefoxDriver();
          driver.get("https://www.google.co.in");
          WebElement we=driver.findElement(By.linkText("Gmail"));
          String li=we.getAttribute("href");
		
          URL u=new URL("https://www.google.co.in");
          HttpsURLConnection h=(HttpsURLConnection)u.openConnection();
          h.setConnectTimeout(3000);
          h.connect();
          System.out.println(h.getResponseCode());
          System.out.println(h.getResponseMessage());
          System.out.println(h.getContent());
          System.out.println(li);

	}

}
