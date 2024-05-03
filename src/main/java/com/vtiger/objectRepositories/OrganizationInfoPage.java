package com.vtiger.objectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	//Declaration
	@FindBy(xpath="//span[@class='dvHeaderText']") private WebElement orgHeaderText;
	
	//Initialization
	public OrganizationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
    //getters
	public WebElement getOrgHeaderText() {
		return orgHeaderText;
	}
	

	//Business Library
	public String getHeader()
	{
		return orgHeaderText.getText();
	}
}
