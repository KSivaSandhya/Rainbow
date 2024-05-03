package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import com.google.common.io.Files;

public class webDriverUtility {
	WebDriver driver = null;
	/**
	 * This method will maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * This method will minimize the window
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
	/**
	 * This method will wait for page to load for 20 seconds
	 * @param driver
	 */
	@SuppressWarnings("deprecation")
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/**
	 * 	This method will wait for 20 seconds for a element to be visible
	 * @param driver
	 * @param element
	 */
	//public void waitForElementToBeVisisble(WebDriver driver, WebElement element)
	//{
		//WebDriverWait wait = new WebDriverWait(driver,20,TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.visibilityOf(element));
// 		}
	
	public void handleDropDown(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void handleDropDown(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void handleDropDown(String visibleText,WebElement element) {
		Select s=new Select(element);
		s.selectByVisibleText(visibleText);
	}
	public void mouseOverAction(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void rightClick(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();	
	}
	public void doubleClick(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	public void dragAndDrop(WebDriver driver,WebElement srcele,WebElement destele) {
		Actions a=new Actions(driver);
		a.dragAndDrop(srcele,destele).perform();
	}
	/*public void getScreenshot(WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./"+"\\Screenshots\\ProjectName"+System.currentTimeMillis()+".png");
	*/
	}
