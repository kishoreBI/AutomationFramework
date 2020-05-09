package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		 WebDriver driver;
		 driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     //String url="https://www.flipkart.com/";
	     String url="https://www.google.com/";
	     driver.get(url);

	 	System.out.println(driver.getCurrentUrl());
	 	System.out.println(driver.getTitle());
	 	/*WebElement close=driver.findElement(By.className("_2AkmmA_29YdH8"));
	 	close.click();*/
	 	WebElement search=driver.findElement(By.name("q"));
	 	search.sendKeys("Power Bank");

	}

}
