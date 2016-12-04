package com.vaticahealth.vatica.testsuits;

import java.awt.AWTException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vaticahealth.vatica.tests.TestAnnotation;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class RegressionTest extends TestAnnotation {
	CommonCode common = new CommonCode();

	@Test(alwaysRun = true, description = "Login Application")
	public void loginApp() throws InterruptedException, InvocationTargetException {

		common.implictWait(10);
		log.logging(logIdSupp, logPassowrdSupp);
		log.loginButton();
		// Thread.sleep(5000);
		log.websiteDropDown(intff);
		Thread.sleep(10000);
		log.selectWebsiteButton();

	}

	@Test(alwaysRun = true, description = "Login Confirmation", dependsOnMethods = "loginApp")
	public void loginConf() throws InterruptedException {

		Thread.sleep(3000);
		String expectedWelcomeMessage = common.readExcel("get_values", "welcomeMessage");
		String actualWelcomeMessage = home.welcomeMsg.getText().toString();

		if (actualWelcomeMessage.equalsIgnoreCase(expectedWelcomeMessage)) {
			System.out.println("Login Successful");

		}
	}

	/*
	 * @Test(alwaysRun = true, description = "First Name sorting",
	 * dependsOnMethods = "loginApp") public void sqlserver() throws
	 * ClassNotFoundException, SQLException {
	 * 
	 * System.out.println(home.getFirstNamesthruDBConnect());
	 * 
	 * }
	 */

	/*
	 * @Test(alwaysRun = true, dependsOnMethods = "loginApp", description =
	 * "Checking the sorting on the first name column in PHP grid") public void
	 * sortOnFirstNames() throws InterruptedException {
	 * 
	 * //Thread.sleep(7000); java.util.List<WebElement> listOfFirstNames = new
	 * ArrayList<WebElement>(); while (true) { java.util.List<WebElement>
	 * tempList = home.getfirstNamesOnGrid(); listOfFirstNames.addAll(tempList);
	 * try { WebElement elle =
	 * driver.findElement(By.xpath(Elements.NEXTBTNONGRID)); if
	 * (elle.isDisplayed() == true && elle.isEnabled() == true) {
	 * 
	 * elle.click(); } else { break; } } catch (StaleElementReferenceException
	 * e) { System.out.println(e.getMessage());
	 * System.out.println("Exception caused"); break; } }
	 * 
	 * 
	 * java.util.List<String> StringOfFirstNames =
	 * home.getTextFromWebElementList(listOfFirstNames);
	 * 
	 * String[] expectedList = home.sortAlphabeticalList(StringOfFirstNames);
	 * 
	 * for (int i = 0; i < expectedList.length; i++) {
	 * System.out.println(expectedList[i]); }
	 * 
	 * System.out.println(StringOfFirstNames.size()); for (int j = 0; j <
	 * StringOfFirstNames.size(); j++) {
	 * System.out.println(StringOfFirstNames.get(j)); } }
	 */

	@Test(alwaysRun = true, description = "Default items per page", dependsOnMethods = "loginApp")
	public void itemsPerPage() throws InterruptedException {

		Thread.sleep(3000);
		int expectedvalue = Integer.parseInt(common.readExcel("get_values", "itemsPerPage"));
		int actualvalue = Integer.parseInt(home.getDefaultItemsPerPage());

		if (expectedvalue == actualvalue)
			System.out.println("Count of default items per page is correct i.e, 15.");

	}

	@Test(alwaysRun = true, description = "Site name check on PHP just after login")
	public void siteCheck() throws InterruptedException {

		Thread.sleep(2000);
		String actualSite = home.siteOnPhp();
		String expectedSite = common.readExcel("get_values", "site");
		if (expectedSite.equals(actualSite) == true)
			System.out.println("Site check is Done");

	}

	@Test(alwaysRun = true, dependsOnMethods = "loginApp", description = "Name of the Columns in PHP grid")
	public void columnsOnGrid() throws InterruptedException {

		Thread.sleep(2000);

		java.util.List<WebElement> listOfColumns = home.getColumnsOnGrid();
		ArrayList<String> expectColumnsOnGrid = home.getColumnLabelsOnPHP();

		for (int i = 0; i < listOfColumns.size(); i++) {
			if (expectColumnsOnGrid.get(i).equals((listOfColumns.get(i).getText())))
				System.out.println("It's a match");
			else
				System.out.println("It's not a match");

			Thread.sleep(2000);
			System.out.println(listOfColumns.get(i).getText() + "     " + expectColumnsOnGrid.get(i));
		}
	}

	// Still working on this

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

	@Test(enabled = false)
	public void logout() throws InterruptedException {
		common.implictWait(10);
		home.logOut();
		Thread.sleep(7000);
		if (home.loginBtn.isDisplayed() == true)
			System.out.println("Logout Successful");
		else
			System.out.println("Logout failed");

	}

	@Test(enabled = false, dependsOnMethods = "logout", description = "Logout confirmation")
	public void logoutConfirmation() {

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

	@Test(alwaysRun = true, description = "Remember Me Functionality", enabled = false)
	public void rememberMe() throws InterruptedException {
		common.implictWait(10);
		log.logging(logIdSupp, logPassowrdSupp);
		Thread.sleep(1000);
		log.rememberMeOption();
		log.loginButton();
		// log.websiteDropDown(websiteSelectionSupp);
		log.selectWebsiteButton();
		home.logOut();
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

	@Test(alwaysRun = true, description = "Search the HRA w.r.t first name", enabled = false)
	public void searchFirstName()

	{
		String firstNameText = common.readExcel("get_values", "searchFirstName");
		try {
			Thread.sleep(5000);

			home.firstName(firstNameText);
			home.searchButton();
			home.assertSearchedItem(firstNameText, home.firstName, Elements.LASTCHILDFIRSTNAME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(alwaysRun = true, description = "search HRA w.r.t Last Name")
	public void searchLastName() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println(home.lastName);

		home.clearSearchField();
		String lastNameText = common.readExcel("get_values", "searchLastName");

		home.lastName(lastNameText);
		home.searchButton();
		home.assertSearchedItem(lastNameText, home.lastName, Elements.LASTCHILDLASTNAME);

	}

	@Test(alwaysRun = true, description = "sarch HRA w.r.t DOB")
	public void searchDOB() throws InterruptedException {
		Thread.sleep(5000);
		home.clearSearchField();
		String dobDate = common.readExcel("get_values", "dobDate");
		String dobDateText = common.readExcel("get_values", "dobText");
		home.dobText(dobDate);
		home.searchButton();
		home.assertSearchedItem(dobDateText, home.dob, Elements.LASTCHILDDOB);

	}

	@Test(alwaysRun = true, description = "search HRA w.r.t Visit date")
	public void searchVisitDate() throws InterruptedException {
		Thread.sleep(5000);
		home.clearSearchField();
		String visitdate = common.readExcel("get_values", "searchVisitDate");
		home.visitDateText(visitdate);
		home.searchButton();
		home.assertSearchedItem(visitdate, home.visitDate, Elements.LASTCHILDVISITDATE);
	}

	@Test(alwaysRun = true, description = "search HRA w.r.t status")
	public void searchSatus() throws InterruptedException {
		home.clearSearchField();
		String statustoBeSelected = common.readExcel("get_values", "searchStatus");
		String statusToBecompared = common.readExcel("get_values", "searchStatusText");
		home.selectStatus(statustoBeSelected);
		home.searchButton();
		home.assertSearchedItem(statusToBecompared, home.status, Elements.LASTSTATUSCHILD);
	}

	@Test(alwaysRun = true, description = "Search HRA w.r.t visit Type")
	public void searchVisitType() {
		home.clearSearchField();
		String visitTypeToBeSelected = common.readExcel("get_values", "searchvisitType");
		home.selectVisitType(visitTypeToBeSelected);
		home.searchButton();
		home.assertSearchedItem(visitTypeToBeSelected, home.visitType, Elements.LASTVISITTYPECHILD);

	}

	@Test(alwaysRun = true, description = "Search HRA w.r.t first name and last name")
	public void searchFirstLastName() {
		try {
			Thread.sleep(3000);

			home.clearSearchField();
			String firstNameToBeSupp = common.readExcel("get_values", "searchFirstName");
			String lastnameToBeSupp = common.readExcel("get_values", "searchLastName");
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

	@Test(alwaysRun = true, description = "Search HRA w.r.t first name and DOB")
	public void searchFirstDOB() {
		try {
			Thread.sleep(3000);

			home.clearSearchField();
			String firstNameToBeSupp = common.readExcel("get_values", "searchFirstName");
			String dobDate = common.readExcel("get_values", "dobDate");
			String dobDateText = common.readExcel("get_values", "dobText");
			home.firstName(firstNameToBeSupp);
			home.dobText(dobDate);
			home.searchButton();
			home.assertSearchedItem(firstNameToBeSupp, home.firstName, Elements.LASTCHILDFIRSTNAME);
			home.assertSearchedItem(dobDateText, home.dob, Elements.LASTCHILDDOB);

		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(alwaysRun = true, description = "Search HRA w.r.t first name and Visit Date")
	public void searchFirstVisitDate() {
		try {
			Thread.sleep(3000);

			home.clearSearchField();
			String firstNameToBeSupp = common.readExcel("get_values", "searchFirstName");
			String visitdate = common.readExcel("get_values", "searchVisitDate");
			home.visitDateText(visitdate);
			home.firstName(firstNameToBeSupp);
			home.searchButton();
			home.assertSearchedItem(firstNameToBeSupp, home.firstName, Elements.LASTCHILDFIRSTNAME);
			home.assertSearchedItem(visitdate, home.visitDate, Elements.LASTCHILDVISITDATE);

		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(alwaysRun = true, description = "Search HRA w.r.t first name and Status")
	public void searchFirstStatus() {
		try {
			Thread.sleep(3000);

			home.clearSearchField();
			String firstNameToBeSupp = common.readExcel("get_values", "searchFirstName");
			String statustoBeSelected = common.readExcel("get_values", "searchStatus");
			String statusToBecompared = common.readExcel("get_values", "searchStatusText");
			home.selectStatus(statustoBeSelected);
			home.firstName(firstNameToBeSupp);
			home.searchButton();
			home.assertSearchedItem(firstNameToBeSupp, home.firstName, Elements.LASTCHILDFIRSTNAME);
			home.assertSearchedItem(statusToBecompared, home.status, Elements.LASTSTATUSCHILD);

		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(alwaysRun = true, description = "Search HRA w.r.t first name and visit type")
	public void searchFirstVisitType() {
		try {
			Thread.sleep(3000);

			home.clearSearchField();
			String firstNameToBeSupp = common.readExcel("get_values", "searchFirstName");
			String visitTypeToBeSelected = common.readExcel("get_values", "searchvisitType");
			home.selectVisitType(visitTypeToBeSelected);
			home.firstName(firstNameToBeSupp);
			home.searchButton();
			home.assertSearchedItem(firstNameToBeSupp, home.firstName, Elements.LASTCHILDFIRSTNAME);
			home.assertSearchedItem(visitTypeToBeSelected, home.visitType, Elements.LASTVISITTYPECHILD);

		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(alwaysRun = true, description = "Search HRA w.r.t ALL search parameters")
	public void searchALL() {
		try {
			Thread.sleep(3000);

			home.clearSearchField();
			String firstNameToBeSupp = common.readExcel("get_values", "searchFirstName");
			String visitTypeToBeSelected = common.readExcel("get_values", "searchvisitType");
			String statustoBeSelected = common.readExcel("get_values", "searchStatus");
			String statusToBecompared = common.readExcel("get_values", "searchStatusText");
			String visitdate = common.readExcel("get_values", "searchVisitDate");
			String dobDate = common.readExcel("get_values", "dobDate");
			String dobDateText = common.readExcel("get_values", "dobText");
			String lastnameToBeSupp = common.readExcel("get_values", "searchLastName");
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

		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(dependsOnMethods = "searchFirstLastName")
	public void reports() throws InterruptedException, AWTException {
		String suppReportToPrint = common.readExcel("get_values", "reportToPrint");
		try {
			home.pdfReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}