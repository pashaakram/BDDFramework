package com.edgenetworks.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import enums.Browsers;
import enums.OS;


public class TestBase {

	public  static WebDriver driver;

public static Properties prop;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") +"/Resources/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public WebDriver selectBrowser(String browser) {
		if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOW.name().toLowerCase())) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/BrowserDrivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			
			} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/BrowserDrivers/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				
			}
		} else if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/BrowserDrivers/chromedriver");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				
			} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "/BrowserDrivers/geckodriver");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				
			}
		}
		return driver;
	}
	
	public static void launchBrowser(String url)
	{
		//String url = prop.getProperty("url");
		driver.get(url);
	}
	
	public static void tearDown()
	{
		driver.close();
	}
}
