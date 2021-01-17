package com.javapractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelclass {

	public static void main(String str[]) throws IOException
	{
		File file=new File("D:\\Book1.xlsx");
		
		/*FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext()) {
			Row row =rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				cell.getCellType();
			}
		}*/


	FileInputStream fis=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	 Iterator<Row> rowiterator=sheet.iterator();
	 while(rowiterator.hasNext())
	 {
		 Row row=rowiterator.next();
		 System.out.println(rowiterator.next() + "This is the row");
		 Iterator<Cell> celliterIterator=row.cellIterator();
		 
		 while(celliterIterator.hasNext())
		 {
			 Cell cell=celliterIterator.next();
			 System.out.println(cell + "This is the cell");
			 
			 switch(cell.getCellType())
			 {
			 case Cell.CELL_TYPE_FORMULA:
				 System.out.println(cell.getNumericCellValue());
			 break;
			 }
		 }System.out.println("");
		 
	 }
	fis.close();
	
	FileOutputStream fos=new FileOutputStream(file);
	
	fos.close();
}
}
	