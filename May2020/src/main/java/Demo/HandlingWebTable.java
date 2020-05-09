package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {
	public static void main(String[] args)
	{
		 String url="https://www.isibang.ac.in/~adean/infsys/cal/time.html";
		 System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		 WebDriver driver;
		 driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.get(url);
	     String x="//b[contains(text(), 'B.Math (Hons.) I,  Semester I')]/ancestor::tr/following-sibling::tr[1]//table//tr["+row+"]/td["+col+"]";

    }
	
}	


