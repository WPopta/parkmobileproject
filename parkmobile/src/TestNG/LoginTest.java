package TestNG;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import TestNG.TestBase;

public class LoginTest extends TestBase {
	

	@Test
	public void login() throws IOException, InterruptedException{
		
		initialize();
		driver.get(CONFIG.getProperty("testSiteName"));
		getObject(OR.getProperty("SignupButton")).click();
		getObject(OR.getProperty("CountrySelector")).click();
		getObject(OR.getProperty("CountrySelectorInput")).sendKeys(TESTDATA.getProperty("Country"));
		getObject(OR.getProperty("ChooseButton1")).click();
		// getObject(OR.getProperty("PersonalButton")).click();
		getObject(OR.getProperty("FirstNameField")).sendKeys(TESTDATA.getProperty("FirstName"));		
		getObject(OR.getProperty("LastNameField")).sendKeys(TESTDATA.getProperty("LastName"));
		getObject(OR.getProperty("EmailField")).sendKeys(TESTDATA.getProperty("Email"));
		getObject(OR.getProperty("PasswordField")).sendKeys(TESTDATA.getProperty("Password"));
		getObject(OR.getProperty("PasswordConfirmField")).sendKeys(TESTDATA.getProperty("Password"));
		getObject(OR.getProperty("MobileTelCountrySelector")).click();	
		getObject(OR.getProperty("MobileTelCountrySelectorInput")).sendKeys(TESTDATA.getProperty("MobileTelCountry"));	
		getObject(OR.getProperty("MobileTelCountrySelectorInput")).sendKeys(Keys.RETURN);	
		getObject(OR.getProperty("MobileTelField")).sendKeys(TESTDATA.getProperty("MobileTel"));	
		getObject(OR.getProperty("LicensePlateCountrySelector")).click();	
		getObject(OR.getProperty("LicensePlateCountrySelectorInput")).sendKeys(TESTDATA.getProperty("LicensePlateCountry"));	
		getObject(OR.getProperty("LicensePlateCountrySelectorInput")).sendKeys(Keys.RETURN);
		getObject(OR.getProperty("LicensePlateField")).sendKeys(TESTDATA.getProperty("LicensePlate"));
		getObject(OR.getProperty("CreditCardButton")).click();
		getObject(OR.getProperty("EnterCCDetails")).click();	
		
		
		Thread.sleep(5000);
		// driver.quit();
	}
	
	

}
