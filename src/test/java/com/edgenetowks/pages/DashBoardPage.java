package com.edgenetowks.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edgenetworks.common.ActionDrivers;
import com.edgenetworks.helper.LoggerHelper;
import com.edgenetworks.helper.WaitHelper;
import com.edgenetworks.utilities.TestBase;

public class DashBoardPage extends TestBase
{
	WaitHelper waitHelper;
	ActionDrivers adriver=new ActionDrivers();
	Logger logger = LoggerHelper.getLogger(DashBoardPage.class);
	
	
	@FindBy(xpath="//li/a[contains(text(),'CREATE RRs')]")
	public WebElement createRR;
	
	@FindBy(xpath="//li/a[contains(text(),'APPROVE RRs')]")
	public WebElement approveRR;
	
	@FindBy(xpath="//li/a[contains(text(),'APPROVE EXTERNAL')]")
	public WebElement externalApprove;
		
	@FindBy(xpath="//div[@class='vue-avatar--wrapper']/span")
	public WebElement loginInitial;
	
	@FindBy(xpath="//ul[@class='dropdown-menu']/li/a[text()='Logout']")
	public WebElement logout;
	
	@FindBy(xpath="//li/a[contains(text(),'Positions')]")
	public WebElement positionLink;
	
	@FindBy(xpath="//section/div/div[contains(@class,'search')]/input[@placeholder='Search Projects']")
	public WebElement searchProject;
	
	@FindBy(xpath="//h2[contains(text(),'Positions')]/../div/input[@placeholder='Search Positions']")
	public WebElement searchPosition;
	
	
	@FindBy(xpath="//li/a[contains(text(),'ALL RRs')]")
	public WebElement allRR;
	
	@FindBy(xpath="//li/a[contains(text(),'PROJECTS')]")
	public WebElement projectLink;
		
	@FindBy(xpath="//div[contains(@class,'input')]/input[@placeholder='Search']")
	public WebElement waitRRSearch;
	
	
	
	public DashBoardPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	public void homeLogin()
	{
		waitHelper.WaitForElementClickable(createRR);
		logger.info("Logged in Successfully");

	}
	
	public String verifyhomeUser() throws Exception
	{
		return adriver.returnText(loginInitial);
	}
	
	public void logoout() throws Exception
	{
		adriver.buttonclick(loginInitial);
		Thread.sleep(1000);
		adriver.buttonclick(logout);
		
	}
	
	public void clickALLRR()
	{
		adriver.buttonclick(allRR);
		waitHelper.WaitForElementClickable(waitRRSearch);
	}
	
	public void clickProject()
	{
		adriver.buttonclick(projectLink);
		waitHelper.WaitForElementClickable(waitRRSearch);
	}
	
	public void clickPosition()
	{
		adriver.buttonclick(positionLink);
		waitHelper.WaitForElementClickable(searchProject);
	}
	
	public void searchProject(String Value) throws Exception
	{
		adriver.buttonclick(searchProject);
		adriver.type(searchProject, Value);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/h4[contains(text(),'"+Value+"')]")).click();
			
	}
	
	public void searchPosition(String positionID) throws Exception
	{
		adriver.buttonclick(searchPosition);
		adriver.type(searchPosition, positionID);
		Thread.sleep(2000);
		waitHelper.WaitForElementClickable(driver.findElement(By.xpath("//h4[@class='position-name']/a[contains(text(),'"+positionID+"')]")));
	}
	
	
	
	
	

}
