package com.edgenetowks.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edgenetworks.common.ActionDrivers;
import com.edgenetworks.common.GenericMethods;
import com.edgenetworks.helper.LoggerHelper;
import com.edgenetworks.helper.WaitHelper;
import com.edgenetworks.utilities.TestBase;

public class ManuallyCreateRR extends TestBase
{
////ul[@class='dropdown-menu']/li/a[contains(text(),'OPP-0000000029')]
	WaitHelper waitHelper;
	ActionDrivers adriver=new ActionDrivers();
	GenericMethods GM = new GenericMethods();
	Logger logger = LoggerHelper.getLogger(ManuallyCreateRR.class);

	@FindBy(xpath="//div[contains(@class,'opportunity-search')]/input[@id='searchRR']")
	public WebElement searchOpportunityRR;
	
	@FindBy(xpath="//a[contains(@class,'dashboard-actions')]/div[@class='action']/p[text()='Manually Create']")
	public WebElement manualCreateRR_form;
	
	
	
	public ManuallyCreateRR(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	
	public void enterOpportunity(String oppName) throws Exception
	{
		waitHelper.WaitForElementClickable(searchOpportunityRR);
		adriver.buttonclick(searchOpportunityRR);
		adriver.type(searchOpportunityRR, oppName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']/li/a[contains(text(),'"+oppName+"')]")).click();
		Thread.sleep(2000);
	}
	
	
	
}
