package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//switch to iframe
		driver.switchTo().frame("a077aa5e");
		
		//click the frame using xpath
		driver.findElement(By.xpath("//html//body//a//img")).click();
		//driver.close();
		
		driver.switchTo().parentFrame();
		
		System.out.println("***********we are dome************");
		
		
		
		
		
	}

}
