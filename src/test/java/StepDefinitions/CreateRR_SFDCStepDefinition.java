package StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.assertj.core.util.Maps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.edgenetowks.pages.AllRR_Page;
import com.edgenetowks.pages.CreateRR_OpportunityPage;
import com.edgenetowks.pages.CreateRR_PreviewPage;
import com.edgenetowks.pages.DashBoardPage;
import com.edgenetowks.pages.LoginPageIWO;
import com.edgenetowks.pages.OriginRMPage;
import com.edgenetworks.common.ActionDrivers;
import com.edgenetworks.common.GenericMethods;
import com.edgenetworks.helper.LoggerHelper;
import com.edgenetworks.helper.WaitHelper;
import com.edgenetworks.utilities.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateRR_SFDCStepDefinition extends TestBase
{
	String url = prop.getProperty("url");
	String uName=prop.getProperty("UserName");
	String pwd=prop.getProperty("password");
	CreateRR_OpportunityPage opportunityPage = new CreateRR_OpportunityPage(driver);
	GenericMethods GM = new GenericMethods();
	ActionDrivers adriver=new ActionDrivers();
	LoginPageIWO lpage =new LoginPageIWO(driver);
	DashBoardPage dashBoardPage =new DashBoardPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	CreateRR_PreviewPage previewPage = new CreateRR_PreviewPage(driver);
	AllRR_Page allPage =new AllRR_Page(driver);
	OriginRMPage oPage = new OriginRMPage(driver);
	Logger logger = LoggerHelper.getLogger(CreateRR_SFDCStepDefinition.class);

	public String RR_ID;
	public String rStatus;
	public String submitStatus;
	@Given("^User should navigate to Opportunities page\\.$")
	public void user_should_navigate_to_Opportunities_page() throws Throwable 
	{
		TestBase.launchBrowser(url);
		GM.login(driver,dashBoardPage.createRR, lpage.userName, uName, lpage.password, pwd, lpage.signButton);
		Thread.sleep(4000);
		opportunityPage.navigate_to_opportunityPage();
	}

	@Then("^check the count of Opportunities displayed is equal to opportunity in table\\.$")
	public void check_the_count_of_Opportunities_displayed_is_equal_to_opportunity_in_table() throws Throwable 
	{
		String countopp=opportunityPage.verifyOpportunitiesCount();
		String[] sliptOppCount=countopp.split(" ");
		System.out.println("Count of opportunity : "+sliptOppCount[0]);
		int rowCount=GM.readTableValues();
		int actualRowCount = Integer.parseInt(sliptOppCount[0]);	
		Assert.assertEquals(actualRowCount,rowCount);

	}

	@Then("^Search for the specific opportunity and click on create RR\\.$")
	public void search_for_the_specific_opportunity_and_click_on_create_RR(DataTable opportunity) throws Throwable 
	{
		List<List<String>> data = opportunity.raw();
		String data1 = data.get(0).get(0);
		opportunityPage.createSpecificJob(data1);
		Thread.sleep(5000);


	}


	@Then("^Select the RR Initiator and directly click on next button \\.$")
	public void select_the_RR_Initiator_and_directly_click_on_next_button(DataTable initiator) throws Throwable
	{
		List<List<String>> data = initiator.raw();
		String data1 = data.get(0).get(0);
		By initiatorLocator = By.xpath("//label[text()='RR Initiator']/../ul[contains(@class,'dropdown-menu')]/li/a/span[text()='"+data1+"']");
		adriver.type(opportunityPage.initiatorType, data1);
		//select RRInitiator value
		Thread.sleep(1000);
		driver.findElement(initiatorLocator).click();
		opportunityPage.clickNextButton();


	}

	@Then("^Without going to next page validateMessage message should be displayed where condition \\.$")
	public void without_going_to_next_page_message_should_be_displayed_where() throws Throwable 
	{

		Thread.sleep(3000);
		waitHelper.WaitForElementClickable(opportunityPage.errPrimary);
		Assert.assertEquals(opportunityPage.getMsgPrimaryErrorText(), "The primary grm field is required");

		Assert.assertEquals(opportunityPage.getMsgEngagementErrorText(), "The engagement type field is required");

		Assert.assertEquals(opportunityPage.getMsgProjectErrorText(), "The project name field is required");

		Assert.assertEquals(opportunityPage.getMsgSoTypeErrorText(), "The so type field is required");

	}

	@Then("^Select the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\",\"([^\"]*)\" from drop down's and click next\\.$")
	public void select_the_and_from_drop_down_s_and_click_next(String RRInitiator, String Primary_RM, String engagement_Type, String projectName, String SO_Type,String empid) throws Throwable
	{
		opportunityPage.opportunityDetails(RRInitiator, Primary_RM, engagement_Type, projectName, SO_Type,empid);	

		opportunityPage.clickNextButton();
	}


	@Then("^The to select the range page should display and select the \"([^\"]*)\" and \"([^\"]*)\" date from the calendar\\.$")
	public void the_to_select_the_range_page_should_display_and_select_the_and_date_from_the_calendar(String From, String To) throws Throwable {
		Thread.sleep(2000);
		waitHelper.WaitForElementClickable(opportunityPage.waitDatePicker);
		opportunityPage.setDateFrom(From);
		opportunityPage.setDateTo(To);


	}

	@Then("^Select whether the extension should be \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"\\.$")
	public void select_whether_the_extension_should_be_and(String option, String duration, String durationNumber) throws Throwable {
		opportunityPage.selectExtension(option,duration,durationNumber);
		opportunityPage.clickNextButton();
		/*Thread.sleep(5000);
		opportunityPage.userChangeTheExperienceBar(50,60);
		opportunityPage.userChangeTheExperienceBar(1,15);*/
	}

	/*@Then("^User enters the Resource Requirement details and click on next button\\.$")
	public void user_enters_the_Resource_Requirement_details_and_click_on_next_button(DataTable details) throws Throwable 
	{

		for(Map<String,String> data : details.asMaps(String.class, String.class))
		{
			opportunityPage.enterRoleDetails(data.get("ResourceNumber"), data.get("Designation"), data.get("Primary Skill"), data.get("Secondary Skill"), data.get("Grade"));
		}


	}*/

	@Then("^User enters the Resource Requirement details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" click on next button\\.$")
	public void user_enters_the_Resource_Requirement_details_and_click_on_next_button(String ResourceNumber, String Designation, String Primary_Skill, String Secondary_Skill, String Grade) throws Throwable {
	   
		opportunityPage.enterRoleDetails(ResourceNumber,Designation,Primary_Skill,Secondary_Skill,Grade);
	}

	@Then("^Select the Range of experience and enter the Job Description and Internal Description\\.$")
	public void select_the_Range_of_experience_and_enter_the_Job_Description_and_Internal_Description() throws Throwable {

		Thread.sleep(5000);
		opportunityPage.userChangeTheExperienceBar(30,32);
		opportunityPage.userChangeTheExperienceBar(10,20);
		opportunityPage.enterjobDescription();
		opportunityPage.enterInternalJobDetails();
	}

	@Then("^Select the \"([^\"]*)\" and click next\\.$")
	public void select_the_and_click_next(String location) throws Throwable {

		opportunityPage.selectLocation(location);
		Thread.sleep(2000);
		opportunityPage.clickNextButton();
	}

	@Then("^Job Details page should appear and select the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\",\"([^\"]*)\" appropriate options and click on preview button\\.$")
	public void job_Details_page_should_appear_and_select_the_and_appropriate_options_and_click_on_preview_button(String internalInterview, String hiringManager, String deliveryManager, String interviewer, String clientInterview, String mode_Of_Interview, String client_accepted_Resource, String BGV) throws Throwable {
		waitHelper.WaitForElementVisible(opportunityPage.waitJobDetailsPage);
		opportunityPage.internalInterview(internalInterview, hiringManager, deliveryManager, interviewer);
		opportunityPage.clientInterview(clientInterview, mode_Of_Interview);
		opportunityPage.enterAccepetedResource(client_accepted_Resource);
		opportunityPage.bgvExist(BGV);


	}

	@Then("^User waits for analysis result to appear and choose option\\.$")
	public void user_waits_for_analysis_result_to_appear_and_choose_option() throws Throwable {
		Thread.sleep(2000);
		opportunityPage.chooseButtonClick();
	}


	@Then("^Once preview page opens validate the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"\\.$")
	public void once_preview_page_opens_validate_the_and(String RR_Initiator,String sso_type, String Primary_RM, String Engagement_Type, String Project_Name, String Location, String Internal_Interview, String Hiring_Manager, String Interviewer, String Client_Interview, String Mode_Of_Interview, String Client_Accepted_Resource, String BGV) throws Throwable {


		Thread.sleep(2000);		
		Assert.assertEquals(previewPage.getMsgRRinitatorText(), RR_Initiator);
		Assert.assertEquals(previewPage.getMsgPrimaryText(), Primary_RM);
		Assert.assertEquals(previewPage.getMsgETypeText(), Engagement_Type);
		Assert.assertEquals(previewPage.getMsgPNameText(), Project_Name);
		Assert.assertEquals(previewPage.getMsgRequestText(), sso_type);
		Assert.assertEquals(previewPage.getMsgworkLocationText(), Location);
		Assert.assertEquals(previewPage.getMsgInternalText(), Internal_Interview);
		//Assert.assertEquals(previewPage.getMsgHiringManagerText(), Hiring_Manager);
		//Assert.assertEquals(previewPage.getMsgInterviewerText(), Interviewer);
		Assert.assertEquals(previewPage.getMsgCInterviewText(), Client_Interview);
		//Assert.assertEquals(previewPage.getMsgModeInterviewText(), Mode_Of_Interview);
		Assert.assertEquals(previewPage.getMsgClientAcceptText(), Client_Accepted_Resource);
		//Assert.assertEquals(previewPage.getMsgBGVText(), BGV);
		RR_ID=opportunityPage.getPreviewID();

		/*Assert.assertEquals(previewPage.getMsgAvailableBenchText(), previewPage.getMsgAvailableBenchAnalysisText());
		Assert.assertEquals(previewPage.getMsgNext30_90Text(), previewPage.getMsgNext30_90AnalysisText());
		Assert.assertEquals(previewPage.getMsgAssignedBenchText(), previewPage.getMsgAssignedBenchAnalysisText());*/

	}

	@Then("^User click on All RR option\\.$")
	public void user_click_on_All_RR_option() throws Throwable 
	{
		dashBoardPage.clickALLRR();
		driver.navigate().refresh();
		//Thread.sleep(5000);
	}

	@Then("^Check RR_id whether it exist in table,if so check the status it should be in Created status\\.$")
	public void check_RR_id_whether_it_exist_in_table_if_so_check_the_status_it_should_be_in_Created_status() throws Throwable 
	{
		GM.readRowValue(RR_ID);
		Thread.sleep(2000);

	}

	@Then("^If the Status is in Created then Click on respective View button for approval\\.$")
	public void if_the_Status_is_in_Created_then_Click_on_respective_View_button_for_approval() throws Throwable {
		allPage.clickViewButton(RR_ID);
		allPage.scrollPageApprove();
		Thread.sleep(2000);

	}

	@Then("^Check the particular RR is changed to \"([^\"]*)\"\\.$")
	public void check_the_particular_RR_is_changed_to(String submitResurceApprove) throws Throwable {
		// RR_ID=opportunityPage.getPreviewID();
		submitStatus=allPage.getStatus(RR_ID);
		Assert.assertEquals(submitStatus, submitResurceApprove);
		logger.info("Status is as expected");
		allPage.clickViewButton(RR_ID);

	}

	@Then("^click on the respective RR View button for \"([^\"]*)\" Approval\\.$")
	public void click_on_the_respective_RR_View_button_for_force_Approval(String approve) throws Throwable {
		allPage.scrollPageForceApprove(approve);
		Thread.sleep(2000);
	}

	@Then("^check the status of the RR is changed to \"([^\"]*)\"\\.$")
	public void check_the_status_of_the_RR_is_changed(String status) throws Throwable 
	{
		// RR_ID=opportunityPage.getPreviewID();
		rStatus=allPage.getStatus(RR_ID);
		Assert.assertEquals(rStatus, status);
		logger.info("Status is as expected");

	}

	@Then("^User navigates to originate RM page and search for RR_ID the specific demand should be seen\\.$")
	public void user_navigates_to_originate_RM_page_and_search_for_RR_ID_the_specific_demand_should_be_seen() throws Throwable
	{
		if(rStatus.equals("Rejected"))
		{
			logger.info("The Demand status was Rejected ignoring");
		}
		else
		{
			//String id="1000001106";
			GM.launchNewTab(oPage.iconDropDown, oPage.operateRMButton);
			GenericMethods.switchChildWindow();
			String childUrl=oPage.getChildURL(driver);
			String ExpectedChildUrl= prop.getProperty("ExpectedRRURL");
			Assert.assertEquals(childUrl, ExpectedChildUrl);
			oPage.searchDemandRM(RR_ID);
			//GenericMethods.switchParentWindow();
		}
	}
	

@Then("^Click on more details link and validate the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"\\.$")
public void click_on_more_details_link_and_validate_the_and(String Request_Type, String Engagement_Type, String Bill_percentage, String status) throws Throwable {
	if(rStatus.equals("Rejected"))
	{
		logger.info("The Demand status was Rejected ignoring");
	}
	else
	{
		oPage.clickMoreDeatils();
		Assert.assertEquals(oPage.getMsgRequestTypeText(), Request_Type);
		Assert.assertEquals(oPage.getMsgEngagementText(), Engagement_Type);
		Assert.assertEquals(oPage.getMsgBillablePercentageText(), Bill_percentage);
		Assert.assertEquals(oPage.getMsgStatusTypeText(), status);
	}
}

@Then("^User clicks on view supply button and search for a \"([^\"]*)\" supply \\.$")
public void user_clicks_on_view_supply_button_and_search_for_a_supply(String supplySearch) throws Throwable {
	if(rStatus.equals("Rejected"))
	{
		logger.info("The Demand status was Rejected ignoring");
	}
	else
	{
		oPage.clickViewSupply();
		oPage.searchSupplyAndClick(supplySearch);
	}
}

@Then("^Click on the External hire yes option and select all check box's appeared and click ok button'\\.$")
public void click_on_the_External_hire_yes_option_and_select_all_check_box_s_appeared_and_click_ok_button() throws Throwable {
	if(rStatus.equals("Rejected"))
	{
		logger.info("The Demand status was Rejected ignoring");
	}
	else
	{
		   oPage.clickExternalSource();
		   oPage.selectMultipleCheckBox();
		   Thread.sleep(3000);
		   adriver.buttonclick(allPage.secondOkButton);
		  // TestBase.tearDown();
		   Thread.sleep(3000);
		   GenericMethods.switchParentWindow();
		   //Thread.sleep(12000);
		   dashBoardPage.clickALLRR();
		   
	}
}

@Then("^Navigate to the Operate-TA page\\.$")
public void navigate_to_the_Operate_TA_page() throws Throwable {
   
	if(rStatus.equals("Rejected"))
	{
		logger.info("The Demand status was Rejected ignoring");
	}
	else
	{
		GM.launchNewTab(oPage.iconDropDown, oPage.operateTAButton);
		GenericMethods.switchThirdChildWindow();
		Thread.sleep(2000);
		waitHelper.WaitForElementClickable(lpage.userName);
	}
	
}


@Then("^User should login to TA page by providing \"([^\"]*)\" and \"([^\"]*)\" \\.$")
public void user_should_login_to_TA_page_by_providing_and(String UserName, String password) throws Throwable {
	
	if(rStatus.equals("Rejected"))
	{
		logger.info("The Demand status was Rejected ignoring");
	}
	else
	{
		//TestBase.launchBrowser(url);
		GM.login(driver,dashBoardPage.positionLink, lpage.userName, UserName, lpage.password, password, lpage.signButtonTA);
		Thread.sleep(4000);
	}
	
}

@Then("^User lands on Home Page search for the Project \"([^\"]*)\" and click on the Project\\.$")
public void user_lands_on_Home_Page_search_for_the_Project_and_click_on_the_Project(String projectName) throws Throwable {
	
	if(rStatus.equals("Rejected"))
	{
		logger.info("The Demand status was Rejected ignoring");
	}
	else
	{
		waitHelper.WaitForElementClickable(dashBoardPage.positionLink);
		dashBoardPage.clickPosition();
		//dashBoardPage.searchProject(projectName);
	}
	
	
	
    
}

@Then("^Search for the Demand created in DMS with the Preview ID\\.$")
public void search_for_the_Demand_created_in_DMS_with_the_Preview_ID() throws Throwable 
{
	if(rStatus.equals("Rejected"))
	{
		logger.info("The Demand status was Rejected ignoring");
	}
	else
	{
		//String RR_ID="1000001125";
		dashBoardPage.searchPosition(RR_ID);
		Thread.sleep(2000);
	}
	
}

@Then("^Validate whether the Demand is Available\\.$")
public void validate_whether_the_Demand_is_Available() throws Throwable {
	if(rStatus.equals("Rejected"))
	{
		logger.info("The Demand status was Rejected ignoring");
	}
	else
	{
		//String RR_ID="1000001125";
		WebElement element=driver.findElement(By.xpath("//h4[@class='position-name']/a[contains(text(),'"+RR_ID+"')]"));
		boolean status=GM.checkIsExist(element);
		if(status)
		{
			System.out.println("Specific value is present");
		}
		else
		{
			System.out.println("Specific value is not present");
			Assert.assertTrue(false);
		}
	}
	
	
	
    
}

/*@Then("^Click on the Demand and reduce the Score scroll$")
public void click_on_the_Demand_and_reduce_the_Score_scroll() throws Throwable 
{
	if(rStatus.equals("Rejected"))
	{
		logger.info("The Demand status was Rejected ignoring");
	}
	else
	{
		//String RR_ID="1000001125";
		WebElement element=driver.findElement(By.xpath("//h4[@class='position-name']/a[contains(text(),'"+RR_ID+"')]"));
		adriver.buttonclick(element);
		Thread.sleep(2000);
		opportunityPage.scrollSlider();
	}
	
	
}
*/







}
