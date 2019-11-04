import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.edgenetowks.pages.CreateRR_OpportunityPage;
import com.edgenetworks.common.ActionDrivers;
import com.edgenetworks.common.GenericMethods;


public class DemoClass {

	public static Properties prop;

	public static void main(String[] args) throws Exception
	{
		
		String oppName="Quality Assurance";
		ActionDrivers adriver=new ActionDrivers();
		GenericMethods GM = new GenericMethods();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/BrowserDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,80);
		driver.manage().window().maximize();
		CreateRR_OpportunityPage opportunityPage = new CreateRR_OpportunityPage(driver);
		//String url = prop.getProperty("url");
		driver.get("https://ust--dev--dms.hirealchemy.com/#/");
		Thread.sleep(2000);
		//String data=GenericMethods.readFileAsString(System.getProperty("user.dir")+"/Data/Job_Description.txt");
		driver.findElement(By.name("username")).sendKeys("dmsadmin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("dmsadmin@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li/a[contains(text(),'CREATE RRs')]")));
		Thread.sleep(2000);
				
		/*driver.findElement(By.xpath("//li/a[contains(text(),'CREATE RRs')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'dashboard-actions')]/div[@class='action']/p[text()='Create RR from']")).click();
		Thread.sleep(2000);*/
		
		driver.findElement(By.xpath("//li/a[contains(text(),'ALL RRs')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(@class,'dropdown')]/div[@class='dropdown-toggle']/div/span[contains(text(),'All RRs')]")).click();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//div[contains(@class,'dropdown')]/div[@class='dropdown-toggle']/div/input"));
		Thread.sleep(2000);
		ele.sendKeys("Created");
		ele.sendKeys(Keys.DOWN);
		ele.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//String RR_ID="1000001072";

        
       
		
		//    //ul[@class='pagination']/li/a
	   int pageNumber=driver.findElements(By.xpath("//ul[@class='pagination']/li/a")).size();
		int count=0;
		System.out.println(pageNumber);
	
		List<String> names = new ArrayList<String>();
		for(int k=1;k<=pageNumber;k++)
		{
			
			List<WebElement> next=driver.findElements(By.xpath("//ul[@class='pagination']/li/a[@aria-label='Previous']/span[text()='▸']"));
			if(next.size()>0)
			{
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
					
			}
			else
			{
				break;
			}
			
			
			
		}
		System.out.println("Count value="+count);
		/*driver.findElement(By.xpath("//span[text()='"+RR_ID+"']/../../td/span/span/a[contains(text(),'View')]")).click();
		Thread.sleep(10000);
		String id=opportunityPage.getPreviewID();
		
		System.out.println("Id : "+id);*/
		
		
		
		/*int rowCount = driver.findElements(By.xpath("//table[contains(@class,'table')]/tbody/tr")).size();
		
		int columnCount = driver.findElements(By.xpath("//table[contains(@class,'table')]/thead/tr/th")).size();
		
		System.out.println("Total number of rows "+rowCount);
		
		System.out.println("Total number of columns "+columnCount);
		String[] data1 = new String[rowCount+1];
		for(int i=1;i<=rowCount;i++)
		{
			
				String data= driver.findElement(By.xpath("//table[contains(@class,'table')]/tbody/tr["+i+"]")).getText();
				//System.out.println(data);
				data1[i]=data;
				//System.out.println(data1[i]);
				
		}
		System.out.println("------------------------------------------------");
		System.out.println(data1[1]);*/
		
		
		/*wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'input')]/input[@placeholder='Search']")));
		driver.findElement(By.xpath("//div[contains(@class,'input')]/input[@placeholder='Search']")).sendKeys(oppName);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td/span[text()='"+oppName+"']")));
		driver.findElement(By.xpath("//td/span[text()='"+oppName+"']/ancestor::tr/td/span/span/a[text()=' Create RR']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/h2[contains(text(),'Enter Opportunity')]")));
		Thread.sleep(2000);*/
		/*String org_id=driver.findElement(By.xpath("//div[@name='opportunity id']/input[@class='form-control']")).getText();
		System.out.println(org_id);*/
		//driver.quit();
		
		
		
		
		/*----
		 * Code to generate random string of specific length
		 */
        /*int n = 10; 
        String value="90346565016";
        String characterData=DemoClass.getAlphaNumericString(n,value);
        // Get and display the alphanumeric string 
        System.out.println(characterData); */
	
	}
	
	
	
	
	/*// function to generate a random string of length n 
    static String getAlphaNumericString(int n,String data) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
    	String AlphaNumericString=data;
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
*/
}
