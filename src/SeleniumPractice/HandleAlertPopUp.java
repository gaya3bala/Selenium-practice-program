package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		//Launchchrome 
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		//Launch URL
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		/*check for incorrect usernME PASSWORD
		driver.findElement(By.id("login1")).sendKeys("gayathri.srs");
		driver.findElement(By.id("password")).sendKeys("love1234");
		driver.findElement(By.name("proceed")).click();
		*/
		
		//check for the error message
		driver.findElement(By.id("div_login_error"));
		
		//Check for username popup
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
	    Thread.sleep(4000);
		String text = alert.getText();
		System.out.println(text);
		
		//check for the correct alert msg
		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct alert msg");
		}
		else {
			System.out.println("incoorect message");
		}
		
		alert.accept();
		
		//check for password popup
		driver.findElement(By.id("login1")).sendKeys("gayathri.srs");
		driver.findElement(By.name("proceed")).click();		
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(4000);
		String text1 = alert1.getText();
        System.out.println(text1);
		
		//check for the correct alert msg
		if (text1.equals("Please enter your passwor")) {
			System.out.println("correct alert msg");
		}
		else {
			System.out.println("incoorect message");
		}
		
		
		alert1.accept();
		
	}

}
