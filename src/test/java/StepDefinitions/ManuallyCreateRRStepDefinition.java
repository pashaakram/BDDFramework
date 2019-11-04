package StepDefinitions;

import com.edgenetowks.pages.CreateRR_OpportunityPage;
import com.edgenetowks.pages.ManuallyCreateRR;
import com.edgenetworks.common.ActionDrivers;
import com.edgenetworks.utilities.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManuallyCreateRRStepDefinition extends TestBase
{
	ManuallyCreateRR MC =new ManuallyCreateRR(driver);
	ActionDrivers adriver=new ActionDrivers();
	CreateRR_OpportunityPage opportunityPage = new CreateRR_OpportunityPage(driver);
	@When("^User clicks on Create RR link and select Manually create billable RR option\\.$")
	public void user_clicks_on_Create_RR_link_and_select_Manually_create_billable_RR_option() throws Throwable 
	{
		adriver.buttonclick(opportunityPage.createRR);
		Thread.sleep(1000);
		adriver.buttonclick(MC.manualCreateRR_form);
		
	}

	@Then("^Enter Opportunity and Project details page should appear and enter a \"([^\"]*)\" code for which a demand to be created\\.$")
	public void enter_Opportunity_and_Project_details_page_should_appear_and_enter_a_code_for_which_a_demand_to_be_created(String oppName) throws Throwable {
	    MC.enterOpportunity(oppName);
	}

}
