package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviders 
{
  @Test(dataProvider = "dp")
  public void name(String s)
  {
	  System.out.println("Names are "+" "+s);
  }

  @DataProvider(name="dp")     
  // @DataProvider --Like that also it will work
  public Object[][] dp() {
    return new Object[][] 
    		{
    			{ "Monojit Paul" },
    			{ "Debojit Paul" },
    			{ "Chiranjit Paul" }
    		};
  }
}
