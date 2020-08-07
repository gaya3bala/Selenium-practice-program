package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.util.jar.pack.Package.File;

public class ScreenShotConcept {

	//private static final String OutputType = null;
	//private static final String FILE = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		//to take screenshot
		File src =((TakesScreenshot) driver).getScreenshotAs(OutputType,FILE);
		//now copy the screenshot to desired location
		FileUtils.copyfile(src,new File("G:\\java programs\\Selenium\\src\\SeleniumPractice/google.png"));
		


		
	}

}
