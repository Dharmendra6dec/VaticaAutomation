package com.vaticahealth.vatica.tests;

import java.awt.AWTException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class RegressionTest extends TestAnnotation {
	CommonCode common = new CommonCode();
	LoginTest loginTest = new LoginTest();
	PHPTest phpTest = new PHPTest();

	public void  regressionTest() throws Exception {
		
		loginTest.tc_Login_1();
		
		phpTest.logoCheck();
		phpTest.checkFirstNameSortingonPHPGrid();
		phpTest.checkLastNameSortingonPHPGrid();
		phpTest.checkVisitDateSortingonPHPGrid();
		phpTest.colorcheck();
		phpTest.columnsOnGridCheck();
		phpTest.loginConf();
		phpTest.searchNewHraAndVerifyHraDetails();
		phpTest.siteCheck();
		phpTest.verifyOneRowOnPhp();
		phpTest.verifySiteOptions();
		
		
		
		
		
		
	}

	@Test(alwaysRun = true, description = "Settings drop down displayed with different options")
	public void optionsInSettings() throws InterruptedException {

		Thread.sleep(2000);
		home.settings.click();

		java.util.List<WebElement> listOfColumns = home.getColumnsOnGrid();
		System.out.println(listOfColumns);
		for (WebElement elle : listOfColumns) {
			System.out.println(elle.getText());
		}
		System.out.println("columns Done");
	}

	@Test(alwaysRun = true, description = "Reset Password of Email Id as enterd", enabled = false)
	public void resetPassword() {
		String resetEmailId = common.readExcel("get_values", "passwordResetEmail");
		String resetPasswordMessage = common.readExcel("get_values", "passwordResetMessage");
		log.resetPassword(resetEmailId, resetPasswordMessage);
	}

	@Test(alwaysRun = true, description = "Techincal supprt/help", enabled = false)
	public void techSupportLink() {
		log.technicalSupportLink(common.readExcel("get_values", "TechSupportTitle"));
		log.cancelTechSupport();

	}

	@Test(alwaysRun = true, description = "Privacy policy Link", enabled = false)
	public void privacyPolicyLink() {
		invokeUrl();
		log.privacyPolicy(common.readExcel("get_values", "PrivacyPolicyTitle"));
		log.closePrivacyPolicy();
	}

	@Test(alwaysRun = true, description = "LogIn Application with Inavalid password", enabled = false)
	public void invalidPassword() {
		try {
			Thread.sleep(3000);
			invokeUrl();
			log.logging(logIdSupp, logInvalidPasswordSupp);
			log.loginButton();
		} catch (InterruptedException e) {
			StringWriter w = new StringWriter();

			e.printStackTrace(new PrintWriter(w));
			Reporter.log(w.toString());
			Assert.assertEquals(log.invalidLoginMess.getText(), common.readExcel("get_values", "invalidLoginMessage"));
		}

	}

	
	

}