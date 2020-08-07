package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleFBid {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String tagname = driver.findElement(By.id("email")).getTagName();
		
		System.out.println(tagname);
		driver.close();
		System.exit(0);
		
		

	}

}
