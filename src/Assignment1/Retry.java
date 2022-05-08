package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Retry {

	public static void main(String[] args) {
		WebDriver driver=null;
		//System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");//SET THE DRIVER PATH BASED ON LOCAL SYSTEM
		//driver=new FirefoxDriver();
		int step=1;
		while(true)
		{
			try
			{
				while(step>0)
				{
					switch(step)
					{
					   case 1: System.out.println("Step 1");
					           step++;
					           break;
					           
					   case 2: System.out.println("Step 2");
			           			step++;
			           			break;
			           
					   case 3:  
					            //driver.findElement(By.id("id")).click();
					            System.out.println("Step 3");
			           			step++;
			           			break;
			           
					   case 4: System.out.println("Step 4");
			           			step++;
			           			break;
					           
					   case 5: System.out.println("Step 5");
			           			step++;
			           			break;
			           			
			             			
					}
					break;
				}
				
			}
			catch(Exception e)
			{
				step=step-1+1;
			}
			
		}
		

	}

}
