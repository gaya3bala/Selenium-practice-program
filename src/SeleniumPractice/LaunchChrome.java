package SeleniumPractice;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		
		// Launch Firefox
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\Dhrithi\\Downloads\\geckodriver\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    //gecko.get("")
		driver.get("https://www.google.com");
		/*
		//Luanch Chrome browser
		
		System.setProperty("webdriver.chrome.driver",
				           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();//launch chrome
		driver.get("http://www.google.com");  //launch URL
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google"))
			{System.out.println("correct title");
			}
		else
			{System.out.println("incorrect title");
			}
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		*/
		}
	
	

		}
		
		
    
	


