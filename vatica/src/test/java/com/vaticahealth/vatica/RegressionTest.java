package com.vaticahealth.vatica;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class RegressionTest extends TestAnnotation {
	CommonCode common = new CommonCode();

	/*
	 * public void invokeUrl() {
	 * 
	 * driver.get(Configuration.invokeUrl());
	 * 
	 * } public void logout() { home.logOut(); }
	 * 
	 * @Test(alwaysRun=true,description="Login Application",priority=9) public
	 * void loginApp() { invokeUrl(); common.implictWait(10); log.logging(logId,
	 * logPassowrd); log.loginButton(); log.websiteDropDown(websiteSelection);
	 * log.selectWebsiteButton(); logout(); }
	 * 
	 * @Test(alwaysRun = true, description =
	 * "LogIn Application with Inavalid password") public void invalidPassword()
	 * { try { Thread.sleep(3000); invokeUrl(); log.logging(logId,
	 * logInvalidPassword); log.loginButton(); } catch (InterruptedException e)
	 * { StringWriter w = new StringWriter();
	 * 
	 * e.printStackTrace(new PrintWriter(w)); Reporter.log(w.toString()); }
	 * 
	 * }
	 * 
	 * @Test(alwaysRun = true, description =
	 * "Reset Password of Email Id as enterd", enabled = false) public void
	 * resetPassword() { String resetEmailId = common.readExcel("get_values",
	 * "passwordResetEmail"); String message = common.readExcel("get_values",
	 * "passwordResetMessage"); log.resetPassword(resetEmailId, message); }
	 * 
	 * @Test(alwaysRun = true, description = "Privacy policy Link") public void
	 * privacyPolicyLink() { invokeUrl();
	 * log.privacyPolicy(common.readExcel("get_values", "PrivacyPolicyTitle"));
	 * log.closePrivacyPolicy(); }
	 * 
	 * @Test(alwaysRun = true, description = "Techincal supprt/help") public
	 * void techSupportLink() {
	 * log.technicalSupportLink(common.readExcel("get_values",
	 * "TechSupportTitle")); log.cancelTechSupport();
	 * 
	 * }
	 * 
	 * @Test public void display() {
	 * 
	 * System.out.println("ram"); }
	 * 
	 * @Test public void display2() { System.out.println("sham"); }
	 */

	@Test(alwaysRun = true, description = "Login Application")
	public void loginApp() throws InterruptedException {

		common.implictWait(10);
		log.logging(logIdSupp, logPassowrdSupp);
		log.loginButton();
		log.websiteDropDown(intff);
		Thread.sleep(5000);
	   log.selectWebsiteButton();
	   
	}

	@Test(enabled=false)
	public void logout() {
		home.logOut();

	}

	@Test(alwaysRun = true, description = "Reset Password of Email Id as enterd", enabled=false)
	public void resetPassword() {
		String resetEmailId = common.readExcel("get_values", "passwordResetEmail");
		String resetPasswordMessage = common.readExcel("get_values", "passwordResetMessage");
		log.resetPassword(resetEmailId, resetPasswordMessage);
	}

	@Test(alwaysRun = true, description = "Techincal supprt/help",enabled=false)
	public void techSupportLink() {
		log.technicalSupportLink(common.readExcel("get_values", "TechSupportTitle"));
		log.cancelTechSupport();

	}

	@Test(alwaysRun = true, description = "Remember Me Functionality",enabled=false)
	public void rememberMe() throws InterruptedException {
		common.implictWait(10);
		log.logging(logIdSupp, logPassowrdSupp);
		Thread.sleep(1000);
		log.rememberMeOption();
		log.loginButton();
		//log.websiteDropDown(websiteSelectionSupp);
		log.selectWebsiteButton();
		home.logOut();
	}

	@Test(alwaysRun = true, description = "Privacy policy Link",enabled=false)
	public void privacyPolicyLink() {
		invokeUrl();
		log.privacyPolicy(common.readExcel("get_values", "PrivacyPolicyTitle"));
		log.closePrivacyPolicy();
	}

	@Test(alwaysRun = true, description = "LogIn Application with Inavalid password",enabled=false)
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
/*	@Test(alwaysRun=true,description="Search the HRA w.r.t first name",enabled=false)
	public void searchFirstName()
	
	{
		String firstNameText=common.readExcel("get_values", "searchFirstName");
		try {
			Thread.sleep(5000);
		
		home.firstName(firstNameText);
		home.searchButton();
		home.assertSearchedItem(firstNameText,home.firstName , Elements.LASTCHILDFIRSTNAME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(alwaysRun=true,description="search HRA w.r.t Last Name")
	public void searchLastName() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println(home.lastName);
		
		home.clearSearchField();
		String lastNameText=common.readExcel("get_values", "searchLastName");
		
		home.lastName(lastNameText);
		home.searchButton();
		home.assertSearchedItem(lastNameText, home.lastName, Elements.LASTCHILDLASTNAME);
		
	}

@Test(alwaysRun=true,description="sarch HRA w.r.t DOB")
	public void searchDOB() throws InterruptedException
	{
		Thread.sleep(5000);
		home.clearSearchField();
		String dobDate=common.readExcel("get_values", "dobDate");
		String dobDateText=common.readExcel("get_values", "dobText");
		home.dobText(dobDate);
		home.searchButton();
		home.assertSearchedItem(dobDateText, home.dob, Elements.LASTCHILDDOB);
		
	}
	@Test(alwaysRun= true,description="search HRA w.r.t Visit date")
	public void searchVisitDate() throws InterruptedException
	{
		Thread.sleep(5000);
		home.clearSearchField();
		String visitdate=common.readExcel("get_values", "searchVisitDate");
		home.visitDateText(visitdate);
		home.searchButton();
		home.assertSearchedItem(visitdate, home.visitDate, Elements.LASTCHILDVISITDATE);
	}
	
	@Test(alwaysRun=true,description="search HRA w.r.t status")
	public void searchSatus() throws InterruptedException
	{
		home.clearSearchField();
		String statustoBeSelected=common.readExcel("get_values", "searchStatus");
		String statusToBecompared=common.readExcel("get_values", "searchStatusText");
		home.selectStatus(statustoBeSelected);
		home.searchButton();
		home.assertSearchedItem(statusToBecompared, home.status, Elements.LASTSTATUSCHILD);
	}

	@Test(alwaysRun=true,description="Search HRA w.r.t visit Type")
	public void searchVisitType()
	{
		home.clearSearchField();
		String visitTypeToBeSelected=common.readExcel("get_values", "searchvisitType");
		home.selectVisitType(visitTypeToBeSelected);
		home.searchButton();
		home.assertSearchedItem(visitTypeToBeSelected, home.visitType, Elements.LASTVISITTYPECHILD);
		
		
	}*/
	@Test(alwaysRun=true,description="Search HRA w.r.t first name and last name")
	public void searchFirstLastName()
	{
		try {
			Thread.sleep(3000);
		
		home.clearSearchField();
		String firstNameToBeSupp=common.readExcel("get_values", "searchFirstName");
		String lastnameToBeSupp=common.readExcel("get_values", "searchLastName");
		home.firstName(firstNameToBeSupp);
		home.lastName(lastnameToBeSupp);
		home.searchButton();
		home.assertSearchedItem(firstNameToBeSupp, home.firstName, Elements.LASTCHILDFIRSTNAME);
		home.assertSearchedItem(lastnameToBeSupp, home.lastName, Elements.LASTCHILDLASTNAME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	/*@Test(alwaysRun=true,description="Search HRA w.r.t first name and DOB")
	public void searchFirstDOB()
	{
		try {
			Thread.sleep(3000);
		
		home.clearSearchField();
		String firstNameToBeSupp=common.readExcel("get_values", "searchFirstName");
		String dobDate=common.readExcel("get_values", "dobDate");
		String dobDateText=common.readExcel("get_values", "dobText");
		home.firstName(firstNameToBeSupp);
		home.dobText(dobDate);
		home.searchButton();
		home.assertSearchedItem(firstNameToBeSupp, home.firstName, Elements.LASTCHILDFIRSTNAME);
		home.assertSearchedItem(dobDateText, home.dob, Elements.LASTCHILDDOB);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test(alwaysRun=true,description="Search HRA w.r.t first name and Visit Date")
	public void searchFirstVisitDate()
	{
		try {
			Thread.sleep(3000);
		
		home.clearSearchField();
		String firstNameToBeSupp=common.readExcel("get_values", "searchFirstName");
		String visitdate=common.readExcel("get_values", "searchVisitDate");
		home.visitDateText(visitdate);
		home.firstName(firstNameToBeSupp);
		home.searchButton();
		home.assertSearchedItem(firstNameToBeSupp, home.firstName, Elements.LASTCHILDFIRSTNAME);
		home.assertSearchedItem(visitdate, home.visitDate, Elements.LASTCHILDVISITDATE);
	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test(alwaysRun=true,description="Search HRA w.r.t first name and Status")
	public void searchFirstStatus()
	{
		try {
			Thread.sleep(3000);
		
		home.clearSearchField();
		String firstNameToBeSupp=common.readExcel("get_values", "searchFirstName");
		String statustoBeSelected=common.readExcel("get_values", "searchStatus");
		String statusToBecompared=common.readExcel("get_values", "searchStatusText");
		home.selectStatus(statustoBeSelected);
		home.firstName(firstNameToBeSupp);
		home.searchButton();
		home.assertSearchedItem(firstNameToBeSupp, home.firstName, Elements.LASTCHILDFIRSTNAME);
		home.assertSearchedItem(statusToBecompared, home.status, Elements.LASTSTATUSCHILD);
	
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test(alwaysRun=true,description="Search HRA w.r.t first name and visit type")
	public void searchFirstVisitType()
	{
		try {
			Thread.sleep(3000);
		
		home.clearSearchField();
		String firstNameToBeSupp=common.readExcel("get_values", "searchFirstName");
		String visitTypeToBeSelected=common.readExcel("get_values", "searchvisitType");
		home.selectVisitType(visitTypeToBeSelected);
		home.firstName(firstNameToBeSupp);
		home.searchButton();
		home.assertSearchedItem(firstNameToBeSupp, home.firstName, Elements.LASTCHILDFIRSTNAME);
		home.assertSearchedItem(visitTypeToBeSelected, home.visitType, Elements.LASTVISITTYPECHILD);
	
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test(alwaysRun=true,description="Search HRA w.r.t ALL search parameters")
	public void searchALL()
	{
		try {
			Thread.sleep(3000);
		
		home.clearSearchField();
		String firstNameToBeSupp=common.readExcel("get_values", "searchFirstName");
		String visitTypeToBeSelected=common.readExcel("get_values", "searchvisitType");
		String statustoBeSelected=common.readExcel("get_values", "searchStatus");
		String statusToBecompared=common.readExcel("get_values", "searchStatusText");
		String visitdate=common.readExcel("get_values", "searchVisitDate");
		String dobDate=common.readExcel("get_values", "dobDate");
		String dobDateText=common.readExcel("get_values", "dobText");
		String lastnameToBeSupp=common.readExcel("get_values", "searchLastName");
		home.firstName(firstNameToBeSupp);
		home.lastName(lastnameToBeSupp);
		home.dobText(dobDate);
	    home.visitDateText(visitdate);
	    home.selectStatus(statustoBeSelected);
		home.selectVisitType(visitTypeToBeSelected);
		home.searchButton();
		home.assertSearchedItem(firstNameToBeSupp, home.firstName, Elements.LASTCHILDFIRSTNAME);
		home.assertSearchedItem(visitTypeToBeSelected, home.visitType, Elements.LASTVISITTYPECHILD);
		home.assertSearchedItem(lastnameToBeSupp, home.lastName, Elements.LASTCHILDLASTNAME);
        home.assertSearchedItem(dobDateText, home.dob, Elements.LASTCHILDDOB);
		home.assertSearchedItem(visitdate, home.visitDate, Elements.LASTCHILDVISITDATE);
		home.assertSearchedItem(statusToBecompared, home.status, Elements.LASTSTATUSCHILD);
	
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/
	
	@Test(dependsOnMethods="searchFirstLastName")
	public void reports() throws InterruptedException
	{
		String suppReportToPrint=common.readExcel("get_values", "reportToPrint");
		home.reports(suppReportToPrint);
	}

}
