package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> I1 = allwindows.iterator();
		
		while(I1.hasNext())
		{ String child = I1.next();
		
		 System.out.println(child);
		  if(!parent.equals(child))
		  {
			  driver.switchTo().window(child);
			  driver.close();
		  }
		}
		
		driver.switchTo().window(parent);
		driver.quit();

	}

}
