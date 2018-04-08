package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {
	
	//initializing the property file
	public static Properties CONFIG=null;
	public static Properties OR=null;
	public static Properties TESTDATA1=null;
	public static Properties TESTDATA2=null;
	public static Properties TESTDATA3=null;
	public static Properties TESTDATA4=null;
	public static Properties TESTDATA5=null;
	public static WebDriver dr = null;
	public static EventFiringWebDriver driver = null;
	
	public void initialize() throws IOException{
	if(driver==null){
		
		// initialize config file		
		String projectfolder = System.getProperty("user.dir");
	//	System.setProperty("webdriver.gecko.driver", "C:/eclipse/seleniumjars/geckodriver-v0.20.0-win64/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", projectfolder+"\\src\\geckodriver\\geckodriver.exe");
		CONFIG = new Properties();
		FileInputStream fn = new FileInputStream(projectfolder+"\\src\\config\\config.properties");
		CONFIG.load(fn);
		OR = new Properties();
		fn = new FileInputStream(projectfolder+"\\src\\config\\OR.properties");
		OR.load(fn);
		TESTDATA1 = new Properties();
		fn = new FileInputStream(projectfolder+"\\src\\config\\testdata1.properties");
		TESTDATA1.load(fn);
		TESTDATA2 = new Properties();
		fn = new FileInputStream(projectfolder+"\\src\\config\\testdata2.properties");
		TESTDATA2.load(fn);
		TESTDATA3 = new Properties();
		fn = new FileInputStream(projectfolder+"\\src\\config\\testdata3.properties");
		TESTDATA3.load(fn);
		// initialize the webdriver
		if(CONFIG.getProperty("browser").equals("Firefox")){
		dr = new FirefoxDriver();
		}
		
		driver = new EventFiringWebDriver(dr);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	}

	public static WebElement getObject(String xpathval){
		
		try{
		return driver.findElement(By.xpath(xpathval));
		}
		catch (Throwable t){
			System.out.println("Element not found by xpath: "+xpathval);
		}
		return null;
		
	}
	
	public static WebElement getObjectByName(String nameval){
		
		try{
		return driver.findElement(By.name(nameval));
		}
		catch (Throwable t){
			System.out.println("Element not found by name: "+nameval);
		}
		return null;
		
	}
	
	}
