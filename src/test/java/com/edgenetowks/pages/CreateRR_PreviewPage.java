package com.edgenetowks.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edgenetworks.common.ActionDrivers;
import com.edgenetworks.common.GenericMethods;
import com.edgenetworks.helper.LoggerHelper;
import com.edgenetworks.helper.WaitHelper;
import com.edgenetworks.utilities.TestBase;

public class CreateRR_PreviewPage extends TestBase
{
	WaitHelper waitHelper;
	ActionDrivers adriver=new ActionDrivers();
	GenericMethods GM = new GenericMethods();
	Logger logger = LoggerHelper.getLogger(CreateRR_OpportunityPage.class);

	@FindBy(xpath="//div[contains(@class,'container-fluid')]/h1")
	public WebElement previewID;
	
	@FindBy(xpath="//span[contains(text(),'RR Initiator')]/following-sibling::span")
	public WebElement RRInitator;
	
	@FindBy(xpath="//span[contains(text(),'Primary RM')]/following-sibling::span")
	public WebElement primaryRR;
	
	@FindBy(xpath="//span[contains(text(),'Project Name')]/following-sibling::span")
	public WebElement projectName;
	
	@FindBy(xpath="//span[contains(text(),'Engagement Type')]/following-sibling::span")
	public WebElement engagementType;
	
	@FindBy(xpath="//span[contains(text(),'Origination Name')]/following-sibling::span")
	public WebElement OriginationType;
	
	@FindBy(xpath="//span[contains(text(),'Request Type')]/following-sibling::span")
	public WebElement requestType;
	
	@FindBy(xpath="//span[contains(text(),'Internal Interview Required')]/following-sibling::span")
	public WebElement internalInterview;
	
	@FindBy(xpath="//span[contains(text(),'Designation')]/following-sibling::span")
	public WebElement designation;
	
	@FindBy(xpath="//span[contains(text(),'Client Interview Required')]/following-sibling::span")
	public WebElement clientInterview;
	
	@FindBy(xpath="//span[contains(text(),'Client Accepted')]/following-sibling::span")
	public WebElement clientAccepted;
	
	@FindBy(xpath="//span[text()='Available TCL']/preceding-sibling::h2")
	public WebElement availableBenchAnalysis;
	
	@FindBy(xpath="//span[text()='Next 60-90 Days']/preceding-sibling::h2")
	public WebElement next30_90Analysis;
	
	@FindBy(xpath="//span[text()='Assigned TCL']/preceding-sibling::h2")
	public WebElement assignedBenchAnalysis;
	
	@FindBy(xpath="//h5[text()='Available TCL']/preceding-sibling::h2")
	public WebElement availableBenchPreview;
	
	@FindBy(xpath="//h5[text()='Next 60-90 Days']/preceding-sibling::h2")
	public WebElement next30_90Preview;
	
	@FindBy(xpath="//h5[text()='Assigned TCL']/preceding-sibling::h2")
	public WebElement assignedBenchPreview;
	
	@FindBy(xpath="//span[contains(text(),'Work Location')]/following-sibling::span")
	public WebElement workLocation;
		
	@FindBy(xpath="//span[contains(text(),'Hiring Manager')]/following-sibling::span")
	public WebElement hiringManager;
	
	@FindBy(xpath="//span[contains(text(),'Interviewer')]/following-sibling::span")
	public WebElement interviewer;
	
	@FindBy(xpath="//span[contains(text(),'Mode of Interview')]/following-sibling::span")
	public WebElement modeInterview;
	
	@FindBy(xpath="//span[contains(text(),'BGV')]/following-sibling::span")
	public WebElement bgvRequired;
	
	public String getMsgHiringManagerText() throws Exception {return adriver.returnText(hiringManager);}
	public String getMsgInterviewerText() throws Exception {return adriver.returnText(interviewer);}
	public String getMsgModeInterviewText() throws Exception {return adriver.returnText(modeInterview);}
	public String getMsgBGVText() throws Exception {return adriver.returnText(bgvRequired);}
	public String getMsgOriginationTypeText() throws Exception {return adriver.returnText(OriginationType);}
	public String getMsgpreviewIDsText() throws Exception {return adriver.returnText(previewID);}
	public String getMsgRRinitatorText() throws Exception {return adriver.returnText(RRInitator);}
	public String getMsgPrimaryText() throws Exception {return adriver.returnText(primaryRR);}
	public String getMsgPNameText() throws Exception {return adriver.returnText(projectName);}
	public String getMsgETypeText() throws Exception {return adriver.returnText(engagementType);}
	public String getMsgRequestText() throws Exception {return adriver.returnText(requestType);}
	public String getMsgInternalText() throws Exception {return adriver.returnText(internalInterview);}
	public String getMsgDesignationText() throws Exception {return adriver.returnText(designation);}
	public String getMsgCInterviewText() throws Exception {return adriver.returnText(clientInterview);}
	public String getMsgClientAcceptText() throws Exception {return adriver.returnText(clientAccepted);}
	public String getMsgAvailableBenchText() throws Exception {return adriver.returnText(availableBenchPreview);}
	public String getMsgNext30_90Text() throws Exception {return adriver.returnText(next30_90Preview);}
	public String getMsgAssignedBenchText() throws Exception {return adriver.returnText(assignedBenchPreview);}
	public String getMsgAvailableBenchAnalysisText() throws Exception {return adriver.returnText(availableBenchAnalysis);}
	public String getMsgNext30_90AnalysisText() throws Exception {return adriver.returnText(next30_90Analysis);}
	public String getMsgAssignedBenchAnalysisText() throws Exception {return adriver.returnText(assignedBenchAnalysis);}
	public String getMsgworkLocationText() throws Exception {return adriver.returnText(workLocation);}
	
	
	
	public CreateRR_PreviewPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
}
