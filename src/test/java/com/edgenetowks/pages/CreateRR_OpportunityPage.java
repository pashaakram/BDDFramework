package com.edgenetowks.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edgenetworks.common.ActionDrivers;
import com.edgenetworks.common.GenericMethods;
import com.edgenetworks.helper.LoggerHelper;
import com.edgenetworks.helper.WaitHelper;
import com.edgenetworks.utilities.TestBase;

import cucumber.api.DataTable;

public class CreateRR_OpportunityPage extends TestBase
{
	WaitHelper waitHelper;
	ActionDrivers adriver=new ActionDrivers();
	GenericMethods GM = new GenericMethods();
	Logger logger = LoggerHelper.getLogger(CreateRR_OpportunityPage.class);
	CreateRR_PreviewPage previewPage = new CreateRR_PreviewPage(driver);

	@FindBy(xpath="//li/a[contains(text(),'CREATE RRs')]")
	public WebElement createRR;

	@FindBy(xpath="//a[contains(@class,'dashboard-actions')]/div[@class='action']/p[text()='Create RR from']")
	public WebElement createRR_form;

	@FindBy(xpath="//div[contains(@class,'input')]/input[@placeholder='Search']")
	public WebElement waitOpportunities;

	@FindBy(xpath="//h3[@class='page-title']")
	public WebElement opportunityCount;

	@FindBy(xpath="//button[@type='submit']")
	public WebElement buttonSearch;

	@FindBy(xpath="//h2[text()='Enter Opportunity and Project details']")
	public WebElement waitProject;

	@FindBy(xpath="//label[text()='RR Initiator']/../input[@type='text']")
	public WebElement initiatorType;

	@FindBy(xpath="//button[text()='Next']")
	public WebElement clickNext;


	@FindBy(xpath="//label[text()='Primary RM']/../input[@type='text']")
	public WebElement primaryRM;
	@FindBy(xpath="//label[text()='Engagement Type']/../input[@type='text']")
	public WebElement engageType;
	@FindBy(xpath="//label[text()='Project Name']/../input[@type='text']")
	public WebElement ProjectName;
	@FindBy(xpath="//label[text()='SO Type']/../input[@type='text']")
	public WebElement soType;

	@FindBy(xpath="//div[@name='primary grm']/../span[@class='has-error']")
	public WebElement errPrimary;

	@FindBy(xpath="//div[@name='engagement type']/../span[@class='has-error']")
	public WebElement errEngagement;

	@FindBy(xpath="//div[@name='project name']/../span[@class='has-error']")
	public WebElement errProject;

	@FindBy(xpath="//div[@name='so type']/../span[@class='has-error']")
	public WebElement errSoType;

	@FindBy(xpath="//div[@name='datepicker']/p[text()='Enter Start Date and End Date']")
	public WebElement waitDatePicker;

	@FindBy(xpath="//div[@class='btn-group']/button[text()='Yes']")
	public WebElement extensionYes;

	@FindBy(xpath="//div[@class='btn-group']/button[text()='No']")
	public WebElement extensionNo;

	@FindBy(xpath="//div[@name='duration type']/select")
	public WebElement extensionDropDown;

	@FindBy(xpath="//div[@name='duration value']/input[@type='number']")
	public WebElement durationDate;

	@FindBy(xpath="//h2[text()='Enter Role Details']")
	public WebElement waitRole;

	@FindBy(xpath="//span[text()='Number of Resources']/../div/input")
	public WebElement enterNoResource;

	@FindBy(xpath="//label[text()='Designation']/preceding-sibling::input")
	public WebElement enterDesignation;

	@FindBy(xpath="//label[text()='Primary Skill']/preceding-sibling::input")
	public WebElement enterPrimarySkill;

	@FindBy(xpath="//label[text()='Secondary Skill']/preceding-sibling::input")
	public WebElement enterSecondarySkill;

	@FindBy(xpath="//ul[@class='vue-slider-piecewise']")
	public WebElement barExperienceInEditTemplates;

	@FindBy(xpath="//div[@name='employee id']/input")
	public WebElement emp_id;

	@FindBy(xpath="//label[text()='Grade']/preceding-sibling::input")
	public WebElement grade;

	@FindBy(xpath="//div[@name='job description']/textarea")
	public WebElement enterJobDescription;

	@FindBy(xpath="//div[@name='Duties & Tasks']/textarea")
	public WebElement enterInternalJobDetails;

