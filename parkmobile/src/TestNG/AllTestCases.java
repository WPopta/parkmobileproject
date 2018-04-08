package TestNG;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import TestNG.TestBase;
import util.TestUtil;

public class AllTestCases extends TestBase {
	
	@BeforeSuite
	public void beforeTest() throws IOException{
		initialize();				
	}


	@Test
	public void test1() throws IOException, InterruptedException{
		driver.get(CONFIG.getProperty("testSiteName"));
		TestUtil.runTest1();
		// some validation errors are expected
		Assert.assertEquals("Note: You cannot register with this email address since it is already in use for another account.",getObject(OR.getProperty("EmailFieldError")).getText());
		Assert.assertEquals("Note: You cannot use this mobile number since it is already in use for another account.",getObject(OR.getProperty("MobileTelFieldError")).getText());
		Thread.sleep(2000);
	}
	
	@Test
	public void test2() throws IOException, InterruptedException{
		driver.get(CONFIG.getProperty("testSiteName"));
		TestUtil.runTest2();
		// some validation errors are expected
		Assert.assertEquals("Invalid phone number",getObject(OR.getProperty("MobileTelFieldError")).getText());
		Thread.sleep(2000);
	}
	
	@Test
	public void test3() throws IOException, InterruptedException{
		driver.get(CONFIG.getProperty("testSiteName"));
		TestUtil.runTest3();
		// some validation errors are expected
		Assert.assertEquals("Please check the account number, it is probably incorrect",getObject(OR.getProperty("IbanFieldError")).getText());
		Thread.sleep(2000);
	}
	
	
	@AfterSuite
	public void afterTest(){
		driver.quit();				
	}
		

}
