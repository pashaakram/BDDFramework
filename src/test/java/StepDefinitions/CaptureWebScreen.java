package StepDefinitions;

import org.apache.log4j.Logger;

import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import com.edgenetowks.pages.DashBoardPage;
import com.edgenetworks.common.ActionDrivers;
import com.edgenetworks.common.GenericMethods;
import com.edgenetworks.helper.LoggerHelper;
import com.edgenetworks.utilities.TestBase;

import cucumber.api.java.en.Then;
public class CaptureWebScreen extends TestBase
{
	DashBoardPage dashBoardPage =new DashBoardPage(driver);
	GenericMethods GM = new GenericMethods();
	ActionDrivers adriver=new ActionDrivers();
	Logger logger = LoggerHelper.getLogger(CaptureWebScreen.class);
	@Then("^Click on create RR link on DashBoard and capture full web page ScreenShot\\.$")
	public void click_on_create_RR_link_on_DashBoard_and_capture_full_web_page_ScreenShot() throws Throwable {
		adriver.buttonclick(dashBoardPage.createRR);
		Thread.sleep(2000);
		String homeScreen="DashBoard";
		adriver.fullScreenShot(driver, ScrollStrategy.BOTH_DIRECTIONS, homeScreen);
	}

	@Then("^Click on Approve RR link on DashBoard and capture full web page ScreenShot\\.$")
	public void click_on_Approve_RR_link_on_DashBoard_and_capture_full_web_page_ScreenShot() throws Throwable {
		
		adriver.buttonclick(dashBoardPage.approveRR);
		Thread.sleep(2000);
		String approveScreen="ApproveRR";
		adriver.fullScreenShot(driver, ScrollStrategy.BOTH_DIRECTIONS, approveScreen);
	   
	}
	
	
	@Then("^Click on create RR link on DashBoard and Validate full web page ScreenShot\\.$")
	public void click_on_create_RR_link_on_DashBoard_and_Validate_full_web_page_ScreenShot() throws Throwable {
		adriver.buttonclick(dashBoardPage.createRR);
		Thread.sleep(2000);
		String homeScreen="DashBoard.png";
		String actualDashBoard="ActualDashBoard";
		adriver.compareImage(driver,homeScreen, ScrollStrategy.BOTH_DIRECTIONS,actualDashBoard);
		logger.info("Previously captured DashBoard is same as the run time DashBoard image");
		
	}

	@Then("^Click on Approve RR link on DashBoard and Validate full web page ScreenShot\\.$")
	public void click_on_Approve_RR_link_on_DashBoard_and_Validate_full_web_page_ScreenShot() throws Throwable {
		adriver.buttonclick(dashBoardPage.approveRR);
		Thread.sleep(2000);
		String approveScreen="ApproveRR.png";
		String actualScreen="ActualApproveRR";
		adriver.compareImage(driver,approveScreen, ScrollStrategy.BOTH_DIRECTIONS,actualScreen);
		logger.info("Previously captured ApproveRR page is same as the run time ApproveRR page image");
	}
}
