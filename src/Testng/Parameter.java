package Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter 
{
  	
  
  @Parameters("p1")
  @Test
  public void name(String name) 
  {
	  System.out.println("My name is "+" "+name);
  }
}
