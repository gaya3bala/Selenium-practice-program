package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngbasics {
	
	//pre condition annotations - starting with before
	@BeforeSuite
	public void setUp() {
		System.out.println("setup system property for chrome");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch chrome browser");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("login to app");
	}

	@BeforeMethod
	public void enterURL() {
		System.out.println("enter the url");
	}
	
	
	//Test cases
	@Test
	public void testcase1(){
		System.out.println("test case 1 is executed");
	}
	
	@Test
	public void testcase2(){
		System.out.println("test case 2 is executed");
	}
	
	@Test
	public void testcase3(){
		System.out.println("test case 3 is executed");
	}
	
	//post condition annotations- starting with after
	@AfterMethod
	public void logout() {
		System.out.println("logout from app");

	}
	
	@AfterTest
	public void deletecookies() {
		System.out.println("delete all cookies");
	}
	
	@AfterClass
	public void closebrowser() {
		System.out.println("close the browser");
	}
	
	@AfterSuite
	public void testreport() {
		System.out.println("generate test report");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
