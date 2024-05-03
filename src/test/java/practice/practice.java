package practice;

import java.io.FileInputStream;

import com.vtiger.genericUtilities.IconstantUtility;
import com.vtiger.genericUtilities.PropertyFileUtility;

public class practice {
public static void main(String[] args) throws Throwable {
	
	PropertyFileUtility pfu = new PropertyFileUtility();
	
	//FileInputStream fisp = new FileInputStream(IconstantUtility.propertyfilepath);
	//String un = pfu.readDataFromPropertyFIle("UN");
	System.out.println(pfu.readDataFromPropertyFIle("UN"));
}
}
