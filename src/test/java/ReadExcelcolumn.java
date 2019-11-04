import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.edgenetworks.common.GenericMethods;

public class ReadExcelcolumn {
 public static double readdatafromExcelusingcolumnName(String ColumnName,String ColumnName1,String sheetValue) throws Exception 
 {
  String SheetName = sheetValue;//"M1";
  double sum=0;
  double aggregate = 0;
  File file = new File("C:\\Edge_Networks\\EdgeNetworks\\Data\\data_testing_v2.xlsx");
  FileInputStream fi = new FileInputStream(file);
  Workbook wb = WorkbookFactory.create(fi);
  Sheet sheet = wb.getSheet(SheetName);
  // it will take value from first row
  Row row = sheet.getRow(0);
  int row1 = sheet.getLastRowNum();
  System.out.println(row1);
// it will give you count of row which is used or filled
  short lastcolumnused = row.getLastCellNum();

  int colnum = 0;
  for (int i = 0; i < lastcolumnused; i++) 
  {
   if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(ColumnName)) 
   {
    colnum = i;
    System.out.println(colnum);
    break;
   }
  }
 
  int colnum1=0;
  for (int i = 0; i < lastcolumnused; i++) 
  {
   if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(ColumnName1)) 
   {
    colnum1 = i;
    System.out.println("HAI "+colnum1);
    break;
   }
  }
 
  
  
  
  
  double[] array = new double[row1];
  System.out.println(array.length);
  for (int i=1;i<array.length-1;i++)
  {
	row = sheet.getRow(i);
	Cell column = row.getCell(colnum);
	Cell column1 = row.getCell(colnum1);
	
	double col = column.getNumericCellValue();
	double col1=column1.getNumericCellValue();
	array[i]= (col/(col1));
	System.out.println(array[i]);
	sum = sum+array[i];
	
  }
  aggregate= sum/(row1-2);
  return aggregate;
 }
 
 public static double readdatafromExcelusingcolumnName1(String filePath,String ColumnName,String sheetValue) throws Exception 
 {
  String SheetName = sheetValue;//"M1";
  double sum=0;
  int count=0;
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
 
  double[] array = new double[row1];
  for (int i=1;i<array.length-1;i++)
  {
	row = sheet.getRow(i);
	Cell column = row.getCell(colnum);
	array[i]= column.getNumericCellValue();
	//System.out.println(array[i]);
	sum = sum+array[i];
	
  }
  aggregate= sum/(row1-1);
  return aggregate;
 }    
//Main method called to ReadExcel Method
 public static void main(String[] args) throws Exception {
	 String ColumnName ="SO_B2UB";//"EMP_TRAN_N_FULL";
	 String ColumnName1="EMP_IN_PROJ";//"EMP_TRAN_MTO";  //GenericMethods.readdatafromExcelusingcolumnName(filePath, ColumnName, "M5");
	/*String ColumnName2="EMP_TRAN_MTS";
	 String ColumnName3 ="EMP_TRAN";*/
	 String filePath="C:\\Edge_Networks\\EdgeNetworks\\Data\\data_testing_v2.xlsx";
	/*double revenueM1=readdatafromExcelusingcolumnName(ColumnName, ColumnName1, "M2");
	double perValue=revenueM1*100;*/
	double revenueM1=readdatafromExcelusingcolumnName1(filePath, ColumnName, "M1");//readdatafromExcelusingcolumnName(ColumnName,ColumnName1, "M1");
    //double revenueM2=readdatafromExcelusingcolumnName1(filePath, ColumnName1, "M2");
	//double revenueM3=readdatafromExcelusingcolumnName1(filePath, ColumnName2, "M4");
	//double revenueM4=readdatafromExcelusingcolumnName1(filePath, ColumnName3, "M4");
	
	//double rr =(revenueM1/revenueM2);//(revenueM1/(revenueM2+revenueM3+revenueM4));
	//double perValue=rr*100;
 	System.out.println("MON_ATTR Aggregation for M1 : "+revenueM1);
	
	/*double sum= (CHCM1/revenueM1);
	System.out.println(sum);*/


}
  
}
