package com.POMProject1_Loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.POMProject1_Testbase.Testbase_common_features;
import com.POMProject1_UIactions.Loginpage_Webelements;

public class Loginpage_with_valid_credentials_TC001 extends Testbase_common_features {

//	WebDriver driver;
	Loginpage_Webelements loginwebele;

	@BeforeTest
	public void setup() {
		BrowserSelection("Chrome");
		url("https://www.freecrm.com/index.html",60);
	}
	@Test
	public void proper_credentials() {
		loginwebele=new Loginpage_Webelements(driver);
		loginwebele.Loginapp("veerufreecrm", "veeru@freecrm");
		
	}
	@AfterTest
	public void endtest() {
		driver.close();
	}
	
}
