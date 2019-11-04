package com.edgenetowks.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.edgenetworks.common.ActionDrivers;
import com.edgenetworks.common.GenericMethods;
import com.edgenetworks.helper.LoggerHelper;
import com.edgenetworks.helper.WaitHelper;
import com.edgenetworks.utilities.TestBase;

public class AllRR_Page extends TestBase
{
	WaitHelper waitHelper;
	ActionDrivers adriver=new ActionDrivers();
	GenericMethods GM = new GenericMethods();
	Logger logger = LoggerHelper.getLogger(AllRR_Page.class);
	DashBoardPage dashBoardPage =new DashBoardPage(driver);
	CreateRR_PreviewPage previewPage = new CreateRR_PreviewPage(driver);

	@FindBy(xpath="//div[contains(@class,'heading')]/h5[text()='Origination Details']")
	public WebElement waitOrginationDetails;

	@FindBy(xpath="//button[contains(text(),'Submit for Approval')]")
	public WebElement submit;


	@FindBy(xpath="//button[contains(text(),'RM Approve')]")
	public WebElement rm_approve;


	@FindBy(xpath="//button[contains(text(),'Force Approve')]")
	public WebElement force_Approve;

	@FindBy(xpath="//button[contains(text(),'Reject')]")
	public WebElement reject;
	
	@FindBy(xpath="//button[contains(text(),'Cost Centre Approve')]")
	public WebElement costApprove;
	
	
	@FindBy(xpath="//button/span[text()='OK']")
	public WebElement okButton;

	@FindBy(xpath="//h4[text()='Choose Desired Sources']/ancestor::div/div[contains(@class,'footer')]/button/span[text()='OK']")
	public WebElement secondOkButton;

	@FindBy(xpath="//div[contains(@class,'dropdown')]/div[@class='dropdown-toggle']/div/span[contains(text(),'All RRs')]")
	public WebElement dropDown;

	@FindBy(xpath="//div[contains(@class,'dropdown')]/div[@class='dropdown-toggle']/div/input")
	public WebElement dropDownInput;

	@FindBy(xpath="//h3[@class='page-title']")
	public WebElement validateCount;

	@FindBy(xpath="//h3[contains(text(),'RRs')]/ancestor::div[@class='row']/following-sibling::div/div[2]/div[contains(@class,'dropdown')]/div/div/input[@aria-label='Search for option' and @type='search']")
	public WebElement dropDownProject;

	@FindBy(xpath="//h3[contains(text(),'RRs')]/ancestor::div[@class='row']/following-sibling::div/div[3]/div[contains(@class,'dropdown')]/div/div/input[@aria-label='Search for option' and @type='search']")
	public WebElement dropDownAccount;

	@FindBy(xpath="//h3[contains(text(),'RRs')]/ancestor::div[@class='row']/following-sibling::div/div[4]/div[contains(@class,'dropdown')]/div/div/input[@aria-label='Search for option' and @type='search']")
	public WebElement dropDownLocation;

	/*@FindBy(xpath="//h3[contains(text(),'RRs')]/ancestor::div[@class='row']/following-sibling::div/div[2]/div[contains(@class,'dropdown')]/div/div[1]")
	public WebElement dropDownProject;*/

	@FindBy(xpath="//h3[contains(text(),'RRs')]/ancestor::div[@class='row']/following-sibling::div/div[2]/div[contains(@class,'dropdown')]/div/div[1]/span")
	public List<WebElement> projectSelect;

	@FindBy(xpath="//h3[contains(text(),'RRs')]/ancestor::div[@class='row']/following-sibling::div/div[2]/div[contains(@class,'dropdown')]/div/div[1]/span")
	public WebElement projectSelectName;

	@FindBy(xpath="//table/tbody/tr[1]/td[9]//span/a[contains(text(),'View')]")
	public WebElement clickView;







	public String getMsgValidteValueText() throws Exception {return adriver.returnText(validateCount);}
	public String getMsgProjectSelectValueText() throws Exception {return adriver.returnText(projectSelectName);}

