package practice;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleVtiger {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();	
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		//Random class to avoid duplicates or already exists alert
		Random ran = new Random();
		int r= ran.nextInt(100); 
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Capgemini"+r);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='crmbutton small save'])[1]")).click();
		Thread.sleep(3000);
		String orgHeader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(orgHeader.contains("Capgemini")) {
			System.out.println("Organiztion is created, TC is pass");
		}
		else
			System.out.println("Oraganization is not created, TC is fail");
		Thread.sleep(5000);
		WebElement admImg =driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions a = new Actions(driver);
		a.moveToElement(admImg).perform();
		driver.findElement(By.xpath("(//a[@class='drop_down_usersettings'])[2]")).click();
		}
}
	
	

//}
