package StepDefinitions;

import org.testng.Assert;

import com.edgenetowks.pages.DashBoardPage;
import com.edgenetowks.pages.LoginPageIWO;
import com.edgenetworks.utilities.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class USTLoginStepDefinition extends TestBase
{
	String url = prop.getProperty("url");
	LoginPageIWO lpage=new LoginPageIWO(driver);
	DashBoardPage dashBoardPage =new DashBoardPage(driver);

	@Given("^user launches portal$")
	public void user_launches_portal() throws Throwable {
		TestBase.launchBrowser(url);
	}

	@Given("^the landing page is displayed with brand name \"([^\"]*)\"$")
	public void the_landing_page_is_displayed_with_brand_name(String title) throws Throwable
	{
		Assert.assertEquals(lpage.verifytitle(), title);
	}

	@When("^user enters user name \"([^\"]*)\"$")
	public void user_enters_user_name(String UserName) throws Throwable 
	{
		lpage.enterUserName(UserName);   
	}

	@When("^user enters password \"([^\"]*)\"$")
	public void user_enters_password(String password) throws Throwable 
	{
		lpage.enterPassword(password);   
	}

	@When("^user clicks on sign in button$")
	public void user_clicks_on_sign_in_button() throws Throwable
	{
		lpage.clickLoginButton();   
	}

	@Then("^proper validation message \"([^\"]*)\" is displayed when \"([^\"]*)\"$")
	public void proper_validation_message_is_displayed_when(String validationMessage, String condition) throws Throwable 
	{
		switch (condition) {
		case "user field is empty":
			String userMsg=lpage.getMsgUser();
			boolean msg = userMsg.isEmpty();
			if(msg)
			{
				System.out.println("User Field is found empty");
			}
			else
			{
				System.out.println("User Field is found not empty");
			}
			//Assert.assertEquals(lpage.getMsgUserErrorText(), validationMessage);
			break;
		case "password field is empty":
			String pwdMsg=lpage.getMsgPassword();
			boolean pMsg = pwdMsg.isEmpty();
			if(pMsg)
			{
				System.out.println("Password Field is found empty");
			}
			else
			{
				System.out.println("Password Field is found not empty");
			}
			// Assert.assertEquals(lpage.getMsgPasswordErrorText(), validationMessage);
			break;
		case "Credentials entered wrong":
			Assert.assertEquals(lpage.getMsgLoginErrorText(), validationMessage);
			break;
		default:
			System.out.println("Please provide the parameters");
			break;
		} 
	}

	@Given("^user launches hire alchemy portal$")
	public void user_launches_hire_alchemy_portal() throws Throwable 
	{
		TestBase.launchBrowser(url);
	}

	@Then("^user is able to login successfully$")
	public void user_is_able_to_login_successfully() throws Throwable 
	{
		dashBoardPage.homeLogin();
	}

	@Then("^user is also able to see with his/her logged in name\"([^\"]*)\"$")
	public void user_is_also_able_to_see_with_his_her_logged_in_name(String logUserName) throws Throwable 
	{
		String userInitial=dashBoardPage.verifyhomeUser();
		Assert.assertEquals(userInitial, logUserName);
	}

	@Then("^user logs out$")
	public void user_logs_out() throws Throwable 
	{
		dashBoardPage.logoout();
	}

}
