package com.vaticahealth.vatica.tests;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vaticahealth.vatica.pages.PHP;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class PHPTest extends TestAnnotation {

	CommonCode common = new CommonCode();
	PHP php = new PHP();
	// CreateHraTest createHraTest = new CreateHraTest();

	// Clicking on 'Add New Visit' from the PHP
	public void tc_PHP_1() throws InterruptedException {
		common.implictWait(10);
		Thread.sleep(10000);
		home.clickAddNewVisitButton();

	}

	// Clicking on John Doe HRA from the PHP
	public void php_doubleClickHRA() throws InterruptedException {
		common.implictWait(10);
		Thread.sleep(10000);
		home.doubleClick(driver, home.DoeHra);

	}

	// Site check on PHP after logging in.
	public void siteCheck() throws InterruptedException {

		Thread.sleep(2000);
		String actualSite = home.siteOnPhp();
		String expectedSite = common.readExcel("get_values", "site");
		Assert.assertTrue(expectedSite.equals(actualSite), "Site check failed");

		/*
		 * if (expectedSite.equals(actualSite) == true) {
		 * System.out.println("Site check is Done"); } else {
		 * System.out.println("Site check failed"); }
		 */

	}

	// Columns check on PHP grid
	public void columnsOnGridCheck() throws InterruptedException {

		Thread.sleep(2000);
		java.util.List<WebElement> listOfColumns = home.getColumnsOnGrid();
		ArrayList<String> expectColumnsOnGrid = home.getColumnLabelsOnPHP();

		for (int i = 0; i < listOfColumns.size(); i++) {

			Assert.assertTrue(
					expectColumnsOnGrid.get(i).toString().equalsIgnoreCase((listOfColumns.get(i).getText().toString())),
					expectColumnsOnGrid.get(i).toString() + " - column is not a match");

			/*
			 * if (expectColumnsOnGrid.get(i).toString().equalsIgnoreCase((
			 * listOfColumns.get(i).getText().toString()))) {
			 * System.out.println(expectColumnsOnGrid.get(i).toString() +
			 * " - column is a match"); } else { System.out.println(); }
			 */

			Thread.sleep(2000);
		}
	}

	// Login confirmation
	public void loginConf() throws InterruptedException {

		Thread.sleep(3000);
		String expectedWelcomeMessage = common.readExcel("hra", "welcomeMessage");
		String actualWelcomeMessage = home.welcomeMsg.getText().toString();
		Assert.assertTrue(actualWelcomeMessage.equalsIgnoreCase(expectedWelcomeMessage), "Login Unsuccessful");

		/*
		 * if (actualWelcomeMessage.equalsIgnoreCase(expectedWelcomeMessage)) {
		 * System.out.println("Login Successful");
		 * 
		 * }
		 */
	}

	// Logout and it's confirmation
	public void logout() throws InterruptedException {
		common.implictWait(10);
		home.logOut();
		Thread.sleep(7000);
		if (home.loginBtn.isDisplayed() == true)
			System.out.println("Logout Successful");
		else

			System.out.println("Logout failed");

	}

	// Execute one complete Search and Verify the one row in the PHP grid
	public void verifyOneRowOnPhp() throws InterruptedException {

		CreateHraTest cht = new CreateHraTest();
		HraTest ht = new HraTest();

		common.implictWait(10);
		Thread.sleep(5000);
		home.clearSearchField();
		home.lastName(cht.LastNameCreated);
		home.firstName(cht.FirstNameCreated);
		home.dobText(cht.DOBCreated);
		home.visitDateText(ht.DateOfVisitCreated);
		common.selectByValue(home.selectStatus, Integer.parseInt(common.readExcel("hra", "Visit Status")));
		home.searchButton();
		Thread.sleep(5000);

		try {
			// Assert.assertTrue(home.SearchGridFirstName.getText().equals(common.readExcel("hra",
			// "First Name")),"First Names don't match");

			Assert.assertTrue(home.SearchGridFirstName.getText().equals(cht.FirstNameCreated),
					"First Names don't match");
			Assert.assertTrue(home.SearchGridLastName.getText().equals(cht.LastNameCreated), "Last Names don't match");
			Assert.assertTrue(home.SearchGridDOV.getText().toString().equals(ht.DateOfVisitCreated),
					"DOVs don't match");
			Assert.assertTrue(home.SearchGridDOB.getText().toString().equals("DOB 04/04/1945"), "DOBs don't match");
			Assert.assertTrue(home.GridPppBtn.isDisplayed() && home.GridPppBtn.isEnabled(),
					"P button on grid is not working.");
			Assert.assertTrue(home.GridTestBtn.isDisplayed() && home.GridTestBtn.isEnabled(),
					"T button on grid is not working.");
			Assert.assertTrue(home.GridDiagnosisBtn.isDisplayed() && home.GridDiagnosisBtn.isEnabled(),
					"D  button on grid is not working.");
			Assert.assertTrue(home.GridHraBtn.isDisplayed() && home.GridHraBtn.isEnabled(),
					"HRA button on grid is not working.");
			Assert.assertTrue(home.GridHraBtn.isDisplayed() && home.GridHraBtn.isEnabled(),
					"HRA button on grid is not working.");
			Assert.assertTrue(home.GridHraBtn.isDisplayed() && home.GridHraBtn.isEnabled(),
					"HRA button on grid is not working.");
			Assert.assertTrue(home.GridHraBtn.isDisplayed() && home.GridHraBtn.isEnabled(),
					"HRA button on grid is not working.");
			Assert.assertTrue(home.GridHraBtn.isDisplayed() && home.GridHraBtn.isEnabled(),
					"HRA button on grid is not working.");
			Assert.assertTrue(home.GridHraBtn.isDisplayed() && home.GridHraBtn.isEnabled(),
					"HRA button on grid is not working.");

		} catch (java.lang.AssertionError e) {
			e.printStackTrace();
		}
	}

	// To verify all the site option available from the Settings button
	public void verifySiteOptions() throws InterruptedException {

		Thread.sleep(5000);
		ArrayList<String> expectedSiteOptions = home.expectedSiteOptions();
		home.clickSettings();

		Actions action = new Actions(driver);
		action.moveToElement(home.SettingsChangeSite).perform();
		// home.SettingsChangeSite.click();
		String site = Elements.SETTINGSSITEOPTIONS;
		for (int i = 0; i < 8; i++) {
			String ActualSite = driver.findElement(By.xpath(site + "/li[" + (i + 1) + "]/a")).getText();
			Assert.assertTrue(ActualSite.equalsIgnoreCase(expectedSiteOptions.get(i)),
					ActualSite + "  - site did not match.");
		}
		home.clickChangeSettings();

	}

	// To check the Sorting of First Names on Grid on PHP
	public void checkFirstNameSortingonPHPGrid() throws Exception {
		common.implictWait(20);
		ArrayList<String> ExpectedList = home.getSortedFirstNameOnPHPfromDB();
		ArrayList<String> ActualList = home.getSortedFirstNamesFromPHPGrid();
		common.compareList(ExpectedList, ActualList);
	}

	// To check the Sorting of Last Names on Grid on PHP
	public void checkLastNameSortingonPHPGrid() throws Exception {
		common.implictWait(20);
		ArrayList<String> ExpectedList = home.getSortedLastNameOnPHPfromDB();
		ArrayList<String> ActualList = home.getSortedLastNamesFromPHPGrid();
		common.compareList(ExpectedList, ActualList);
	}

	// To check the Sorting of Visit Dates on Grid on PHP
	public void checkVisitDateSortingonPHPGrid() throws Exception {
		common.implictWait(20);
		ArrayList<String> ExpectedList = home.getSortedVisitDatesOnPHPfromDB();
		PHP.show(ExpectedList);
		ArrayList<String> ActualList = home.getSortedVisitDatesFromPHPGrid();
		PHP.show(ActualList);
		common.compareList(ExpectedList, ActualList);
	}

}
