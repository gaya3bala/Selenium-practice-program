package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlert {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
			           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
			WebDriver driver =  new ChromeDriver();
			driver.manage().window().maximize();
			
			// alert msg handler
			driver.get("http://demo.guru99.com/test/delete_customer.php ");
			driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("34234");
			driver.findElement(By.xpath("//input[@name='submit']")).submit();
		
			Alert alert = driver.switchTo().alert();
			String alertmsg = alert.getText();
			
			System.out.println(alertmsg);
			
			alert.accept();
			
			
			//browser POPUP handler
			
		//	driver.navigate("http://demo.guru99.com/popup.php");
			driver.navigate().to("http://demo.guru99.com/popup.php");
			
			driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
			
			Set<String> s1 = driver.getWindowHandles();
			Iterator<String> i1 = s1.iterator();
			
			String Parenwindowid = i1.next();
			System.out.println("parent window id is:" +Parenwindowid);
			
			String Childwindowid = i1.next();
			System.out.println("child window id is:"+Childwindowid);
			
			driver.switchTo().window(Childwindowid);
			driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("john23@gmail.com");
		    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		    
		   System.out.println("childwindow title" +driver.getTitle());
		   
		   driver.close();
		   
		   driver.switchTo().window(Parenwindowid);
		   System.out.println("Parentwindow title" +driver.getTitle());
		   
		   driver.quit();
		   
		    
			
			
			

	}

}
