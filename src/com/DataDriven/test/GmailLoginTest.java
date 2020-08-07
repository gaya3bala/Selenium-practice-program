package com.DataDriven.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class GmailLoginTest {
	
	WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;


@BeforeTest
public void initialize() {
	System.setProperty("webdriver.chrome.driver","C:/Users/Dhrithi/Downloads/chromedriver/chromedriver.exe");
		           
	driver = new ChromeDriver();
	
	driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	

	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
}

@Test
public void readcelldata() throws IOException {
	//Import excel file
	File src = new File("G:\\linkedintestdata.xlsx");
	
	//Load the file
	FileInputStream finput = new FileInputStream(src);
	
	//Load the workbook
	workbook = new XSSFWorkbook(finput);
	
	//get the sheet
	sheet = workbook.getSheetAt(0);
	
	//read the data from the sheet
	int rowNum;
	for( rowNum = 1;rowNum<=sheet.getLastRowNum();rowNum++)
	{
		//import username
		
		cell = sheet.getRow(rowNum).getCell(0);
		//cell.setCellType(Cell.CELL_TYPE_STRING);
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(cell.getStringCellValue());
		
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

		//import password
		cell = sheet.getRow(rowNum).getCell(1);
		//cell.setCellType(Cell.CELL_TYPE_STRING);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(cell.getStringCellValue());
		//login to gmail
		driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
		
		String actualURL = "https://www.linkedin.com/feed/?trk=guest_homepage-basic_nav-header-signin";
		String expectedURL = driver.getCurrentUrl();
		System.out.println(expectedURL);
		if(actualURL.equalsIgnoreCase(expectedURL))	
		{
			System.out.println("PASSED");
		} else
		{System.out.println("FAILED");
		
		}
		
	
				
		/*if(rowNum<sheet.getLastRowNum())
		{
		//click on use another account
			driver.navigate().refresh();
			driver.findElement(By.xpath("//div[contains(text(),'Use another account')]")).click();
		
		}*/
		
		//signout
				driver.findElement(By.xpath("//img[@id='ember24']")).click();
				driver.findElement(By.xpath("//a[@id='ember38']")).click();
		
	}
	
	//String message = "Pass";
	
	//sheet.getRow(2).createCell(2).setCellValue("Pass");
	try {
		//  Block of code to try to write to cell 
			sheet.getRow(2).getCell(2).setCellValue("Pass");
	       }
		catch(Exception e) {
			
			//  Block of code to handle errors and crate cell and write to it
			sheet.getRow(2).createCell(2).setCellValue("Pass");
			
		}
	//System.out.println(rowNum);
	finput.close();
		//write data into excel
		FileOutputStream foutput = new FileOutputStream(src);
		
		//message to be written in cell
		//String message = "Pass";
		
		
		//sheet.getRow(rowNum).getCell(2).setCellValue(message);
		
	
		
		workbook.write(foutput);
		foutput.close();
}
		
		
		
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

