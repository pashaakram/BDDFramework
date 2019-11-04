package StepDefinitions;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.edgenetowks.pages.AllRR_Page;
import com.edgenetowks.pages.DashBoardPage;
import com.edgenetworks.common.GenericMethods;
import com.edgenetworks.helper.LoggerHelper;
import com.edgenetworks.utilities.TestBase;

import cucumber.api.java.en.Then;


public class All_RR_Validation  extends TestBase
{
	AllRR_Page allPage =new AllRR_Page(driver);
	DashBoardPage dashBoardPage =new DashBoardPage(driver);
	GenericMethods GM = new GenericMethods();
	Logger logger = LoggerHelper.getLogger(CreateRR_SFDCStepDefinition.class);
	
	@Then("^Click on All RRs option in dashboard\\.$")
	public void click_on_All_RRs_option_in_dashboard() throws Throwable {
		
		dashBoardPage.clickALLRR();
		driver.navigate().refresh();
		Thread.sleep(3000);
	}

	@Then("^Select \"([^\"]*)\" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner\\.$")
	public void select_from_the_drop_down_and_validate_the_number_of_value_appeared_in_the_table_is_equal_to_the_value_that_display_on_the_top_left_of_the_corner(String option) throws Throwable {
		allPage.selectValueDropDown(allPage.dropDown, allPage.dropDownInput, option);
		Thread.sleep(5000);
		int value=GM.retriveTableCount(option);
		String countValue=allPage.getMsgValidteValueText();
		String[] splitCount = countValue.split(" ");
		int count = Integer.parseInt(splitCount[0]);	
		Assert.assertEquals(count, value);
		
	}
	
	/*@Then("^Select projects \"([^\"]*)\" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner\\.$")
	public void select_projects_from_the_drop_down_and_validate_the_number_of_value_appeared_in_the_table_is_equal_to_the_value_that_display_on_the_top_left_of_the_corner(String dropDownOption) throws Throwable {
		allPage.selectValueDropDown(allPage.dropDownProject, allPage.dropDownProject, dropDownOption);
		Thread.sleep(3000);
		int value=GM.retriveTableCount(dropDownOption);
		String countValue=allPage.getMsgValidteValueText();
		String[] splitCount = countValue.split(" ");
		int count = Integer.parseInt(splitCount[0]);	
		Assert.assertEquals(count, value);
	}*/
	
	
	/*@Then("^Select \"([^\"]*)\" projects \"([^\"]*)\" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner\\.$")
	public void select_projects_from_the_drop_down_and_validate_the_number_of_value_appeared_in_the_table_is_equal_to_the_value_that_display_on_the_top_left_of_the_corner(String option, String dropDownOption) throws Throwable {
		allPage.selectValueDropDown(allPage.dropDown, allPage.dropDownInput, option);
		allPage.selectValueDropDown(allPage.dropDownProject, allPage.dropDownProject, dropDownOption);
		Thread.sleep(3000);
		int value=GM.retriveTableCount(option);
		String countValue=allPage.getMsgValidteValueText();
		String[] splitCount = countValue.split(" ");
		int count = Integer.parseInt(splitCount[0]);	
		Assert.assertEquals(count, value);
		
	}
	*/
	@Then("^Select RR Status \"([^\"]*)\" from the drop down\\.$")
	public void select_RR_Status_from_the_drop_down(String option) throws Throwable {
		allPage.selectValueDropDown(allPage.dropDown, allPage.dropDownInput, option);
		
	}

	@Then("^Select \"([^\"]*)\" projects \"([^\"]*)\" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner\\.$")
	public void select_projects_from_the_drop_down_and_validate_the_number_of_value_appeared_in_the_table_is_equal_to_the_value_that_display_on_the_top_left_of_the_corner(String option,String dropDownOption) throws Throwable {
		allPage.selectValueDropDown(allPage.dropDown, allPage.dropDownInput, option);
		Thread.sleep(4000);
		allPage.selectValueDropDown(allPage.dropDownProject, allPage.dropDownProject, dropDownOption);
		//driver.navigate().refresh();
		Thread.sleep(4000);
		int value=GM.retriveTableCount(option);
		String countValue=allPage.getMsgValidteValueText();
		String[] splitCount = countValue.split(" ");
		int count = Integer.parseInt(splitCount[0]);
		//System.out.println(count);
		Assert.assertEquals(count, value);
		allPage.validateProjectName(dropDownOption,count);
		dashBoardPage.clickALLRR();
		
	}
	
	@Then("^Select \"([^\"]*)\" projects \"([^\"]*)\" and \"([^\"]*)\" from the drop down and validate the number of value appeared in the table is equal to the value that display on the top left of the corner\\.$")
	public void select_projects_and_from_the_drop_down_and_validate_the_number_of_value_appeared_in_the_table_is_equal_to_the_value_that_display_on_the_top_left_of_the_corner(String option,String dropDownOption, String account) throws Throwable {
		allPage.selectValueDropDown(allPage.dropDown, allPage.dropDownInput, option);
		Thread.sleep(2000);
		allPage.selectValueDropDown(allPage.dropDownProject, allPage.dropDownProject, dropDownOption);
		Thread.sleep(2000);
		allPage.selectValueDropDown(allPage.dropDownAccount, allPage.dropDownAccount, account); 
		int value=GM.retriveTableCount(option);
		String countValue=allPage.getMsgValidteValueText();
		String[] splitCount = countValue.split(" ");
		int count = Integer.parseInt(splitCount[0]);
		Assert.assertEquals(count, value);
		allPage.validateProject_Account(dropDownOption,count,account);
	}

}
