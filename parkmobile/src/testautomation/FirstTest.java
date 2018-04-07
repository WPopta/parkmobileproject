package testautomation;

import org.openqa.selenium.firefox.*;



public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:/eclipse/seleniumjars/geckodriver-v0.20.0-win64/geckodriver.exe");
		
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("https://account.park-now.com/registration");
	}

}
