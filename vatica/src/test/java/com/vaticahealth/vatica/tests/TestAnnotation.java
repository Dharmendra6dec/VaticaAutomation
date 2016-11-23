package com.vaticahealth.vatica.tests;

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
import com.vaticahealth.vatica.pages.CreateHRA;
import com.vaticahealth.vatica.pages.PHP;
import com.vaticahealth.vatica.pages.Hra;
import com.vaticahealth.vatica.pages.Login;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class TestAnnotation {
	public static WebDriver driver = Configuration.broswer();
	protected Login log = new Login();
	CommonCode common = new CommonCode();
	protected PHP home = new PHP();
	protected CreateHRA createHra = new CreateHRA();
	protected Hra hra = new Hra();
	public String logIdSupp = common.readExcel("get_values", "loginId");
	public String logPassowrdSupp = common.readExcel("get_values", "loginPassword");
	public String logInvalidPasswordSupp = common.readExcel("get_values", "invalidPassword");
	public String websiteSelectionSupp = common.readExcel("get_values", "webSiteSelection");
	protected int intff = Integer.parseInt(websiteSelectionSupp);

	@BeforeTest
	public void invokeUrl() {

		driver.get(Configuration.invokeUrl());

	}
	/*
	 * @AfterSuite public void closeDriver() { driver.close(); }
	 */

}
