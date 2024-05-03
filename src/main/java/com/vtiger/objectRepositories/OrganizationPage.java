package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	//Declaration
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']") private WebElement OrgLookUpImg;
	
	//Initialization
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
    //getters
	public WebElement getOrgLookUpImg() {
		return OrgLookUpImg;
	}
	
	//Business Library
	public void clickOrgLookUpImg() {
		OrgLookUpImg.click();
	}
}
