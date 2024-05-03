package com.vtiger.genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.objectRepositories.HomePage;
import com.vtiger.objectRepositories.LoginPage;

import genericUtilities.webDriverUtility;

public class Baseclass {
	public PropertyFileUtility pu = new PropertyFileUtility();
	public ExcelFileUtility eu = new ExcelFileUtility();
	public webDriverUtility wu=new webDriverUtility();
	public JavaUtility ju = new JavaUtility();
		public WebDriver driver = null;
		
		@BeforeSuite
		public void bsconfig() {
			System.out.println("-----DB Connection-----");
			
		}
		@AfterSuite
		public void asconfig() {
			System.out.println("------DB Disconnection-----");
		}
		@BeforeClass
		public void bcconfig() throws Throwable {
			String browser = pu.readDataFromPropertyFIle("BROWSER");
			String url = pu.readDataFromPropertyFIle("URL");
			if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			System.out.println("-------EdgeDriver is launched");
			}
			else if(browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				System.out.println("-------ChromeDriver is launched");
			}
			else {
				System.out.println("Invalid Browser name");
			}
			wu.maximizeWindow(driver);
			wu.waitForPageLoad(driver);
			driver.get(url);
			System.out.println("-----Browser is opened------");
			
		}

@AfterClass
public void acconfig() {
	driver.quit();
	System.out.println("------Browser is closed------");
}
@BeforeMethod
public void bmconfig() throws Throwable {
	String un = pu.readDataFromPropertyFIle("UN");
	String pwd = pu.readDataFromPropertyFIle("PWD");
	LoginPage lp = new LoginPage(driver);
	lp.loginToApp(un, pwd);
	System.out.println("--------Login done Successfully----------");
	System.out.println("code change is done to check pull from Github");
}
@AfterMethod
public void amconfig() {
	HomePage hp = new HomePage(driver);
	hp.logoutfromApp();
	System.out.println("----Logout is done successfully");
}

}

