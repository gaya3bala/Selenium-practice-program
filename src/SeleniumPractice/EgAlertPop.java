package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EgAlertPop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.get(" http://jsbin.com/usidix/1");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//html//body//input")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		String acttext = alert.getText();
		String exptext = "This is an alert box.";
		System.out.println(acttext);
		
		
		if(exptext.contentEquals(acttext)) {
			System.out.println("coreectmsg");
			
		}
		else {
			System.out.println("incorrect msg");
		}
		
		alert.accept();
		driver.close();
	}
}