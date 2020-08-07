package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		           "C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
		
		//IsDisplayes method------check if save button is displayed
		
		boolean SavebuttonDis = driver.findElement(By.id("demo")).isDisplayed();
		
		if(SavebuttonDis == true) {
			System.out.println("save button is displayed");
		}
		else
			{
				System.out.println("save button is not displayed");
			}
		//IsSelected method-----check if chek boxes are selected
		
		WebElement Selchk = driver.findElement(By.id("seleniumbox"));
		WebElement Restapichk = driver.findElement(By.id("restapibox"));
		
		boolean SelChkbox = Selchk.isSelected();
		
		boolean RestApichkbox = Restapichk.isSelected();
		
		if(SelChkbox == false) {
			Selchk.click();
			System.out.println("selenium check box is selected now");
		}
		else {
			
			System.out.println("selenium is selected by default");
		}
		
		if(RestApichkbox == false) {
			Restapichk.click();
			System.out.println("rest api is selected");
			
		}
		else {
			System.out.println("rest api is selected as default");
		}
		//IsEnabled ---- check if save is enabled
		
		boolean saveenable = driver.findElement(By.id("demo")).isEnabled();
		
		if(saveenable == false) {
		System.out.println("save is not enalbled");
			
		}
		
		//click on radiobutton to enable save button
		WebElement javradbut = driver.findElement(By.id("java1"));
		WebElement  phpradbut= driver.findElement(By.id("php1"));
		 
		
		
		javradbut.click();
		
		boolean savebutenabled = driver.findElement(By.id("demo")).isEnabled();
		if(savebutenabled == true) {
			System.out.println("save button is enabled");	
		}
		else {
			System.out.println("save button is not working");
		}
			
		driver.close();

	}

}
