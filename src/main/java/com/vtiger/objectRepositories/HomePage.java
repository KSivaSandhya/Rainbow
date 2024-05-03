package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Declaration
	@FindBy(linkText = "Organizations") private WebElement OrganiationsLnk;
	@FindBy(linkText =  "Contacts") private WebElement ContactsLnk;
	@FindBy(linkText = "Opportunites") private WebElement OpportunitesLnk;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']") private WebElement AdministratorImg;
	@FindBy(linkText = "Sign Out") private WebElement SignOutLnk;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//Getters
	public WebElement getOrganiationsLnk() {
		return OrganiationsLnk;
	}

	public WebElement getContactsLnk() {
		return ContactsLnk;
	}

	public WebElement getOpportunitesLnk() {
		return OpportunitesLnk;
	}

	public WebElement getAdministratorImg() {
		return AdministratorImg;
	}

	public WebElement getSignOutLnk() {
		return SignOutLnk;
	}

	//Business Library
	public void clickOnOrgLink() {
		OrganiationsLnk.click();
	}
	public void clickonContactsLink() {
		ContactsLnk.click();
	}
	/*public void logoutfromApp(WebDriver driver) {
		// TODO Auto-generated method stub
		mouseOverAction(driver, administratorImg);
		SignOutLnk.click();
	}*/
	public void logoutfromApp()
	{
		AdministratorImg.click();
		SignOutLnk.click();
	}

		
}
