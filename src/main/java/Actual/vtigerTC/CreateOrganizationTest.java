package Actual.vtigerTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericUtilities.Baseclass;
import com.vtiger.genericUtilities.JavaUtility;
import com.vtiger.objectRepositories.CreateNewOrganizationPage;
import com.vtiger.objectRepositories.HomePage;
import com.vtiger.objectRepositories.OrganizationInfoPage;
import com.vtiger.objectRepositories.OrganizationPage;

public class CreateOrganizationTest extends Baseclass {
@Test
public void createorg() {
	//click on org module
	HomePage hp = new HomePage(driver);
	hp.clickOnOrgLink();
	//click on lookup img
	OrganizationPage op= new OrganizationPage(driver);
	op.clickOrgLookUpImg();
	//give org name
	CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
	JavaUtility ju = new JavaUtility();
	cnop.createNewOrganization("Capgemini"+ju.getRandomNum());
	
	//get header and verify
	OrganizationInfoPage oip = new OrganizationInfoPage(driver);
	String header = oip.getHeader();
	//verify
	Assert.assertTrue(header.contains("Capgemini"));
	System.out.println("ORG is created");
	
}
}
