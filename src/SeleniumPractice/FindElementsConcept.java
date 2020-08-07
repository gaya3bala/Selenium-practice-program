package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("chia seeds");
		driver.findElement(By.xpath("//input[@class='nav-input']")).click();
		
		//1. print the no of links present
		//2. print the text of all the links present 
		
		//to find the number of links
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		
		//print the no of links
		System.out.println("no of links"+linklist.size());
		
		//to find the no of buttons
		List <WebElement> chkboxlist = driver.findElements(By.tagName("checkbox"));
		
		System.out.println("no of checkbox"+chkboxlist.size());
		
		//print all the text
		
		for(int i=0;i<linklist.size();i++)
		{
			String linkText = linklist.get(i).getText();
			System.out.println(linkText);
		}
		

	}

}
