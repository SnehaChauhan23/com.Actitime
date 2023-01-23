package com.crm.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
public String readdataexcel(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream ("./TestData/Testdata.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheetname).getRow( row).getCell(cell).getStringCellValue();
	return data;
}
}
