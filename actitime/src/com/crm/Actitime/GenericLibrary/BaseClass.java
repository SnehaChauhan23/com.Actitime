package com.crm.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.crm.Actitime.objectRepository.LoginPage;

public class BaseClass {
	
		public static WebDriver driver;	// in order to get access in every annotation
		ReadDataFromProperty r = new ReadDataFromProperty(); //Property file object
		
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		
	//==========================================================

		@BeforeSuite
		public void dataBaseConnection() {
			Reporter.log("DataBase Connected",true);
		}
		@AfterSuite
		public void dataBaseDisconnection() {
			Reporter.log("DataBase Dis-connected",true);
		}
		
	//==========================================================

		@BeforeTest
		public void launchBrowser() throws IOException {
			Reporter.log("Browser Launched Succesfully",true);
			
			WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			 String URL = r.readdatafromproperty("url");
			 driver.get(URL);
			
		}
		@AfterTest
		public void closeBrowser() {
			Reporter.log("Browser Closed Succesfully",true);
			driver.close();
		}
		
	//==========================================================
		
		@BeforeMethod
		public void loginToActiTime() throws IOException {
			
			String UN = r.readdatafromproperty("username");		
			String PW = r.readdatafromproperty("password");
					
				//OBJECT OF POM CLASS
			LoginPage lp = new LoginPage(driver);
			lp.logintoActitime(UN, PW);
			
			
		}
		@AfterMethod
		public void logoutToActiTime() throws InterruptedException {
			
			driver.findElement(By.id("logoutLink")).click();
		}
	}



