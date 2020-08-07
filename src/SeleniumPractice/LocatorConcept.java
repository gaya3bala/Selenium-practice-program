package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();//launch chrome
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("This is a link")).click();
		driver.findElement(By.id("fname")).sendKeys("Gayathri");
		driver.findElement(By.id("idOfButton")).click();
		driver.findElement(By.id("female")).click();
		driver.findElement(By.xpath("//input[@class='Automation']")).click();
		
		//choosing from dropdown
		Select select = new Select(driver.findElement(By.id("testingDropdown")));
		select.selectByVisibleText("Performance Testing");
		
		//pop up
		//double click in selenium using Action class
		Actions actions = new Actions(driver);
		WebElement link =driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
		actions.doubleClick(link).perform();
		
		//switch to alert box and click ok
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(alert.getText());
	    alert.accept();
	    
	    WebElement link1 = driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]"));
	    actions.click(link1).perform();
	    
	    //switch to 2nd alert box
	    Alert alert1 = driver.switchTo().alert();
	    Thread.sleep(4000);
	    System.out.println(alert1.getText());
	    alert1.accept();
	    
	    WebElement link2 = driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]"));
	    actions.click(link2).perform();
	    
	    //switch to 3rd alert box
	    Alert alert2 = driver.switchTo().alert();
	    Thread.sleep(4000);
	    System.out.println(alert2.getText());
	    alert2.accept();
		
	
		
		
		
		
		
	}

}
