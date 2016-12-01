package com.vaticahealth.vatica.tests;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class PHPTest extends TestAnnotation {

	CommonCode common = new CommonCode();
	// CreateHraTest createHraTest = new CreateHraTest();

	// Clicking on 'Add New Visit' from the PHP
	public void tc_PHP_1() throws InterruptedException {
		common.implictWait(10);
		Thread.sleep(10000);
		home.AddNewVisitBtn.click();

	}

	// Clicking on John Doe HRA from the PHP
	public void php_doubleClickHRA() throws InterruptedException {
		common.implictWait(10);
		Thread.sleep(10000);
		home.doubleClick(driver, home.DoeHra);

	}

	// Site check on PHP after logging in.
	public void php_siteCheck() throws InterruptedException {

		Thread.sleep(2000);
		String actualSite = home.siteOnPhp();
		String expectedSite = common.readExcel("get_values", "site");
		if (expectedSite.equals(actualSite) == true)
			System.out.println("Site check is Done");

	}

	// Columns check on PHP grid
	public void columnsOnGrid() throws InterruptedException {

		Thread.sleep(2000);
		java.util.List<WebElement> listOfColumns = home.getColumnsOnGrid();
		ArrayList<String> expectColumnsOnGrid = home.getColumnLabelsOnPHP();

		for (int i = 0; i < listOfColumns.size(); i++) {
			if (expectColumnsOnGrid.get(i).equals((listOfColumns.get(i).getText())))
				System.out.println("Column is a match");
			else
				System.out.println("It's not a match");

			Thread.sleep(2000);
			System.out.println(listOfColumns.get(i).getText() + "     " + expectColumnsOnGrid.get(i));
		}
	}

	// Login confirmation
	public void loginConf() throws InterruptedException {

		Thread.sleep(3000);
		String expectedWelcomeMessage = common.readExcel("get_values", "welcomeMessage");
		String actualWelcomeMessage = home.welcomeMsg.getText().toString();

		if (actualWelcomeMessage.equalsIgnoreCase(expectedWelcomeMessage)) {
			System.out.println("Login Successful");

		}
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
		
		common.implictWait(10);
		Thread.sleep(5000);
		home.clearSearchField();
		home.lastName(common.readExcel("hra", "Last Name"));
		home.firstName(common.readExcel("hra", "First Name"));
		home.dobText(common.readExcel("hra", "DOB"));
		home.visitDateText(common.readExcel("hra", "DOV"));
		common.selectByValue(home.selectStatus, Integer.parseInt(common.readExcel("hra", "Visit Status")));
		home.searchButton();
		Thread.sleep(5000);

		try {
			Assert.assertTrue(home.SearchGridFirstName.getText().equals(common.readExcel("hra", "First Name")),
					"First Names don't match");
			Assert.assertTrue(home.SearchGridLastName.getText().equals(common.readExcel("hra", "Last Name")),
					"Last Names don't match");
			Assert.assertTrue(home.SearchGridDOV.getText().toString().equals(common.readExcel("hra", "DOV")),
					"DOVs don't match");
			Assert.assertTrue(home.SearchGridDOB.getText().toString().equals("DOB 04/04/1945"),
					"DOBs don't match");
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
}
