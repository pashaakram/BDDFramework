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

public class IWOValidationPage extends TestBase
{
	WaitHelper waitHelper;
	ActionDrivers adriver=new ActionDrivers();
	GenericMethods GM = new GenericMethods();
	Logger logger = LoggerHelper.getLogger(IWOValidationPage.class);
	CreateRR_OpportunityPage opportunityPage = new CreateRR_OpportunityPage(driver);
	
	@FindBy(xpath="//div[contains(@class,'dropdown')]/a/span")
	public WebElement iconDropDown;

	@FindBy(linkText="Operate - RMG")
	public WebElement operateRMButton;
	
	@FindBy(xpath="//span[text()='Filters']/ancestor::div[@class='clearfix']/div[2]/div/div/h4/span")
	public WebElement costCenter;
	
	@FindBy(xpath="//span[text()='Filters']/ancestor::div[@class='clearfix']/div[3]/div/div/h4/span")
	public WebElement experienceLower;
	
	@FindBy(xpath="//span[text()='Filters']/ancestor::div[@class='clearfix']/div[4]/div/div/h4/span")
	public WebElement experienceUpper;
	
	@FindBy(xpath="//span[text()='Filters']/ancestor::div[@class='clearfix']/div[5]/div/div/h4/span")
	public WebElement payBand;
	
	@FindBy(xpath="//span[text()='Filters']/ancestor::div[@class='clearfix']/div[6]/div/div/h4/span")
	public WebElement practice;
	
	@FindBy(xpath="//span[text()='Filters']/ancestor::div[@class='clearfix']/div[7]/div/div/h4/span")
	public WebElement rrType;
	
	@FindBy(xpath="//span[text()='Filters']/ancestor::div[@class='clearfix']/div[8]/div/div/h4/span")
	public WebElement visaType;
	
	@FindBy(xpath="//a[text()='clear']")
	public WebElement clearLink;
	
	@FindBy(xpath="//div[@class='clearfix']/a[text()='More Details']")
	public WebElement moreDetails;

	@FindBy(className="popover-content")
	public WebElement popUpMoreDetails;
	
	@FindBy(xpath="//span[text()='Status']/../b")
	public WebElement statusType;
	
	@FindBy(xpath="//h3[contains(text(),'RRs')]/ancestor::div[@class='row']/following-sibling::div/div[2]/div[contains(@class,'dropdown')]/div/div[1]/span")
	public List<WebElement> statusSelect;
	
	@FindBy(xpath="//h3[contains(text(),'RRs')]/ancestor::div[@class='row']/following-sibling::div/div[2]/div[contains(@class,'dropdown')]/div/div/input[@aria-label='Search for option' and @type='search']")
	public WebElement dropDownStatus;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement searchButton;
	
	public String getMsgCostCenterText() throws Exception {return adriver.returnText(costCenter);}
	public String getMsgExperienceLowerText() throws Exception {return adriver.returnText(experienceLower);}
	public String getMsgExperienceUpperText() throws Exception {return adriver.returnText(experienceUpper);}
	public String getMsgPayBandText() throws Exception {return adriver.returnText(payBand);}
	public String getMsgPracticeText() throws Exception {return adriver.returnText(practice);}
	public String getMsgRRTypeText() throws Exception {return adriver.returnText(rrType);}
	public String getMsgVisaTypeText() throws Exception {return adriver.returnText(visaType);}
	public String getMsgStatusTypeText() throws Exception {return adriver.returnText(statusType);}
	
	public IWOValidationPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	public void launchIwo()
	{
		adriver.buttonclick(iconDropDown);
		waitHelper.WaitForElementClickable(operateRMButton);
		adriver.buttonclick(operateRMButton);
		waitHelper.WaitForElementClickable(opportunityPage.waitOpportunities);
	}
	
	public void clickFilterDropDown(String filterName,String FilterValue) throws Exception
	{
		driver.findElement(By.xpath("//span[text()='"+filterName+"']/../following-sibling::a")).click();
		waitHelper.WaitForElementClickable(driver.findElement(By.xpath("//span[contains(text(),'"+FilterValue+"')]")));
		String filterCount=driver.findElement(By.xpath("//span[contains(text(),'"+FilterValue+"')]/following-sibling::span")).getText();
		driver.findElement(By.xpath("//span[contains(text(),'"+FilterValue+"')]")).click();
		Thread.sleep(2000);
		String recordCount = driver.findElement(By.xpath("//span[text()='Records']/../span[1]")).getText();
		Assert.assertEquals(filterCount, recordCount);
		logger.info(filterName+" Filter Count is found Matching");
		adriver.buttonclick(clearLink);
		driver.findElement(By.xpath("//span[text()='"+filterName+"']/../following-sibling::a")).click();
		Thread.sleep(2000);
		
	}
	
	public void selectValueDropDown(WebElement element ,WebElement input,String Option) throws Exception
	{
		if(statusSelect.size()>0)
		{
			driver.findElement(By.xpath("//h3[contains(text(),'RRs')]/ancestor::div[@class='row']/following-sibling::div/div[2]/div[contains(@class,'dropdown')]/div/div[1]/span")).click();
			Thread.sleep(1000);
			WebElement project=input;//driver.findElement(By.xpath("//h3[contains(text(),'RRs')]/ancestor::div[@class='row']/following-sibling::div/div[2]/div[contains(@class,'dropdown')]/div/div[1]/span"));
			project.sendKeys(Option);
			project.sendKeys(Keys.DOWN);
			project.sendKeys(Keys.RETURN);
			Thread.sleep(2000);
			adriver.buttonclick(moreDetails);
			waitHelper.WaitForElementClickable(popUpMoreDetails);
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
			adriver.buttonclick(moreDetails);
			waitHelper.WaitForElementClickable(popUpMoreDetails);
		}

	}
	
	public String searchRR(String rrNumber) throws Exception
	{
	adriver.buttonclick(opportunityPage.waitOpportunities);
	adriver.type(opportunityPage.waitOpportunities,rrNumber);
	adriver.buttonclick(searchButton);
	Thread.sleep(2000);
	String idValue=driver.findElement(By.xpath("//div[@class='rows']/div/div/span/span/a[contains(text(),'"+rrNumber+"')]")).getText();
	String[] split = idValue.split("-");
	String value= split[1];
	return value;
	}

}
