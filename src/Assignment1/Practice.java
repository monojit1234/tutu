package Assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice 
{

	public static void main(String[] args) 
	{
		
		/*String S1="ABC";
		String S2="ABC"; 
		System.out.println(S1==S2); //True will be printed 
		System.out.println(S1=S2); //The value of S2 WILL BE PRINTED
		String S3="gg"; 
		System.out.println(S1=S3); //The value of S3 WILL BE PRINTED
		*/
		
		
		
		// USING CONTINUE TO SKIP A LOOP 
		/*for(int i=1;i<=3;i++)
		{
		  for(int j=1;j<=3;j++)
		  {
			  if(i==2 & j==2)
			  {
				  continue;
			  }
			  System.out.println(i+" "+j);
		  }
		}*/
		
		/*System.out.println("The values that are passed through CMD are");
		for(int j=0;j<args.length;j++)
		  {
			 System.out.println(args[j]);
		  }*/
		
		//SWITCH STATEMENT WHERE THERE IS NO BREAK :   OUTPUT:  IT WILL PRIENT ALL THE NEXT STATEMENT TILL IT GETS A BREAK
		/*int cond=15;
		switch(cond)
		{
		case 10: System.out.println("Printed"+" "+10);
		         
		case 15: System.out.println("Printed"+" "+15);
		         
		case 20: System.out.println("Printed"+" "+20);
		         
		default: System.out.println("Out of Range");
		         
		}*/
		
		
		//FOR LOOP WITH EMPTY PARAMETERS     OUTPUT: INFINITE STATEMENT
		/*for(;;)
		{
			System.out.println("This is the output");
		}*/
		
		
		//DO WHILE WITH ALWAYS TRUE CONDITION  OUTPUT: INFINITE STATEMENT
       /*do
		{
			System.out.println("This is the output");
		}
		while(true);*/
		
		
		
		//DO WHILE WITH ALWAYS FALSE CONDITION  OUTPUT: This is the output
		/*		do
				{
					System.out.println("This is the output");
				}
				while(false);*/
		
		
		//Retriving value from DRPDOWNLIST CODE
        /*		 System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");	
	      WebDriver driver=new FirefoxDriver();
	
	      driver.get("https://indianfrro.gov.in/frro/FormC/accom_reg.jsp");
	      //name="u_nationality"
	      Select D=new Select(driver.findElement(By.xpath("//select[@name='u_secques']")));  //Here select is a class
	     	      
	      List<WebElement> L=D.getOptions();
	      System.out.println(L.size());
	      for(WebElement i : L)
	      {
	    	  System.out.println(i.getText());
	      }
	      for(int i=0;i<L.size();i++)
	      {
	    	  System.out.println(L.get(i).getText());
	      }*/
		
		
		//NUMBER RELATED PROGRAM(a number if it not having digit 3 then it is lucky number else we decrement by 1 until become lucky number)
		/*int Number=93,dig,Act_No;
		int A[]=new int[4];
		Act_No=Number;
		int i=3,count=1;
		String Num="";
		while(Number>0)
		{
			
			dig=Number%10;
			
			if(dig==3)
			{
				Number=Act_No-count;
				Num="";
				count++;
				continue;
				
				
			}
			else
			{
				
				Num=String.valueOf(dig)+Num;
			
						
			}
			Number=Number/10;
		}
		
		System.out.println(Num);*/
	
		//Occurance of Alphabets
		String str="Monojit Paul",revstr="",substr="";
		int len=str.length();
		char B[]=new char[len];
		B=str.toCharArray();
		int cnt=0;
		Hashtable hm=new Hashtable<Character,Integer>();
		Set<Character> s=hm.keySet();
		for(int k=0;k<len;k++)
		{
			char let=B[k];
			for(int l=0;l<len;l++)
			{
				if(let==B[l])
				{
				
				cnt++;
				//substr=let+String.valueOf(cnt);
				}
				
			}
			hm.put(let, cnt);
			cnt=0;
			//revstr=revstr+substr;
		}
		for(Character s1: s)
		{
			revstr=revstr+s1+hm.get(s1);
		}
		System.out.println(revstr);
	}





}