	@FindBy(xpath="//div[@name='work location']/input[@placeholder='Work Location']")
	public WebElement location;

	@FindBy(xpath="//div/h4")
	public WebElement rr_id;

	@FindBy(xpath="//div/button[text()='Choose']")
	public WebElement chooseButton;

	@FindBy(xpath="//label[text()='Hiring Manager']/preceding-sibling::input")
	public WebElement hiringManager;

	@FindBy(xpath="//label[text()='Delivery Manager']/preceding-sibling::input")
	public WebElement deliveryManager;

	@FindBy(xpath="//label[text()='Interviewer']/preceding-sibling::input")
	public WebElement interviewer;

	@FindBy(xpath="//label[contains(text(),'Client accepeted')]/preceding-sibling::input")
	public WebElement clientAccepted;

	@FindBy(xpath="//button[text()='Preview RR']")
	public WebElement previewRR;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	public WebElement submit;
	
	@FindBy(xpath="//h2[text()='Job Details']")
	public WebElement waitJobDetailsPage;

	@FindBy(xpath="//button[text()='Choose']")
	public WebElement buttonChoose;
	
	@FindBy(xpath="//div[@class='rzslider ng-isolate-scope']/span[@role='slider' and @aria-valuemax='100']")
	public WebElement sliderPoint;
	
	@FindBy(xpath="//a[contains(@class,'link-icon dropdown-toggle')]")
	public WebElement settingIconTA;
	
	@FindBy(xpath="//a[text()='Source Settings']")
	public WebElement sourceSettings;
	
	public By noOption = By.xpath("//p[contains(text(),'Internal')]/../div[contains(@class,'btn')]/button[text()='No']");
	public By yesOption = By.xpath("//p[contains(text(),'Internal')]/../div[contains(@class,'btn')]/button[text()='Yes']");

	public By clientNoOption = By.xpath("//p[contains(text(),'Client')]/../div[contains(@class,'btn')]/button[text()='No']");
	public By clientYesOption = By.xpath("//p[contains(text(),'Client')]/../div[contains(@class,'btn')]/button[text()='Yes']");

	public By bgvNoOption = By.xpath("//p[contains(text(),'BGV')]/../div[contains(@class,'btn')]/button[text()='No']");	
	
	public String getMsgPrimaryErrorText() throws Exception {return adriver.returnText(errPrimary);}
	public String getMsgEngagementErrorText() throws Exception {return adriver.returnText(errEngagement);}
	public String getMsgProjectErrorText() throws Exception {return adriver.returnText(errProject);}
	public String getMsgSoTypeErrorText() throws Exception {return adriver.returnText(errSoType);}
	public String getMsgRR_idText() throws Exception {return adriver.returnText(rr_id);}



	public CreateRR_OpportunityPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	//code click on on Create RR From SFDC opportunity icon in the dash board
	public void navigate_to_opportunityPage()
	{

		adriver.buttonclick(createRR);
		waitHelper.WaitForElementClickable(createRR_form);
		adriver.buttonclick(createRR_form);
		waitHelper.WaitForElementClickable(waitOpportunities);


	}

	// code to check the opportunity count displaying on top left corner of the page
	public String verifyOpportunitiesCount() throws Exception
	{
		waitHelper.WaitForElementClickable(waitOpportunities);
		Thread.sleep(3000);
		return adriver.returnText(opportunityCount);

	}

	//search for the specific project and click on create RR button 
	public void createSpecificJob(String opportunity) throws Exception
	{

		WebElement element = driver.findElement(By.xpath("//table[contains(@class,'table')]/tbody/tr/td/span[text()='"+opportunity+"']"));
		waitHelper.WaitForElementClickable(waitOpportunities);
		adriver.type(waitOpportunities, opportunity);
		adriver.buttonclick(buttonSearch);
		waitHelper.WaitForElementClickable(element);
		WebElement createRR = driver.findElement(By.xpath("//table[contains(@class,'table')]/tbody/tr/td/span[text()='"+opportunity+"']/../following-sibling::td/span/span/a[text()=' Create RR']"));
		adriver.buttonclick(createRR);
		waitHelper.WaitForElementVisible(waitProject);
	}

