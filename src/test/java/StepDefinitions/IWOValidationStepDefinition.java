package StepDefinitions;

import org.testng.Assert;

import com.edgenetowks.pages.CreateRR_OpportunityPage;
import com.edgenetowks.pages.IWOValidationPage;
import com.edgenetworks.helper.WaitHelper;
import com.edgenetworks.utilities.TestBase;

import cucumber.api.java.en.Then;


public class IWOValidationStepDefinition extends TestBase
{
	IWOValidationPage iwo = new IWOValidationPage(driver);
	CreateRR_OpportunityPage opportunityPage = new CreateRR_OpportunityPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	@Then("^User navigates to iwo page\\.$")
	public void user_navigates_to_iwo_page() throws Throwable {
	   iwo.launchIwo();
	   Thread.sleep(3000);
	}

	@Then("^Validate the Filters present on iwo page \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void validate_the_Filters_present_on_iwo_page(String Cost_Center, String Experience_Lower, String Experience_Upper, String PayBand, String Practice, String RR_Type, String Visa_Type) throws Throwable {
	   
		Assert.assertEquals(Cost_Center, iwo.getMsgCostCenterText());
		Assert.assertEquals(Experience_Lower, iwo.getMsgExperienceLowerText());
		Assert.assertEquals(Experience_Upper, iwo.getMsgExperienceUpperText());
		Assert.assertEquals(PayBand, iwo.getMsgPayBandText());
		Assert.assertEquals(Practice, iwo.getMsgPracticeText());
		Assert.assertEquals(RR_Type, iwo.getMsgRRTypeText());
		Assert.assertEquals(Visa_Type, iwo.getMsgVisaTypeText());
	}
	
	@Then("^Select any filter \"([^\"]*)\" ,\"([^\"]*)\" from drop down\\.$")
	public void select_any_filter_from_drop_down(String filterName, String FilterValue) throws Throwable {
		
	    iwo.clickFilterDropDown(filterName, FilterValue);
	}
	

	
	@Then("^Select the \"([^\"]*)\" from DropDown and validate that same status RR are appearing by clicking on More Details\\.$")
	public void select_the_from_DropDown_and_validate_that_same_status_RR_are_appearing_by_clicking_on_More_Details(String Status) throws Throwable {
		 iwo.selectValueDropDown(iwo.dropDownStatus, iwo.dropDownStatus, Status);
		   String ActStatus= iwo.getMsgStatusTypeText();
		   Assert.assertEquals(ActStatus, Status);
	}
	
	@Then("^Search for a particular \"([^\"]*)\" and validate whether the searched RR is present\\.$")
	public void search_for_a_particular_and_validate_whether_the_searched_RR_is_present(String rrNumber) throws Throwable {
		driver.navigate().refresh();
		Thread.sleep(3000);
		waitHelper.WaitForElementClickable(opportunityPage.waitOpportunities);
	    String value=iwo.searchRR(rrNumber);
	    Assert.assertEquals(value, rrNumber);
	}

}
