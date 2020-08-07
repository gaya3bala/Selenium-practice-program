package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlerConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.naukri.com/");
		
		String Parentwindow = driver.getWindowHandle();
		System.out.println(Parentwindow);
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String> I1 = s.iterator();
		
		while(I1.hasNext())
		{
			String childwindow = I1.next();
			
			if(!Parentwindow.equals(childwindow))
			{
			    driver.switchTo().window(childwindow);
				System.out.println( driver.switchTo().window(childwindow).getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(Parentwindow);
		
		

	}

}
