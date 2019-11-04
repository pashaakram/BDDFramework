package com.edgenetowks.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edgenetworks.common.ActionDrivers;
import com.edgenetworks.helper.LoggerHelper;
import com.edgenetworks.helper.WaitHelper;
import com.edgenetworks.utilities.TestBase;

public class LoginPageIWO extends TestBase
{
	WaitHelper waitHelper;
	ActionDrivers adriver=new ActionDrivers();
	Logger logger = LoggerHelper.getLogger(LoginPageIWO.class);
	
	@FindBy(name="username")
	public WebElement userName;

	@FindBy(name="password")
	public WebElement password;

	@FindBy(xpath="//input[@value='Sign in']")
	public WebElement signButton;
	
	@FindBy(xpath="//input[@value='Sign In']")
	public WebElement signButtonTA;

	@FindBy(xpath="//h1/a[text()='HIREalchemy']")
	public WebElement title;
	
	@FindBy(xpath="//label[@for='username']/span[@class='help is-danger']")
	public WebElement userErr;
	
	@FindBy(xpath="//label[@for='password']/span[@class='help is-danger']")
	public WebElement passwordErr;
	
	@FindBy(xpath="//div[@role='alert']/span[contains(text(),'wrong')]")
	public WebElement loginErr;

	
	public LoginPageIWO(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}

	public String getURL() throws Exception
	{
		return adriver.returnURL(driver);
	}

	public String verifytitle() throws Exception
	{
		return adriver.returnText(title);
	}


	public void enterUserName(String uName) throws Exception
	{
		adriver.type(userName,uName);
	}

	public void enterPassword(String pwd) throws Exception
	{
		adriver.type(password,pwd);	
	}

	public void clickLoginButton()throws Exception
	{
		adriver.buttonclick(signButton);
		Thread.sleep(2000);
	}
	
	public String getMsgUserErrorText() throws Exception
	{
		adriver.buttonclick(password);
		return adriver.returnText(userErr);
	}
	
	public String getMsgPasswordErrorText() throws Exception
	{
		adriver.buttonclick(userName);
		return adriver.returnText(passwordErr);
	}
	
	public String getMsgLoginErrorText() throws Exception
	{
		return adriver.returnText(loginErr);
	}
	
	public String getMsgUser() throws Exception
	{
		return adriver.returnText(userName);
	}
	
	public String getMsgPassword() throws Exception
	{
		return adriver.returnText(password);
	}

}
