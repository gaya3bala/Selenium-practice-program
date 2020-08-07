package com.DataDriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MercurytoursTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php"); //enter URL
		
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();  //goto Registration page
		
	}
	
	@DataProvider(name = "Searchprovider")
	public Object[][] getdatafromdataprovider(){
		return new Object[][] {
			{"gaya","bala","1234567890","chennai","PA","12345","gb1","1234567","1234567"},
			{"dhruv","bala","1234567890","chennai","PA","12345","gb2","1234567","1234567"},
			{"mary","kom","1234567890","chennai","PA","12345","gb3","1234567","1234567"},
			{"mya","yash","1234567890","chennai","PA","12345","gb4","1234567","1234567"}
			
	};
	}
	
	
	
	@Test(dataProvider ="Searchprovider")
	public void MerToursRegdata(String firstname,String lastname,String Phonenumber, String city,
		                           String state,String postcode, String username,String password,String confirmpassword)
	
	{
		
		//enterdata
		//firstname"
		driver.findElement(By.xpath("//input[@name='firstName']")).clear();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
		
		//lastname
		driver.findElement(By.xpath("//input[@name='lastName']")).clear();
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);
		
		//Phonenumber
		driver.findElement(By.xpath("//input[@name='phone']")).clear();
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(Phonenumber);
		
		//city
		driver.findElement(By.xpath("//input[@name='city']")).clear();
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		
		//state
		driver.findElement(By.xpath("//input[@name='state']")).clear();
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
		
		//postcode
		driver.findElement(By.xpath("//input[@name='postalCode']")).clear();
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postcode);
		
		//username
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		
		//pwd
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		//comfirm pwd
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).clear();
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmpassword);
		
		//click submit
		driver.findElement(By.xpath("//input[@name='register']")).click();
		
	}	
		
	

	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
