package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//back and forward concepts
		
		driver.get("http://www.google.com");
		
		driver.navigate().to("http://www.amazon.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		
		
		
		
		
	}

}
