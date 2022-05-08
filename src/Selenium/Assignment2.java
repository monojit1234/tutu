package Selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 
{
	public static void main(String[] args) throws InterruptedException
	{

		Browser br=new Browser();
		String Comments,Result,Browser;
		Browser="IE";								//FOR INTERNET EXPLORER, SET IE(In Caps).
		WebDriver dvr=br.Browsers(Browser);
		WebDriverWait Wait=new WebDriverWait(dvr,30);
		Actions A=new Actions(dvr);
		WebElement E1,E2,E3,E4,E5,E6,E7,E8,E9,E10,E11;
		
		dvr.get("https://wallethub.com/join/light");
		Wait.until(ExpectedConditions.titleIs("Join WalletHub"));
		dvr.findElement(By.xpath("//*[@id='join-light']/form/div/nav/ul/li[1]/a")).click();
		dvr.findElement(By.xpath("//*[@id='join-light']/form/div/div[1]/input")).sendKeys("paulmonojit.mount@gmail.com");	//PASS THE USER NAME
		dvr.findElement(By.xpath("//*[@id='join-light']/form/div/div[2]/input")).sendKeys("Wallethub@123");					//PASS THE PASSWORD
		dvr.findElement(By.xpath("//*[@id='join-light']/form/div/div[3]/button")).click();
		Wait.until(ExpectedConditions.titleContains("@"));
		dvr.get("https://wallethub.com/profile/test_insurance_company/");
		Wait.until(ExpectedConditions.titleContains("Test Insurance"));
		dvr.manage().window().maximize();
		
		Thread.sleep(2000);
		
		E1=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("af-icon-cross")));
		E1.click();
		
		
        A.moveToElement(dvr.findElement(By.xpath("//div[contains(@class,'wh-rating-notes')]"))).perform();
        E2=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[starts-with(@class,'wh-rating-choices') and starts-with(@style,'display')]/div/a[text()='4']")));
        A.moveToElement(E2).click().build().perform();
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='overallRating']/a")));
       
        Thread.sleep(1000); 
        
        dvr.navigate().back();
		E3=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='wh-body-inner']/div[2]/div[3]/a/span")));
		E3.click();
		E4=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='reviewform']/div[1]/div/div/span[2]/i")));
		A.moveToElement(E4).click().build().perform();
		E5=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='reviewform']/div[1]/div/ul/li[2]/a")));
		A.moveToElement(E5).click().build().perform();
		
		Thread.sleep(4000);
		
		E6=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='overallRating']/a[5]")));
		E6.click();
		Comments="Ours Health Insurance provided by a company is not only insuring your health"
				+" "+"but also supporting your wealth.In this era every human must have covered by"
				+" "+"health insurance rather normal life insurance or other policy.People usually avoid to"
				+" "+"buy any health insurance policy since they don't have much awareness of it."
				+" "+"We human never know when we will get ill and upto what level.So during that to get"
				+" "+"cure, we may not have good finance and may suffer a lot.So this is a biggest risk of life.To avoid"
				+" "+"the biggest risk we should an health insurance.So please have an health insurance policy for"
				+" "+"you and your family.";
		E7=dvr.findElement(By.xpath("//*[@id='review-content']"));
		E7.clear();
		A.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		E8=dvr.findElement(By.xpath(".//*[@id='viewport']/header/div/nav[3]/a[3]"));
		E9=dvr.findElement(By.xpath("//a[text()='Profile']"));
		A.moveToElement(E8).moveToElement(E9).click().build().perform();
		E10=Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='wh-body-inner']/div[1]/div[1]/div[2]/ul/li[3]/a")));
		E10.click();
		E11=dvr.findElement(By.xpath(".//*[@id='review741431']/p"));
		Result=E11.getText().trim();
		Assert.assertTrue("FAIL",Result.equals(Comments.trim()));
		System.out.println("Execution Completed");
	}

}