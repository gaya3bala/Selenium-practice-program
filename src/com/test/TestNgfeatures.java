package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNgfeatures {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
	}
	
	@Test(priority =1)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath(" //span[contains(text(),'Log In')]")).click();
		driver.findElement(By.name("email")).sendKeys("g3bala13@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
	}
	@Test(priority=2,dependsOnMethods="login")
	public void Contacts() {
		driver.findElement(By.linkText("Contacts")).click();
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
		
	@Test(priority=3)
	public void Header() {
		boolean t = driver.findElement(By.xpath("//div[@class='header item']")).isDisplayed();
		System.out.println(t);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
		
	}
	
	

