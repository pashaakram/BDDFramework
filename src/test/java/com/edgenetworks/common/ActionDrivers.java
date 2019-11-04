package com.edgenetworks.common;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

public class ActionDrivers 
{
	public void buttonclick(WebElement element)
	{
		element.click();
	}
	public void type(WebElement element,String value) throws Exception
	{
		element.clear();
		Thread.sleep(1000);
		element.sendKeys(value);
	}
	public String returnText(WebElement element) throws Exception
	{
		return element.getText();
		
	}
	public String returnURL(WebDriver driver) throws Exception
	{
		return driver.getCurrentUrl();
		
	}
	
	public String returnAttributeValue(WebElement element,String attributeName) throws Exception
	{
		return element.getAttribute(attributeName);
		
	}
	
	public void selectValue(WebElement element,String value)
	{
		Select dropElement = new Select(element);
		dropElement.selectByVisibleText(value);
	}
	
	public  void rightClick(WebDriver driver, WebElement element)
	{
		Actions actions = new Actions(driver);
		WebElement elementLocator = element;
		actions.contextClick(elementLocator).perform();
		
	}

	public  void doubleClick(WebDriver driver,WebElement element)
	{
		Actions actions = new Actions(driver);
		WebElement elementLocator = element;
		actions.doubleClick(elementLocator).perform();
		
	}
	
	public void scrollDown(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
	// Capture full web page screenshot image
	public void fullScreenShot(WebDriver driver,ScrollStrategy scroll,String fileName) throws Exception
	{
		Shutterbug.shootPage(driver, scroll,500,true).withName(fileName).save();
		Thread.sleep(3000);
	}
	
	//Compare image 
	public void compareImage(WebDriver driver,String savedFileName,ScrollStrategy scroll,String actualFileName) throws Exception
	{
		File image = new File(System.getProperty("user.dir") +"/screenshots/"+savedFileName);
		BufferedImage expectedImage = ImageIO.read(image);
		boolean status=Shutterbug.shootPage(driver, scroll,500,true).withName(actualFileName).equals(expectedImage,0.1);
		Thread.sleep(3000);
		Assert.assertTrue(status);
	}
	
	public boolean checkIsExist(WebElement element)
	{
		return element.isDisplayed();
	}
	
	
}
