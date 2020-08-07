package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		/*
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		
		
		//use Actions class for mouse movement
		Actions action = new Actions(driver);
		
		WebElement link = driver.findElement(By.xpath("//span[contains(@class,'g-separator g-menu-item-content')]//span[contains(@class,'g-menu-item-title')][contains(text(),'Testing')]"));
		action.moveToElement(link).build().perform();
		Thread.sleep(3000);
		
		Actions action1 = new Actions(driver);
		
		
		
		WebElement link1 = driver.findElement(By.xpath(" /div[contains(@class,'g-block size-34')]//span[contains(@class,'g-me"));
		action1.moveToElement(link1).click();
		*/
		
		
		driver.get("https://www.toolsqa.com");
		driver.manage().window().maximize();
		
		
		 Actions action = new Actions(driver);
		 
		 //place mouse on tutorial
		 WebElement mainmenu = driver.findElement(By.linkText("TUTORIAL"));
		action.moveToElement(mainmenu).perform();
		System.out.println("executed mainmenu Tutorail");
		
		//place mouse on frond ens testing
		WebElement submenu = driver.findElement(By.xpath("//span[contains(text(),'QA Practices')]"));
		Thread.sleep(3000);
		action.moveToElement(submenu).perform();
		System.out.println("executed submenu QAPractices");
		//selenium in java
		Thread.sleep(3000);
		WebElement selectmenu = driver.findElement(By.xpath("//span[contains(text(),'Software Testing')]"));
		selectmenu.click();
		Thread.sleep(3000);
		System.out.println("executed selectmenu software testing");
		
		
		/*
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		
		
		 Actions action = new Actions(driver);
		
		WebElement mainmenu = driver.findElement(By.xpath("//div[@id='ui-id-9']"));
		action.moveToElement(mainmenu).perform();
		System.out.println("Done Mouse hover on 'Music' from Menu");
		
		WebElement submenu = driver.findElement(By.xpath("//div[@id='ui-id-13']"));
		Thread.sleep(3000);
		action.moveToElement(submenu).perform();
		System.out.println("Done Mouse hover on 'Rock' from Menu");
		
		Thread.sleep(3000);
		//WebElement selectmenu = driver.findElement(By.xpath("//div[@id='ui-id-11']"));
		WebElement selectmenu = driver.findElement(By.xpath("//div[@id='ui-id-14']"));
		selectmenu.click();
		System.out.println("Done Mouse hover on 'Alternative' from Menu");
		*/
		driver.close();
			
		
	

	}

}
