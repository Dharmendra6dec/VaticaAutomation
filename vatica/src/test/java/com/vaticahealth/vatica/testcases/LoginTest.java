package com.vaticahealth.vatica.testcases;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.vaticahealth.vatica.config.TestAnnotation;
import com.vaticahealth.vatica.pages.Login;
import com.vaticahealth.vatica.utils.CommonCode;

public class LoginTest extends TestAnnotation {
//	CommonCode common = new CommonCode();

	// Login in to the application with correct credentials and select the
	// website 'Plus' from the dropdown of sites.
	public void tc_Login_1() throws InterruptedException, InvocationTargetException {

		common.implictWait(20);
		login.logging(logIdSupp, logPassowrdSupp);
		login.loginButton();
		Thread.sleep(5000);
		login.websiteDropDown(intff);
		// Thread.sleep(3000);
		login.selectWebsiteButton();

	}

	// Clicking on privacy policy and confirming the page title
	public void tc_Login_2() {
		login.privacyPolicy(common.readExcel("hra", "Privacy Title"));
	}

	// Clicking on Technical Support / Get Help and confirming the page title
	public void tc_Login_3() throws InterruptedException {
		login.technicalSupportLink(common.readExcel("hra", "Technical Support Title"));
	}

	// Login memeory check
	public void tc_Login_4() throws InterruptedException {
		login.loginFiller();
		login.rememberMeCheckClick();
		login.loginButton();
		login.websiteDropDown(intff);
		Thread.sleep(2000);
		login.selectWebsiteButton();
		home.logOut();
		login.checkEmailId(common.readExcel("hra", "EmailId"));
	}
}
