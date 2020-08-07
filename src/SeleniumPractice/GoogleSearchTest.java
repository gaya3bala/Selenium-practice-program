package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.List;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("disney games");
		//
		Thread.sleep(9000);
		//List <WebElement> list = driver.findElements(By.xpath("//ul[@role ='listbox']//li/descendent::div[@class='sbl1']"));
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		//get the length of list
		System.out.println("no of list availble " +list.size());
		
        for(int i=0;i<list.size();i++)
        {
        	String exacttext = list.get(i).getText();
        	 if(exacttext.equals("disney games lol"))
        	 {
        		 list.get(i).click();
        		 System.out.println("selected link text: " +exacttext);
        		 break;
        	 }
  
        }
        driver.findElement(By.xpath("//h3[contains(text(),'Disney LOL - Fun, Videos and more!')]")).click();
	//driver.navigate().to("https://lol.disney.com/");
	}
	

}
