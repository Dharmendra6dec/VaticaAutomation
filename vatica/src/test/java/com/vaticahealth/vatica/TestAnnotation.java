package com.vaticahealth.vatica;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
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
	

	@BeforeSuite(description = "Application URL")
	public void invokeUrl() {

		driver.get(Configuration.invokeUrl());

	}

	@BeforeTest
	public void loginApp() {
		common.implictWait(10);
		String Id = common.readExcel("get_values", "loginId");
		String password = common.readExcel("get_values", "loginPassword");
		log.logging(Id, password);
		log.loginButton();
		log.websiteDropDown(common.readExcel("get_values", "webSiteSelection"));
		log.selectWebsiteButton();
	}

	@AfterSuite
	public void closeDriver() {
		driver.close();
	}

}