	//Select specific options from the drop down's  | RR Initiator | Primary RM	| Engagement Type | Project Name| SO Type|
	public void opportunityDetails(String RRInitiator , String Primary_RM , String engagement_Type , String projectName , String SO_Type,String empid) throws Exception
	{
		By initiator = By.xpath("//label[text()='RR Initiator']/../ul[contains(@class,'dropdown-menu')]/li/a/span[text()='"+RRInitiator+"']");
		By primary = By.xpath("//label[text()='Primary RM']/../ul[contains(@class,'dropdown-menu')]/li/a/span[text()='"+Primary_RM+"']");
		By typeEngagement = By.xpath("//label[text()='Engagement Type']/../ul[contains(@class,'dropdown-menu')]/li/a/span[text()='"+engagement_Type+"']");
		By pName = By.xpath("//label[text()='Project Name']/../ul[contains(@class,'dropdown-menu')]/li/a/span[text()='"+projectName+"']");
		By SOtype = By.xpath("//label[text()='SO Type']/../ul[contains(@class,'dropdown-menu')]/li/a/span[text()='"+SO_Type+"']");
		//select RRInitiator value
		adriver.type(initiatorType, RRInitiator);
		Thread.sleep(1000);
		driver.findElement(initiator).click();

		//select Primary_RM value
		adriver.type(primaryRM, Primary_RM);
		Thread.sleep(1000);
		driver.findElement(primary).click();

		//select engagement_Type value
		adriver.type(engageType, engagement_Type);
		Thread.sleep(1000);
		driver.findElement(typeEngagement).click();

		//select projectName value
		adriver.type(ProjectName, projectName);
		Thread.sleep(1000);
		driver.findElement(pName).click();

		//select SO_Type value
		adriver.type(soType, SO_Type);
		Thread.sleep(1000);
		driver.findElement(SOtype).click();

		List<WebElement> emp_ids = driver.findElements(By.xpath("//div[@name='employee id']/input"));
		if(emp_ids.size()>0)
		{
			adriver.type(emp_id, empid);
		}


	}

	public void clickNextButton()
	{
		boolean nextButton=clickNext.isEnabled();
		if(nextButton)
		{
			adriver.buttonclick(clickNext);
		}
		else
		{
			System.out.println("Next Button is not enabled");
		}

	}

	public void setDateFrom(String fromDate) throws Exception
	{
		driver.findElement(By.className("mx-datepicker")).click();
		Thread.sleep(2000);
		GenericMethods.dateFrom(fromDate, 2);


	}

	public void setDateTo(String toDate) throws Exception
	{
		Thread.sleep(2000);
		GenericMethods.dateFrom(toDate,3);
		//System.out.println("Pass");
	}

	public void selectExtension(String extensionOption,String vaueDrop,String number) throws Exception
	{

		driver.findElement(By.xpath("//h4[contains(text(),'RR ID')]")).click();
		switch(extensionOption)
		{
		case "Yes":
			adriver.buttonclick(extensionYes);
			adriver.selectValue(extensionDropDown, vaueDrop);
			adriver.type(durationDate, number);

			break;
		case "No":
			adriver.buttonclick(extensionNo);

			break;
		default:
			System.out.println("Invalid option");
			break;

		}

	}

	public void enterRoleDetails(String resourceNumber,String Designation,String primarySkill,String secondarySkill,String enterGrade) throws Exception
	{
		waitHelper.WaitForElementClickable(waitRole);
		adriver.type(enterNoResource, resourceNumber);
		adriver.type(enterDesignation, Designation);
		driver.findElement(By.xpath("//ul[contains(@class,'dropdown-menu')]/li/a/span[text()='"+Designation+"']")).click();
		adriver.type(enterPrimarySkill, primarySkill);
		driver.findElement(By.xpath("//ul[contains(@class,'dropdown-menu')]/li/a/span[text()='"+primarySkill+"']")).click();
		adriver.type(enterSecondarySkill, secondarySkill);
		driver.findElement(By.xpath("//ul[contains(@class,'dropdown-menu')]/li/a/span[text()='"+secondarySkill+"']")).click();
		adriver.type(grade, enterGrade);
		driver.findElement(By.xpath("//ul[contains(@class,'dropdown-menu')]/li/a/span[text()='"+enterGrade+"']")).click();


	}

	//code read the data from the txt file from the specific location and write to job description block
	public void enterjobDescription() throws Exception
	{
		String data=GenericMethods.readFileAsString(System.getProperty("user.dir")+"/Data/Job_Description.txt");
		adriver.type(enterJobDescription, data);
		Thread.sleep(2000);
	}

