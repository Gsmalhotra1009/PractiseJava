package com.javapractise;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Javafilehandling {
	
	 
		public static void main(String[] args) 
		    { 
			File file=new File("D:\\Book1.xlsx");
		        try { 
		        	
		            FileInputStream fis = new FileInputStream(file); 
		            Desktop.getDesktop().open(file);
		            
		            // Create Workbook instance holding reference to .xlsx file 
		            XSSFWorkbook workbook = new XSSFWorkbook(fis); 
		  
		            // Get first/desired sheet from the workbook 
		            XSSFSheet sheet = workbook.getSheetAt(0); 
		  
		            // Iterate through each rows one by one 
		            Iterator<Row> rowIterator = sheet.iterator(); 
		            while (rowIterator.hasNext()) { 
		                Row row = rowIterator.next(); 
		                // For each row, iterate through all the columns 
		                Iterator<Cell> cellIterator = row.cellIterator(); 
		  
		                while (cellIterator.hasNext()) { 
		                    Cell cell = cellIterator.next(); 
		                    // Check the cell type and format accordingly 
		                    switch (cell.getCellType()) { 
		                    case Cell.CELL_TYPE_NUMERIC: 
		                        System.out.print(cell.getNumericCellValue() + "t"); 
		                        break; 
		                    case Cell.CELL_TYPE_STRING: 
		                        System.out.print(cell.getStringCellValue() + "t"); 
		                        break; 
		                    } 
		                } 
		                System.out.println(""); 
		            } 
		            fis.close(); 
		        } 
		        catch (Exception e) { 
		            e.printStackTrace(); 
		        } 
		    } 
		} 