package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdownScenario {
	public static void main(String[] args) throws InterruptedException{
		 String url="https://www.spicejet.com/";
		 System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		 WebDriver driver;
		 driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     driver.get(url);
	     Thread.sleep(1000);
         WebElement passenger=driver.findElement(By.cssSelector("#divpaxinfo"));
         passenger.click();
         String xpath=Passenger("Adult");
         Select adult=new Select(driver.findElement(By.xpath(xpath)));
         adult.selectByIndex(5);
         xpath=Passenger("Child");
         Select child=new Select(driver.findElement(By.xpath(xpath)));
         child.selectByIndex(1);
         xpath=Passenger("Infant");
         Select infant=new Select(driver.findElement(By.xpath(xpath)));
         infant.selectByIndex(2);

	}
	
	private static String Passenger(String string) {
		String xpath="//select[contains(@name, '"+string+"')]";
		return xpath;
		
	}
	

}
