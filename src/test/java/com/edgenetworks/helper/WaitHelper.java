package com.edgenetworks.helper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Akram Pasha
 */
public class WaitHelper {

	Logger logger = LoggerHelper.getLogger(WaitHelper.class);
	
	private WebDriver driver;
	private long timeOutInSeconds=80;
	
	public WaitHelper(WebDriver driver){
		this.driver = driver;
	}
	
	public void WaitForElementVisible(WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void WaitForElementClickable(WebElement element){
		//logger.info("waiting for element Clickable..");
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		//logger.info("element is Clickable..");
	}
	
}
