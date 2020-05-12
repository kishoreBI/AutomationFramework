package testdata;

import org.testng.annotations.DataProvider;

public class dp {
  

  @DataProvider
  public Object[][] dp() 
  {
	  System.out.println("Data provider has been executed");
    return new Object[][] {
      new Object[] { 1, "selenium" },
      new Object[] { 2, "TestNg" },
    };
  }
}
