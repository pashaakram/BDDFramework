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

public class ProjectValidationPage extends TestBase
{
	WaitHelper waitHelper;
	ActionDrivers adriver=new ActionDrivers();
	GenericMethods GM = new GenericMethods();
	Logger logger = LoggerHelper.getLogger(ProjectValidationPage.class);
	AllRR_Page allPage =new AllRR_Page(driver);
	
	
	@FindBy(xpath="//div[contains(@class,'input')]/input[@placeholder='Search']")
	public WebElement waitRRSearch;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement buttonSearch;
	
	public ProjectValidationPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	
	public void selectProject(String projectName) throws Exception
	{
		waitHelper.WaitForElementClickable(waitRRSearch);
		adriver.type(waitRRSearch, projectName);
		Thread.sleep(1000);
		adriver.buttonclick(buttonSearch);
		Thread.sleep(2000);
		waitHelper.WaitForElementClickable(driver.findElement(By.xpath("//td/span[contains(text(),'"+projectName+"')]")));
		adriver.buttonclick(driver.findElement(By.xpath("//span[contains(text(),'"+projectName+"')]/../following-sibling::td/span/span/a[contains(text(),'View RRs')]")));
		Thread.sleep(2000);
		//waitHelper.WaitForElementClickable(allPage.projectSelectName);
	}
	
	
	

}
