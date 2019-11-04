package com.edgenetworks.excelvalues;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ColumnCalMethods 
{

	//Read excel sheet value and dividing two column values and finding aggregate of whole column
	public static double readdatafromExcelAggregateColumn(String filePath,String ColumnName,String ColumnName1,String sheetValue) throws Exception 
	{
		String SheetName = sheetValue;//"M1";
		double sum=0;
		double aggregate = 0;
		File file = new File(filePath);
		FileInputStream fi = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sheet = wb.getSheet(SheetName);
		// it will take value from first row
		Row row = sheet.getRow(0);
		int row1 = sheet.getLastRowNum();
		//System.out.println(row1);
		// it will give you count of row which is used or filled
		short lastcolumnused = row.getLastCellNum();

		int colnum = 0;
		for (int i = 0; i < lastcolumnused; i++) 
		{
			if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(ColumnName)) 
			{
				colnum = i;
				break;
			}
		}

		int colnum1=0;
		for (int i = 0; i < lastcolumnused; i++) 
		{
			if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(ColumnName1)) 
			{
				colnum1 = i;
				break;
			}
		}

		double[] array = new double[row1];
		for (int i=1;i<array.length-1;i++)
		{
			row = sheet.getRow(i);
			Cell column = row.getCell(colnum);
			Cell column1 = row.getCell(colnum1);

			double col = column.getNumericCellValue();
			double col1=column1.getNumericCellValue();
			array[i]= col/col1;
			sum = sum+array[i];

		}

		aggregate= sum/(row1-2);
		return aggregate;
	}


	//Read excel sheet value and dividing two column values plus 1 and finding aggregate of whole column
	public static double readdatafromExcelAggregateColumnValue(String filePath,String ColumnName,String ColumnName1,String sheetValue) throws Exception 
	{
		String SheetName = sheetValue;//"M1";
		double sum=0;
		double aggregate = 0;
		File file = new File(filePath);
		FileInputStream fi = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sheet = wb.getSheet(SheetName);
		// it will take value from first row
		Row row = sheet.getRow(0);
		int row1 = sheet.getLastRowNum();
		// it will give you count of row which is used or filled
		short lastcolumnused = row.getLastCellNum();

		int colnum = 0;
		for (int i = 0; i < lastcolumnused; i++) 
		{
			if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(ColumnName)) 
			{
				colnum = i;
				break;
			}
		}

		int colnum1=0;
		for (int i = 0; i < lastcolumnused; i++) 
		{
			if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(ColumnName1)) 
			{
				colnum1 = i;
				break;
			}
		}

		double[] array = new double[row1];
		for (int i=1;i<array.length-1;i++)
		{
			row = sheet.getRow(i);
			Cell column = row.getCell(colnum);
			Cell column1 = row.getCell(colnum1);

			double col = column.getNumericCellValue();
			double col1=column1.getNumericCellValue();
			array[i]= (col/col1)+1;
			sum = sum+array[i];

		}

		aggregate= sum/(row1-2);
		return aggregate;
	}

	//Read excel sheet value and dividing two column values plus 1 and finding aggregate of whole column
		public static double readdatafromExcelAggregateSOInternal(String filePath,String ColumnName,String ColumnName1,String sheetValue) throws Exception 
		{
			String SheetName = sheetValue;//"M1";
			double sum=0;
			double aggregate = 0;
			File file = new File(filePath);
			FileInputStream fi = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(fi);
			Sheet sheet = wb.getSheet(SheetName);
			// it will take value from first row
			Row row = sheet.getRow(0);
			int row1 = sheet.getLastRowNum();
			// it will give you count of row which is used or filled
			short lastcolumnused = row.getLastCellNum();

			int colnum = 0;
			for (int i = 0; i < lastcolumnused; i++) 
			{
				if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(ColumnName)) 
				{
					colnum = i;
					break;
				}
			}

			int colnum1=0;
			for (int i = 0; i < lastcolumnused; i++) 
			{
				if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(ColumnName1)) 
				{
					colnum1 = i;
					break;
				}
			}

			double[] array = new double[row1];
			for (int i=1;i<array.length-1;i++)
			{
				row = sheet.getRow(i);
				Cell column = row.getCell(colnum);
				Cell column1 = row.getCell(colnum1);

				double col = column.getNumericCellValue();
				double col1=column1.getNumericCellValue();
				array[i]= (col/(col-col1));
				sum = sum+array[i];

			}

			aggregate= sum/(row1-2);
			return aggregate;
		}


}
