package StepDefinitions;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.edgenetowks.pages.AllRR_Page;
import com.edgenetowks.pages.DashBoardPage;
import com.edgenetowks.pages.ProjectValidationPage;
import com.edgenetworks.common.GenericMethods;
import com.edgenetworks.helper.LoggerHelper;
import com.edgenetworks.utilities.TestBase;

import cucumber.api.java.en.Then;

public class ProjectCountValidationStepDefinition extends TestBase
{
	AllRR_Page allPage =new AllRR_Page(driver);
	DashBoardPage dashBoardPage =new DashBoardPage(driver);
	GenericMethods GM = new GenericMethods();
	Logger logger = LoggerHelper.getLogger(ProjectCountValidationStepDefinition.class);
	ProjectValidationPage projectValidation = new ProjectValidationPage(driver);
	
	@Then("^Click on Projects link in the DashBoard\\.$")
	public void click_on_Projects_link_in_the_DashBoard() throws Throwable {
		dashBoardPage.clickProject();
	}

	@Then("^Select the Specific \"([^\"]*)\" and click on view RRs\\.$")
	public void select_the_Specific_and_click_on_view_RRs(String projectName) throws Throwable {
		projectValidation.selectProject(projectName);
		
	}

	@Then("^Validate the number of \"([^\"]*)\" listed in the table is equal to the count displaying on top\\.$")
	public void validate_the_number_of_projects_listed_in_the_table_is_equal_to_the_count_displaying_on_top(String projectName) throws Throwable {
		
		//String projectValue=allPage.getMsgProjectSelectValueText();
		//Assert.assertEquals(projectName, projectValue);
		
		int tableCount=GM.tableCountRetrieve();
		String countValue=allPage.getMsgValidteValueText();
		String[] splitCount = countValue.split(" ");
		int count = Integer.parseInt(splitCount[0]);	
		Assert.assertEquals(count, tableCount);
		
	    
	}


}
