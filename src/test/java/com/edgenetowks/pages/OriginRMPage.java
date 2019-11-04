package com.edgenetowks.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
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

public class OriginRMPage extends TestBase
{
	WaitHelper waitHelper;
	ActionDrivers adriver=new ActionDrivers();
	GenericMethods GM = new GenericMethods();
	CreateRR_OpportunityPage opportunityPage = new CreateRR_OpportunityPage(driver);
	Logger logger = LoggerHelper.getLogger(AllRR_Page.class);

	@FindBy(xpath="//div[contains(@class,'dropdown')]/a/span")
	public WebElement iconDropDown;

	@FindBy(linkText="Operate - RMG")
	public WebElement operateRMButton;
	
	@FindBy(linkText="Operate - TA")
	public WebElement operateTAButton;

	@FindBy(xpath="//button[@type='submit']")
	public WebElement searchButton;

	@FindBy(xpath="//div[@class='clearfix']/a[text()='More Details']")
	public WebElement moreDetails;

	@FindBy(className="popover-content")
	public WebElement popUpMoreDetails;
	
	@FindBy(xpath="//span[text()='Request Type']/../b")
	public WebElement requestType;
	
	@FindBy(xpath="//span[text()='Engagement']/../b")
	public WebElement engagement;
	
	@FindBy(xpath="//span[text()='Billable percentage']/../b")
	public WebElement billablePercentage;
	
	@FindBy(xpath="//span[text()='Status']/../b")
	public WebElement statusType;
	
	@FindBy(xpath="//div[contains(@class,'card-demands')]/div/a[contains(text(),'View Supplies')]")
	public WebElement viewSupplyButton;
	
	@FindBy(xpath="//h4[text()='Fulfillment Status']")
	public WebElement waitfullstatus;
	
	@FindBy(xpath="//h5[contains(text(),'Current State')]/span")
	public WebElement currentStatusSupplies;
	
	@FindBy(xpath="//a[text()='achieved competency']")
	public WebElement achevedCompetency;
	
	@FindBy(xpath="//h4[text()='Hire From Outside']/following-sibling::button")
	public WebElement hireFromExternal;
	
	@FindBy(xpath="//button/following-sibling::h4[text()='Choose Desired Sources']")
	public WebElement waitExternalpopup;
	
	@FindBy(xpath="//span[@class='label-text']/preceding-sibling::label")
	public List<WebElement> checkBox ;
	
	public String getMsgRequestTypeText() throws Exception {return adriver.returnText(requestType);}
	public String getMsgEngagementText() throws Exception {return adriver.returnText(engagement);}
	public String getMsgBillablePercentageText() throws Exception {return adriver.returnText(billablePercentage);}
	public String getMsgStatusTypeText() throws Exception {return adriver.returnText(statusType);}
	public String getMsgcurrentStatusViewText() throws Exception {return adriver.returnText(currentStatusSupplies);}
	
	public OriginRMPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	public String getChildURL(WebDriver driver) throws Exception
	{
		return adriver.returnURL(driver);
	}
	public void searchDemandRM(String id) throws Exception
	{

		waitHelper.WaitForElementClickable(opportunityPage.waitOpportunities);
		adriver.type(opportunityPage.waitOpportunities, id);
		adriver.buttonclick(searchButton);
		String idValue=driver.findElement(By.xpath("//div[@class='rows']/div/div/span/span/a[contains(text(),'"+id+"')]")).getText();
		String[] split = idValue.split("-");
		String value= split[1];
		Assert.assertEquals(value, id);
	}

	public void clickMoreDeatils()
	{
		adriver.buttonclick(moreDetails);
		waitHelper.WaitForElementClickable(popUpMoreDetails);
	}
	
	public void clickViewSupply()
	{
		adriver.buttonclick(viewSupplyButton);
		waitHelper.WaitForElementClickable(waitfullstatus);
	}
	
	public void searchSupplyAndClick(String supplySearch) throws Exception
	{
		adriver.type(opportunityPage.waitOpportunities, supplySearch);
		adriver.buttonclick(searchButton);
		driver.findElement(By.xpath("//a[@class='card-demands__title']/span[contains(text(),'"+supplySearch+"')]")).click();
		GenericMethods.switchThirdChildWindow();
		Thread.sleep(4000);
		adriver.buttonclick(achevedCompetency);
		TestBase.tearDown();
		GenericMethods.switchChildWindow();
	}
	
	public void clickExternalSource() throws Exception
	{
		adriver.buttonclick(hireFromExternal);
		Thread.sleep(2000);
		waitHelper.WaitForElementClickable(waitExternalpopup);
	}
	
	public void selectMultipleCheckBox()
	{
		
		for ( WebElement selectCheckBox : checkBox ) {
		    if ( !selectCheckBox.isSelected() ) {
		    	selectCheckBox.click();
		    }
		}
		
	}

}
