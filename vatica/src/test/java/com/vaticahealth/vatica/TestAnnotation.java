package com.vaticahealth.vatica;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.pages.Home;
import com.vaticahealth.vatica.pages.Login;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class TestAnnotation {
	WebDriver driver = Configuration.broswer();
	Login log = new Login();
	CommonCode common = new CommonCode();
	Home home = new Home();
	public String logIdSupp = common.readExcel("get_values", "loginId");
	public String logPassowrdSupp = common.readExcel("get_values", "loginPassword");
	public String logInvalidPasswordSupp = common.readExcel("get_values", "invalidPassword");
	public String websiteSelectionSupp = common.readExcel("get_values", "webSiteSelection");
	int intff= Integer.parseInt(websiteSelectionSupp);


	@BeforeTest
	public void invokeUrl() {

		driver.get(Configuration.invokeUrl());

	}
	/*@AfterSuite
	public void closeDriver()
	{
		driver.close();
	}*/

}
