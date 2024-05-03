package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {
//Declaration
	@FindBy(xpath ="//input[@name='accountname']") private WebElement orgNameedt;
	@FindBy(xpath ="(//input[@class='crmbutton small save'])[1]" ) private WebElement saveBtn;
	
	//initialization
	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
    //getters
	public WebElement getOrgNameedt() {
		return orgNameedt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	//Business Library
	public void createNewOrganization(String ORGNAME)
	{
		orgNameedt.sendKeys(ORGNAME);
		saveBtn.click();
	}
	
}
