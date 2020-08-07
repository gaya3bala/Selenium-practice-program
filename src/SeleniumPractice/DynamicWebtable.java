package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebtable {

	
		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver",
			           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
			WebDriver driver =  new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			
			driver.get("https://ui.cogmento.com");
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("g3bala13@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@123");
			
			//login button
			
			driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	Thread.sleep(6000);		
/*
			 Actions action = new Actions(driver);
			 
			 
			
          //click contacts
			Thread.sleep(3000);
			WebElement contactsmenu = driver.findElement(By.xpath("//span[contains(text(),'Companies']"));
			Thread.sleep(4000);
			
			action.moveToElement(contactsmenu).click();
			//driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
			System.out.println("contacts menu clicked");
			*/
	
	        // select contacts
	        driver.findElement(By.linkText("Contacts")).click();
			//select calendar
			driver.findElement(By.linkText("Calendar")).click();
			
			
			
			

	}

}
