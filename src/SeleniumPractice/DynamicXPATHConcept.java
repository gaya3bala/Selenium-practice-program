package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPATHConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
	//driver.get("https://www.emirates.com/us/english/");
		
		driver.get("http://demo.guru99.com/v1/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	    //driver.findElement(By.xpath("//input[@name='Departure Airport']")).sendKeys("chennai");
	    
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("gayathri");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("love1234");
		driver.findElement(By.xpath("//input[contains(@name,'btnlogin')]")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
