package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUP {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Dhrithi\\Desktop\\Rebates\\Rihanna Ame\receipt.pdf");
		

	}

}
