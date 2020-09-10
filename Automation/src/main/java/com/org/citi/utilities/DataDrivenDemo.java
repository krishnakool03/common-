package com.org.citi.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataDrivenDemo {

	public static List<LinkedHashMap<String,String>> readValueFromExcel() throws IOException {
		List<LinkedHashMap<String,String>> mapList = new ArrayList<LinkedHashMap<String,String>>();
		File excelLocation = new File("C:\\Users\\selva\\git\\Cucumber-TestNG\\TestDataExcel\\testData.xlsx");
		FileInputStream f = new FileInputStream(excelLocation);
		Workbook wb = new XSSFWorkbook(f); 
		Sheet sh = wb.getSheet("selva");
		Row headerRow = sh.getRow(0);
		for(int i=1; i<sh.getPhysicalNumberOfRows(); i++){
			Row eachrow = sh.getRow(i);
			LinkedHashMap<String,String> mapdata = new LinkedHashMap<String,String>();
			for(int j=0;j<headerRow.getPhysicalNumberOfCells();j++) {
				Cell eachCell = eachrow.getCell(j);
				if(eachCell.getCellType()==CellType.NUMERIC) {
					Double number = eachCell.getNumericCellValue();
					long longnumber = new Double(number).longValue();
				String name=	String.valueOf(longnumber);
				mapdata.put(headerRow.getCell(j).getStringCellValue(), name);
				}
				
				if(eachCell.getCellType()==CellType.STRING) {
					mapdata.put(headerRow.getCell(j).getStringCellValue(), eachCell.getStringCellValue());
				}
				mapList.add(mapdata);
			}
		}
		return mapList;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		
		
		System.out.println(readValueFromExcel().get(1).get("username"));
	}
	
}
