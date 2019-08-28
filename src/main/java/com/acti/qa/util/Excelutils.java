package com.acti.qa.util;


import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public Excelutils(String excelpath)
	{
		try
		{
			File src = new File(excelpath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			
		}
		catch(Exception e)
		{
			System.out.println("file not found:excelsheet not found"+e.getMessage());
		}
	}
	
	public int getrowCount(int sheetnum)
	{
		int count = wb.getSheetAt(sheetnum).getLastRowNum()+1;
		return count;
		
	}
	
	public String getcellData(int sheetnum,int col,int row)
	{
		String data = wb.getSheetAt(sheetnum).getRow(row).getCell(col).getStringCellValue();
		return data;
	}
}
