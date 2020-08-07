package SeleniumPractice;

import org.openqa.selenium.By;
public class HTML {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
	           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
	
	
	//WebDriver driver =  new ChromeDriver();
	WebDriver driver = new HtmlUnitDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.com/");
	
	
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("weighing scale");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	System.out.println("title of the page:"+driver.getTitle());
	
    driver.quit();
}
}
