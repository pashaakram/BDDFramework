package com.edgenetworks.common;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.edgenetworks.helper.LoggerHelper;
import com.edgenetworks.helper.WaitHelper;
import com.edgenetworks.utilities.TestBase;

public class GenericMethods extends TestBase
{
	ActionDrivers adriver=new ActionDrivers();
	Logger logger = LoggerHelper.getLogger(GenericMethods.class);
	WaitHelper waitHelper= new WaitHelper(driver);;

	public void login(WebDriver driver,WebElement elementWait,WebElement elementUName,String uName,WebElement elementPWD,String pwd,WebElement loginbutton) throws Exception
	{
		logger.info("Initializing Login Functionality");
		adriver.type(elementUName, uName);
		Thread.sleep(1000);
		adriver.type(elementPWD, pwd);
		//adriver.buttonclick(loginbutton);
		adriver.doubleClick(driver, loginbutton);
		waitHelper.WaitForElementClickable(elementWait);


	}

	public void readRowValue(String value)
	{

		int i;

		int rowCount = driver.findElements(By.xpath("//table[contains(@class,'table')]/tbody/tr")).size();
		String[] data1 = new String[rowCount+1];
		//System.out.println("Total number of rows "+rowCount);


		//System.out.println("Total number of columns "+columnCount);

		for(i=1;i<=rowCount;i++)
		{

			String data= driver.findElement(By.xpath("//table[contains(@class,'table')]/tbody/tr["+i+"]/td[2]/span")).getText();
			//System.out.println(data);
			data1[i]=data;
			List<String> list = Arrays.asList(data1[i]);
			//System.out.println(data1[i]+"\t");
			if(list.contains(value))
			{
				logger.info("RR with Specific id is persent");
				String createValue=driver.findElement(By.xpath("//table[contains(@class,'table')]/tbody/tr["+i+"]/td[8]/span")).getText();
				if(createValue.equals("Created"))
				{
					System.out.println("RR with Specific id is persent and its status is Created");
					logger.info("RR with Specific id is persent and its status is Created");
					break;
				}
			}

		}




	}
	public int readTableValues()
	{

		int  rowCount =0;

		rowCount= driver.findElements(By.xpath("//table[contains(@class,'table')]/tbody/tr")).size();

		System.out.println("Total number of rows "+rowCount);
		return rowCount;
	}

	/*public static String readDataFromFile()
	{
		String line = null;
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					""));
			 line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}*/
	public static String readFileAsString(String fileName)throws Exception 
	{ 
		String data = ""; 
		data = new String(Files.readAllBytes(Paths.get(fileName))); 
		return data; 
	} 

