package org.stepdefinition;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public ExcelReader() throws IOException {

		FileInputStream d = new FileInputStream(".//data//Testcase.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(d);
		XSSFSheet sh = wb.getSheetAt(0);
		int lastRowNum = sh.getLastRowNum();
		int lastCellNum = sh.getRow(0).getLastCellNum();

		for(int i=1;i<=lastRowNum;i++)
		{
			XSSFRow row = sh.getRow(i);
			for(int j=0;j<lastCellNum;j++)
			{
				XSSFCell cell = row.getCell(j);
				String cellvalue = cell.getStringCellValue();
				if(cellvalue.contains("999"))
				{
					System.out.println(cellvalue);
				}
			}
		}

	}
	
	public static void main(String[] args) throws IOException {
		ExcelReader o = new ExcelReader();
	}

}
