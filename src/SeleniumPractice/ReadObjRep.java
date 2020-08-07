package SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadObjRep {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        FileInputStream fp = new FileInputStream("G:\\java programs\\Selenium\\src\\SeleniumPractice\\config.properties");
        
        prop.load(fp);
        
        
        System.out.println(prop.getProperty("name"));
        System.out.println(prop.getProperty("age"));
        
        String url = prop.getProperty("URL");
        System.out.println(url);
        
        String Browsername = prop.getProperty("Browse");
        System.out.println(Browsername);
        
        if(Browsername.equals("chrome")) {
        	System.setProperty("webdriver.chrome.driver",
 		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
 		     driver =  new ChromeDriver();
        }else if(Browsername.equals("firefox")) {
        	System.setProperty("webdriver.chrome.driver",
  		           "C:/Users/Dhrithi/Downloads/chromedriver/geckodriver.exe");
  		    driver =  new FirefoxDriver();
        }else if(Browsername.equals("IE")) {
        	System.setProperty("webdriver.chrome.driver",
  		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
  		    driver =  new InternetExplorerDriver();
  		   
  		    
        }
    
        driver.get(url);
        driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).
                           sendKeys(prop.getProperty("firstname"));
        
        driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
        
        driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
        
        driver.findElement(By.xpath(prop.getProperty("pwd_xpath"))).sendKeys(prop.getProperty("pwd"));
        
        driver.findElement(By.xpath(prop.getProperty("signin_xpath"))).click();
        
        
	}
	

}
