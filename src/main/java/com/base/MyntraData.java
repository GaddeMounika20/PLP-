package com.base;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MyntraData {

	public String number() {
		long a = System.currentTimeMillis() / 1000;
		String val = String.valueOf(a);
		return val;
	}

// Parameterization using Excel Files
	public String data(int a, int b) throws Exception {

		FileInputStream fis = new FileInputStream("./ExcelSheet//Excel Worksheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		long i = (long) wb.getSheet("Sheet1").getRow(a).getCell(b).getNumericCellValue();
		String val = String.valueOf(i);// Numeric value converting to String
		return val;

	}

	public String data1(int c, int d) throws Exception {
		FileInputStream fis = new FileInputStream("./ExcelSheet//Excel Worksheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String val = wb.getSheet("Sheet1").getRow(c).getCell(d).getStringCellValue();
		return val;
	}

}
