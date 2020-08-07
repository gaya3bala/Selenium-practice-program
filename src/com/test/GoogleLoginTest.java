package com.test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleLoginTest {

	
	public static WebDriver driver;
	
	
	
	@BeforeClass
		public void setUp() {
			
			System.setProperty("webdriver.chrome.driver",
			           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
			driver =  new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.get("https://www.gmail.com");
	}
	
	@BeforeMethod
	public void enterurl() {
		driver.get("https://www.gmail.com");
	}
	
	@Test(priority = 1,groups ="page check")
	public void Titletest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "title does not mathcb");
	}
	
	@Test(groups= "Test")
    public void test2() {
		System.out.println("test2");
	}
	
	 @Test(priority = 2,groups ="pagecheck")
	public void imagecheck() {
		boolean t = driver.findElement(By.xpath("//div[@class='rr0DNb']//*[local-name()='svg']")).isDisplayed();
	    System.out.println(t);
	    Assert.assertEquals(t, true);
	 }
	 
	
	@Test(priority = 3,groups = "login") 
	public void logincheck(){
		boolean t = driver.findElement(By.xpath("//input[@id='identifierId']")).isDisplayed();
		System.out.println(t);
	}
	
	
	@Test(priority = 4,groups= "login")
	public void login() {
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("gayathri.srs");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("r1a2g3h4a5v6");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		boolean t = driver.findElement(By.xpath("//img[@class='gb_ua']")).isDisplayed();
		System.out.println(t);
		
	}
	
//	/*@Test(priority = 5)
//	public void imagechk() {
//		
//		boolean t = driver.findElement(By.xpath("//img[@class='gb_ua']")).isDisplayed();
//		driver.findElement(By.xpath("//span[@class='gb_Ia gbii']")).click();
//		driver.findElement(By.linkText("Sign out")).click();
//	
//	}*/
		
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//span[@class='gb_Ia gbii']")).click();
		driver.findElement(By.linkText("Sign out")).click();
	}
		
	@AfterClass
		public void closebroswer() {
		driver.close();
	}
		
		
		
	}
	
	

