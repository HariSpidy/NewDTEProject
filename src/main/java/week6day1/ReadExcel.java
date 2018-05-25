package week6day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import week2day2.ProjectMethods;

public class ReadExcel{
	
	public Object[][] excel(String filename) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook(filename);
		//XSSFSheet sheet = workbook.getSheet("logintest");
		//to get or fetch all the excel sheet in a excel file
		XSSFSheet sheet = workbook.getSheetAt(0);
		int totalrows = sheet.getLastRowNum();
		System.out.println("total no of rows in sheet :" +totalrows);
		int totalcolunm = sheet.getRow(0).getLastCellNum();
		System.out.println("total no of columns in sheet :" +totalcolunm);
		Object[][] data =new Object[totalrows][totalcolunm];
		for(int i=1;i<=totalrows;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<totalcolunm;j++) {
				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
			}
			
		}
		workbook.close();
		return data;
		
		
	}
	
}