	public AllRR_Page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}



	public void clickViewButton(String id) throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+id+"']/../../td/span/span/a[contains(text(),'View')]")).click();
		waitHelper.WaitForElementClickable(waitOrginationDetails);
	}

	public void scrollPageApprove() throws Exception
	{
		adriver.scrollDown(driver, submit);
		adriver.buttonclick(submit);
		Thread.sleep(2000);
	}

	public String getStatus(String id) throws Exception
	{
		return adriver.returnText(driver.findElement(By.xpath("//span[text()='"+id+"']/../../td[8]/span")));

	}



	public void scrollPageForceApprove(String option) throws Exception
	{
		switch(option)
		{
		case "RM_Approve":
			adriver.scrollDown(driver, rm_approve);
			adriver.buttonclick(rm_approve);
			Thread.sleep(2000);
			break;
		case "Force_Approve":
			adriver.scrollDown(driver, force_Approve);
			adriver.buttonclick(force_Approve);
			Thread.sleep(2000);
			break;
		case "Cost_Approve":
			adriver.scrollDown(driver, costApprove);
			adriver.buttonclick(costApprove);
			Thread.sleep(2000);
			break;
		case "Rejected":
			adriver.scrollDown(driver, reject);
			adriver.buttonclick(reject);
			waitHelper.WaitForElementClickable(okButton);
			adriver.buttonclick(okButton);
			Thread.sleep(2000);
			break;
		default:
			System.out.println("Pass Proper input");
			break;
		}

	}

	public void selectValueDropDown(WebElement element ,WebElement input,String Option) throws Exception
	{
		if(projectSelect.size()>0)
		{
			driver.findElement(By.xpath("//h3[contains(text(),'RRs')]/ancestor::div[@class='row']/following-sibling::div/div[2]/div[contains(@class,'dropdown')]/div/div[1]/span")).click();
			Thread.sleep(1000);
			WebElement project=input;//driver.findElement(By.xpath("//h3[contains(text(),'RRs')]/ancestor::div[@class='row']/following-sibling::div/div[2]/div[contains(@class,'dropdown')]/div/div[1]/span"));
			project.sendKeys(Option);
			project.sendKeys(Keys.DOWN);
			project.sendKeys(Keys.RETURN);
			Thread.sleep(2000);
		}
		else
		{
			adriver.buttonclick(element);
			Thread.sleep(1000);
			WebElement ele=input;
			Thread.sleep(1000);
			ele.sendKeys(Option);
			ele.sendKeys(Keys.DOWN);
			ele.sendKeys(Keys.RETURN);
			Thread.sleep(2000);
		}

	}

	public void validateProjectName(String projectName,int count) throws Exception
	{
		if(count==0)
		{
			System.out.println("Table value is equal to 0");
			dashBoardPage.clickProject();
			driver.navigate().refresh();
			dashBoardPage.clickALLRR();
			driver.navigate().refresh();
		}
		else
		{
			Thread.sleep(1000);
			adriver.buttonclick(clickView);
			waitHelper.WaitForElementClickable(waitOrginationDetails);
			String pName=previewPage.getMsgPNameText();
			Assert.assertEquals(pName, projectName);
		}
	}

	public void validateProject_Account(String projectName,int count,String account) throws Exception
	{
		if(count==0)
		{
			System.out.println("Table value is equal to 0");
			dashBoardPage.clickProject();
			driver.navigate().refresh();
			dashBoardPage.clickALLRR();
			driver.navigate().refresh();
		}
		else
		{
			Thread.sleep(1000);
			adriver.buttonclick(clickView);
			waitHelper.WaitForElementClickable(waitOrginationDetails);
			String pName=previewPage.getMsgPNameText();
			Assert.assertEquals(pName, projectName);
			String Otype=previewPage.getMsgOriginationTypeText();
			Assert.assertEquals(Otype, account);
		}
	}


}
