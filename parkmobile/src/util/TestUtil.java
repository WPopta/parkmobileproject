package util;


import org.openqa.selenium.Keys;

import TestNG.TestBase;

public class TestUtil extends TestBase{

	public static void runTest1() throws InterruptedException{
		//Start screen
		getObject(OR.getProperty("SignupButton")).click();		
		// Selection screen
		getObject(OR.getProperty("CountrySelector")).click();
		getObject(OR.getProperty("CountrySelectorInput")).sendKeys(TESTDATA1.getProperty("Country"));
		getObject(OR.getProperty("CountrySelectorInput")).sendKeys(Keys.RETURN);
		getObject(OR.getProperty("ChooseButton1")).click();

		// Registration form
		getObjectByName("firstName").sendKeys(TESTDATA1.getProperty("FirstName"));		
		getObjectByName("lastName").sendKeys(TESTDATA1.getProperty("LastName"));
		getObjectByName("email").sendKeys(TESTDATA1.getProperty("Email"));
		getObjectByName("password").sendKeys(TESTDATA1.getProperty("Password"));
		getObjectByName("confirmPassword").sendKeys(TESTDATA1.getProperty("Password"));
		getObject(OR.getProperty("MobileTelCountrySelector")).click();	
		getObject(OR.getProperty("MobileTelCountrySelectorInput")).sendKeys(TESTDATA1.getProperty("MobileTelCountry"));	
		getObject(OR.getProperty("MobileTelCountrySelectorInput")).sendKeys(Keys.RETURN);	
		getObjectByName("mobileNumber").sendKeys(TESTDATA1.getProperty("MobileTel"));
		getObject(OR.getProperty("LicensePlateCountrySelector")).click();	
		getObject(OR.getProperty("LicensePlateCountrySelectorInput")).sendKeys(TESTDATA1.getProperty("LicensePlateCountry"));	
		getObject(OR.getProperty("LicensePlateCountrySelectorInput")).sendKeys(Keys.RETURN);
		getObjectByName("vrn1").sendKeys(TESTDATA1.getProperty("LicensePlate"));
		getObject(OR.getProperty("CreditCardButton3")).click();
		getObject(OR.getProperty("EnterCCDetails")).click();
	}
	
	public static void runTest2() throws InterruptedException{
		//Start screen
		getObject(OR.getProperty("SignupButton")).click();
		// Selection screen
		getObject(OR.getProperty("CountrySelector")).click();
		getObject(OR.getProperty("CountrySelectorInput")).sendKeys(TESTDATA2.getProperty("Country"));
		getObject(OR.getProperty("CountrySelectorInput")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		getObject(OR.getProperty("ChooseButton1")).click();
		// Registration form		
		getObject(OR.getProperty("CompanyButton")).click();
		getObjectByName("companyName").sendKeys(TESTDATA2.getProperty("CompanyName"));	
		getObjectByName("companyRegistrationNumber").sendKeys(TESTDATA2.getProperty("BusinessNoField"));	
		getObjectByName("firstName").sendKeys(TESTDATA2.getProperty("FirstName"));		
		getObjectByName("lastName").sendKeys(TESTDATA2.getProperty("LastName"));
		getObjectByName("email").sendKeys(TESTDATA2.getProperty("Email"));
		getObjectByName("password").sendKeys(TESTDATA2.getProperty("Password"));
		getObjectByName("confirmPassword").sendKeys(TESTDATA2.getProperty("Password"));
		getObjectByName("mobileNumber").sendKeys(TESTDATA2.getProperty("MobileTel"));	
		getObjectByName("vrn1").sendKeys(TESTDATA2.getProperty("LicensePlate"));

		getObject(OR.getProperty("CreditCardButton")).click();
		// Payment method
		getObject(OR.getProperty("CreditNumberField")).sendKeys(TESTDATA2.getProperty("CreditNumber"));
		getObject(OR.getProperty("CardHoldersNameField")).sendKeys(TESTDATA2.getProperty("CardHoldersName"));
		getObject(OR.getProperty("ExpiryMonthField")).sendKeys(TESTDATA2.getProperty("ExpiryMonth"));
		getObject(OR.getProperty("ExpiryYearField")).sendKeys(TESTDATA2.getProperty("ExpiryYear"));
		getObject(OR.getProperty("VerificationCodeField")).sendKeys(TESTDATA2.getProperty("VerificationCode"));
		getObject(OR.getProperty("SignUpNowButton")).click();
	}	

	public static void runTest3() throws InterruptedException{
		//Start screen
		getObject(OR.getProperty("SignupButton")).click();
		// Selection screen
		getObject(OR.getProperty("CountrySelector")).click();
		getObject(OR.getProperty("CountrySelectorInput")).sendKeys(TESTDATA3.getProperty("Country"));
		getObject(OR.getProperty("CountrySelectorInput")).sendKeys(Keys.RETURN);	
		Thread.sleep(1000);
		getObject(OR.getProperty("ChooseButton2")).click();
		// Registration form		
		getObjectByName("firstName").sendKeys(TESTDATA3.getProperty("FirstName"));		
		getObjectByName("lastName").sendKeys(TESTDATA3.getProperty("LastName"));
		getObjectByName("email").sendKeys(TESTDATA3.getProperty("Email"));
		getObjectByName("password").sendKeys(TESTDATA3.getProperty("Password"));
		getObjectByName("confirmPassword").sendKeys(TESTDATA3.getProperty("Password"));
		getObject(OR.getProperty("MobileTelCountrySelector")).click();	
		getObject(OR.getProperty("MobileTelCountrySelectorInput")).sendKeys(TESTDATA3.getProperty("MobileTelCountry"));	
		getObject(OR.getProperty("MobileTelCountrySelectorInput")).sendKeys(Keys.RETURN);	
		getObjectByName("mobileNumber").sendKeys(TESTDATA3.getProperty("MobileTel"));
		getObject(OR.getProperty("LicensePlateCountrySelector")).click();	
		getObject(OR.getProperty("LicensePlateCountrySelectorInput")).sendKeys(TESTDATA3.getProperty("LicensePlateCountry"));	
		getObject(OR.getProperty("LicensePlateCountrySelectorInput")).sendKeys(Keys.RETURN);
		getObjectByName("vrn1").sendKeys(TESTDATA3.getProperty("LicensePlate"));
		//payment method
		getObject(OR.getProperty("DirectDebitButton")).click();	
		getObject(OR.getProperty("IbanField")).sendKeys(TESTDATA3.getProperty("Iban"));
		getObject(OR.getProperty("BicField")).sendKeys(TESTDATA3.getProperty("Bic"));
		getObject(OR.getProperty("SignUpNowButton")).click();
	}	
	
}
