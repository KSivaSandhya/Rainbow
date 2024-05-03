package practice;

import com.vtiger.genericUtilities.ExcelFileUtility;

public class ExcelData {
	public static void main(String[] args) throws Throwable {
		ExcelFileUtility efu = new ExcelFileUtility();
	System.out.println(efu.readDataFromExcel("Sheet1", 0, 0));	
	}

}