	//code read the data from the txt file from the specific location and write to Internal job block
	public void enterInternalJobDetails() throws Exception
	{
		String data=GenericMethods.readFileAsString(System.getProperty("user.dir")+"/Data/Job_Description.txt");
		adriver.type(enterInternalJobDetails, data);
		Thread.sleep(2000);
	}


	public void userChangeTheExperienceBar(int min, int max) throws InterruptedException {
		try {
			Thread.sleep(5000);
			GenericMethods.rangeBar(barExperienceInEditTemplates,GenericMethods.randomNumber(min, max));
		} catch (Exception e) {
			Thread.sleep(500);
			GenericMethods.rangeBar(barExperienceInEditTemplates, GenericMethods.randomNumber(min, max));
		}
	}
	
	

	//code to select the specific location
	public void selectLocation(String place) throws Exception
	{
		//adriver.type(location, place);
		location.sendKeys(place);
		Thread.sleep(2000);
		location.sendKeys(Keys.DOWN);
		location.sendKeys(Keys.RETURN);
	
	}


	public void internalInterview(String option,String hManager,String dManager,String interview) throws Exception
	{

		switch(option)
		{
		case "Yes":
			driver.findElement(yesOption).click();
			waitHelper.WaitForElementClickable(hiringManager);
			adriver.type(hiringManager, hManager);
			driver.findElement(By.xpath("//label[text()='Hiring Manager']/../ul/li/a/span[text()='"+hManager+"']")).click();

			adriver.type(deliveryManager, dManager);
			driver.findElement(By.xpath("//label[text()='Hiring Manager']/../ul/li/a/span[text()='"+dManager+"']")).click();

			adriver.type(interviewer, interview);
			driver.findElement(By.xpath("//label[text()='Hiring Manager']/../ul/li/a/span[text()='"+interview+"']")).click();
			break;

		case "No":
			driver.findElement(noOption).click();
			break;
		default:
			logger.info("Select either Yes/No for internal Interview");
			break;
		}
	}

	public void clientInterview(String option,String modeOfInterview) throws Exception
	{

		switch(option)
		{
		case "Yes":
			driver.findElement(clientYesOption).click();
			driver.findElement(By.xpath("//p[contains(text(),'Mode of Interview')]/../div[contains(@class,'btn')]/button[text()='"+modeOfInterview+"']")).click();
			break;

		case "No":
			driver.findElement(clientNoOption).click();
			break;
		default:
			logger.info("Select either Yes/No for Client Interview");
			break;
		}
	}

	public void enterAccepetedResource(String clientValue) throws Exception
	{
		Thread.sleep(1000);
		adriver.type(clientAccepted, clientValue);
		driver.findElement(By.xpath("//label[contains(text(),'Client accepeted')]/../ul/li/a/span[text()='"+clientValue+"']")).click();
	}

	public void bgvExist(String option) throws Exception
	{
		//boolean bgv = driver.findElement(bgvNoOption).isDisplayed();
		List<WebElement> bgv = driver.findElements(bgvNoOption);
		if(bgv.size()>0)
		{
			driver.findElement(By.xpath("//p[contains(text(),'BGV')]/../div[contains(@class,'btn')]/button[text()='"+option+"']")).click();
			adriver.buttonclick(previewRR);
			Thread.sleep(2000);
		}
		else
		{
			adriver.buttonclick(previewRR);
			Thread.sleep(2000);
		}
	}
	
	public void chooseButtonClick() throws Exception
	{
		Thread.sleep(3000);
		waitHelper.WaitForElementClickable(buttonChoose);
		adriver.buttonclick(buttonChoose);
	}
	
	public String getPreviewID() throws Exception
	{
		String p_ID = driver.findElement(By.xpath("//div[contains(@class,'container-fluid')]/h1")).getText();
		System.out.println(p_ID);  //Ex:Preview RR ID: 1000001085
		String[] preID=p_ID.split(":");
		String RR_ID=preID[1];
		String ID=RR_ID.replace(" ", "");
		return ID;
		
		
	}
	
	
	public void scrollSlider() throws Exception
	{
		String value=adriver.returnAttributeValue(sliderPoint,"aria-valuenow");
		String[] presentValue = new String[]{value};
		int evalValue = Integer.parseInt(presentValue[0]);	
		//System.out.println(evalValue);
		sliderPoint.click();
		for(int i = 0;i<evalValue;i++)
		{
			sliderPoint.sendKeys(Keys.ARROW_LEFT);
		}
	}
	
	

}
