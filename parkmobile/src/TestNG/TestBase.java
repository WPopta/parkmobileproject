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
	public static Properties TESTDATA=null;
	public static WebDriver dr = null;
	public static EventFiringWebDriver driver = null;
	
	public void initialize() throws IOException{
	if(driver==null){
		System.setProperty("webdriver.gecko.driver", "C:/eclipse/seleniumjars/geckodriver-v0.20.0-win64/geckodriver.exe");
		// initialize config file		
		String projectfolder = System.getProperty("user.dir");
		CONFIG = new Properties();
		FileInputStream fn = new FileInputStream(projectfolder+"\\src\\config\\config.properties");
		CONFIG.load(fn);
		OR = new Properties();
		fn = new FileInputStream(projectfolder+"\\src\\config\\OR.properties");
		OR.load(fn);
		TESTDATA = new Properties();
		fn = new FileInputStream(projectfolder+"\\src\\config\\testdata.properties");
		TESTDATA.load(fn);
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
			System.out.println("Element not found"+xpathval);
		}
		return null;
		
	}
	}