	public static void dateFrom(String date,int index) throws Exception
	{

		//String date = "10-Oct-2019";
		String splitter[] = date.split("-");
		String setDate = splitter[0];
		String setMonth = splitter[1];
		String setYear = splitter[2];
		Thread.sleep(2000);
		String yearValue= driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-header']/a[6]")).getText(); 
		// System.out.println(yearValue);
		if(yearValue.equals(setYear))
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-header']/a[text()='"+yearValue+"']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-content']/div[@class='mx-calendar-year']/a[text()='"+setYear+"']")).click();
			String monthValue= driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-header']/a[5]")).getText();
			driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-header']/a[text()='"+monthValue+"']")).click();
			if(monthValue.equals(setMonth))
			{
				driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-header']/a[text()='"+monthValue+"']")).click();
				// waitHelper.WaitForElementClickable("//div[@class='mx-datepicker-popup range']/div/div[2]/div[@class='mx-calendar-content']/div[@class='mx-calendar-month']/a[5]");
				Thread.sleep(2000);

				driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-content']/div[@class='mx-calendar-month']/a[text()='"+setMonth+"']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-content']/table/tbody/tr/td[text()='"+setDate+"']")).click();
			}
			else
			{
				driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-header']/a[text()='"+monthValue+"']")).click();
				// waitHelper.WaitForElementClickable("//div[@class='mx-datepicker-popup range']/div/div[2]/div[@class='mx-calendar-content']/div[@class='mx-calendar-month']/a[5]");
				Thread.sleep(2000);

				driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-content']/div[@class='mx-calendar-month']/a[text()='"+setMonth+"']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-content']/table/tbody/tr/td[text()='"+setDate+"']")).click();

			}

		}
		else
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-header']/a[text()='"+yearValue+"']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-content']/div[@class='mx-calendar-year']/a[text()='"+setYear+"']")).click();
			String monthValue= driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-header']/a[5]")).getText();
			driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-header']/a[text()='"+monthValue+"']")).click();
			if(monthValue.equals(setMonth))
			{
				driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-header']/a[text()='"+monthValue+"']")).click();
				// waitHelper.WaitForElementClickable("//div[@class='mx-datepicker-popup range']/div/div[2]/div[@class='mx-calendar-content']/div[@class='mx-calendar-month']/a[5]");
				Thread.sleep(2000);

				driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-content']/div[@class='mx-calendar-month']/a[text()='"+setMonth+"']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-content']/table/tbody/tr/td[@class='curMonth' and text()='"+setDate+"']")).click();
			}
			else
			{
				driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-header']/a[text()='"+monthValue+"']")).click();
				// waitHelper.WaitForElementClickable("//div[@class='mx-datepicker-popup range']/div/div[2]/div[@class='mx-calendar-content']/div[@class='mx-calendar-month']/a[5]");
				Thread.sleep(2000);

				driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-content']/div[@class='mx-calendar-month']/a[text()='"+setMonth+"']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='mx-datepicker-popup range']/div/div["+index+"]/div[@class='mx-calendar-content']/table/tbody/tr/td[@class='curMonth' and text()='"+setDate+"']")).click();

			}
		}

	}

	public static void switchChildWindow()
	{
		Set<String> winhandles = driver.getWindowHandles();
		Iterator<String> it = winhandles.iterator();
		String mainWindow=it.next();
		String childWindow =it.next();
		driver.switchTo().window(childWindow);
	}

	public static void switchThirdChildWindow()
	{
		Set<String> winhandles = driver.getWindowHandles();
		Iterator<String> it = winhandles.iterator();
		String mainWindow=it.next();
		String childWindow =it.next();
		String thirdChild =it.next();
		driver.switchTo().window(thirdChild);
	}

	public static void switchParentWindow()
	{
		Set<String> winhandles = driver.getWindowHandles();
		Iterator<String> it = winhandles.iterator();
		String mainWindow=it.next();
		String childWindow =it.next();
		driver.switchTo().window(mainWindow);
	}
	// Generating the random number between 2 values
	public static int randomNumber(int min, int max) {
		Random r = new Random();
		int result = r.nextInt(max - min) + min;
		return result;
	}

	// Selecting the range bar in HA
	public static void rangeBar(WebElement slider, int pointer) {
		int width = slider.getSize().getWidth();
		Actions move = new Actions(driver);
		move.moveToElement(slider, ((width * pointer) / 100), 0).click();
		move.build().perform();
	}

	//launchNewTab
	public void launchNewTab(WebElement icon,WebElement operateButton) throws Exception
	{
		adriver.buttonclick(icon);
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(operateButton).keyUp(Keys.CONTROL).build().perform();Thread.sleep(2000);
	}

	//Read the table value with same status which has multiple pages
	public int retriveTableCount(String option) throws Exception
	{
		int pageNumber=driver.findElements(By.xpath("//ul[@class='pagination']/li/a")).size();
		int count=0;
		for(int k=1;k<=pageNumber;)
		{

			/*List<WebElement> next=driver.findElements(By.xpath("//ul[@class='pagination']/li/a[@aria-label='Previous']/span[text()='▸']"));
			if(next.size()>0)
			{*/
				driver.findElement(By.xpath("//ul[@class='pagination']/li/a[text()='"+k+"']")).click();
				Thread.sleep(2000);

				int rowCount = driver.findElements(By.xpath("//table[contains(@class,'table')]/tbody/tr")).size();

				//int columnCount = driver.findElements(By.xpath("//table[contains(@class,'table')]/thead/tr/th")).size();
				String[] data1 = new String[rowCount+1];
				//System.out.println("Total number of rows "+rowCount);


				//System.out.println("Total number of columns "+columnCount);

				for(int i=1;i<=rowCount;i++)
				{
					// /td[2]/span
					String data= driver.findElement(By.xpath("//table[contains(@class,'table')]/tbody/tr["+i+"]//td[8]/span")).getText();
					System.out.println(data);
					data1[i]=data;
					if(data.contains(option))
					{
						count++;
						System.out.println("Table contains : "+option);
					}
					else
					{
						System.out.println("Table contains other than : "+data);
					}
					//System.out.println(data1[i]+"\t");
					//count++;
					
					
				}
				List<WebElement> next=driver.findElements(By.xpath("//ul[@class='pagination']/li/a[@aria-label='Previous']/span[text()='▸']"));
				if(next.size()>0)
				{
					k++;
				}
				else
				{
					break;
				}

			//}
			/*else
			{
				break;
			}*/



		}
		System.out.println("Count value="+count);
		return count;
	}
	
	public boolean checkIsExist(WebElement element)
	{
		boolean status=adriver.checkIsExist(element);
		return status;
		
	}
	
	//Read the table value which has different status which has multiple pages
		public int tableCountRetrieve() throws Exception
		{
			int pageNumber=driver.findElements(By.xpath("//ul[@class='pagination']/li/a")).size();
			int count=0;
			for(int k=1;k<=pageNumber;)
			{

				/*List<WebElement> next=driver.findElements(By.xpath("//ul[@class='pagination']/li/a[@aria-label='Previous']/span[text()='▸']"));
				if(next.size()>0)
				{*/
					driver.findElement(By.xpath("//ul[@class='pagination']/li/a[text()='"+k+"']")).click();
					Thread.sleep(2000);

					int rowCount = driver.findElements(By.xpath("//table[contains(@class,'table')]/tbody/tr")).size();

					//int columnCount = driver.findElements(By.xpath("//table[contains(@class,'table')]/thead/tr/th")).size();
					String[] data1 = new String[rowCount+1];
					//System.out.println("Total number of rows "+rowCount);


					//System.out.println("Total number of columns "+columnCount);

					for(int i=1;i<=rowCount;i++)
					{
						// /td[2]/span
						String data= driver.findElement(By.xpath("//table[contains(@class,'table')]/tbody/tr["+i+"]")).getText();
						//System.out.println(data);
						data1[i]=data;
						
						//System.out.println(data1[i]+"\t");
						count++;
						
						
					}
					List<WebElement> next=driver.findElements(By.xpath("//ul[@class='pagination']/li/a[@aria-label='Previous']/span[text()='▸']"));
					if(next.size()>0)
					{
						k++;
					}
					else
					{
						break;
					}

				//}
				/*else
				{
					break;
				}*/



			}
			System.out.println("Count value="+count);
			return count;
		}
		
		
		//Read excel sheet value and finding aggregate of particular column
		public static double readdatafromExcelusingcolumnName(String filePath,String ColumnName,String sheetValue) throws Exception 
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
			sum = sum+array[i];
			
		  }
		  aggregate= sum/(row1-1);
		  return aggregate;
		 }
		
			//Read excel sheet value and dividing two column values and finding aggregate of whole column
				public static double readdatafromExcelAggregateColumn(String filePath,String ColumnName,String ColumnName1,String sheetValue) throws Exception 
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
				  //System.out.println(row1);
				// it will give you count of row which is used or filled
				  short lastcolumnused = row.getLastCellNum();

				  int colnum = 0;
				  for (int i = 0; i < lastcolumnused; i++) 
				  {
				   if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(ColumnName)) 
				   {
				    colnum = i;
				   // System.out.println(colnum);
				    break;
				   }
				  }
				 
				  int colnum1=0;
				  for (int i = 0; i < lastcolumnused; i++) 
				  {
				   if (row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(ColumnName1)) 
				   {
				    colnum1 = i;
				   // System.out.println(colnum1);
				    break;
				   }
				  }
				  
				  double[] array = new double[row1];
				 // System.out.println(array.length);
				  for (int i=1;i<array.length;i++)
				  {
					  row = sheet.getRow(i);
						Cell column = row.getCell(colnum);
						Cell column1 = row.getCell(colnum1);
						
						double col = column.getNumericCellValue();
						double col1=column1.getNumericCellValue();
						array[i]= col/col1;
						//System.out.println(array[i]);
						sum = sum+array[i];
						
				  }
				 
				  aggregate= sum/(row1-1);
				  return aggregate;
				 }
		 
	
	
}
