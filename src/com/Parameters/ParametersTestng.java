package com.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestng {

	WebDriver driver;
	
	@Test(invocationCount=2)
	@Parameters({"browser","url","emailid","pwd"})
	public void Gmaillogin(String browser,String url,String emailid, String pwd) throws InterruptedException {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
			           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
			           "C:/Users/Dhrithi/Downloads/chromedriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
	
		driver.get(url);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(emailid);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		//use wait until the password element is visible
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[@class='CwaK9']")).click();
		driver.close();
	}
	
}
