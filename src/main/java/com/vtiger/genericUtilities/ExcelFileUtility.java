package com.vtiger.genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public double readDataFromExcel(String SheetName, int rowNum, int cellNum) throws Throwable {
		FileInputStream fise = new FileInputStream(IconstantUtility.excelfilepath);
		Workbook wb = WorkbookFactory.create(fise);
		return wb.getSheet(SheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
		
	}

}
