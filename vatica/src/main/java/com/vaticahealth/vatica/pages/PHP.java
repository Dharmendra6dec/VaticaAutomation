package com.vaticahealth.vatica.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;
import org.openqa.selenium.JavascriptExecutor;

public class PHP {
	WebDriver driver = Configuration.driver;
	CommonCode common = new CommonCode();

	@FindBy(xpath = Elements.logOut)
	public WebElement logOut;

	// Doe HRA
	@FindBy(xpath = "//div[text()='DOE17865']")
	public WebElement DoeHra;

	@FindBy(xpath = Elements.VATICAlOGO)
	public WebElement VaticaLogo;

	@FindBy(xpath = Elements.SEARCHFIRSTNAME)
	public WebElement firstNameSearch;

	@FindBy(xpath = Elements.SEARCHBUTTON)
	public WebElement searchButton;

	@FindBy(xpath = Elements.PAGETOFIRSTBUTTON)
	public WebElement PageToFirstButton;

	@FindBy(xpath = Elements.CLEARBUTTON)
	public WebElement clearButton;

	@FindBy(xpath = Elements.FIRSTNAME)
	public WebElement firstName;

	@FindBy(xpath = Elements.SEARCHLASTNAME)
	public WebElement lastNameSearch;

	@FindBy(xpath = Elements.LASTPAGEBUTTON)
	public WebElement lastPageButton;

	@FindAll(@FindBy(xpath = Elements.LASTRECORDPARENT))
	public List<WebElement> lastRecordParent;

	@FindBy(xpath = Elements.COLUMNSONGRID)
	public List<WebElement> columnsOnGrid;

	@FindBy(xpath = Elements.FIRSTNAMESONGRID)
	public List<WebElement> firstNamesOnGrid;

	@FindBy(xpath = Elements.LASTNAMESONGRID)
	public List<WebElement> lastNamesOnGrid;

	@FindBy(xpath = Elements.ROWSONGRID)
	public List<WebElement> rowsOnGrid;

	@FindBy(xpath = Elements.LASTNAME)
	public WebElement lastName;

	@FindBy(xpath = Elements.SEARCHDOBTEXT)
	public WebElement dobTextSearch;

	@FindBy(xpath = Elements.TRAVERSEMONTHYEAR)
	public WebElement traversedmonthYear;

	@FindBy(xpath = Elements.ADDNEWVISIT)
	public WebElement AddNewVisitBtn;

	@FindBy(xpath = Elements.DOB)
	public WebElement dob;

	@FindBy(xpath = Elements.SEARCHGRIDFIRSTNAME)
	public WebElement SearchGridFirstName;

	@FindBy(xpath = Elements.SEARCHGRIDLASTNAME)
	public WebElement SearchGridLastName;

	@FindBy(xpath = Elements.SEARCHGRIDDOB)
	public WebElement SearchGridDOB;

	@FindBy(xpath = Elements.SEARCHGRIDDOV)
	public WebElement SearchGridDOV;

	@FindBy(xpath = Elements.SEARCHVISITDATETEXT)
	public WebElement visitDateTextSearch;

	@FindBy(xpath = Elements.VISITDATE)
	public WebElement visitDate;

	@FindBy(xpath = Elements.SERACHVISITTYPE)
	public WebElement visitTypeSearch;

	@FindBy(xpath = Elements.STATUS)
	public WebElement status;

	@FindBy(xpath = Elements.WELCOMEMSG)
	public WebElement welcomeMsg;

	@FindBy(xpath = Elements.LOGINBTN)
	public WebElement loginBtn;

	@FindBy(xpath = Elements.VISITTYPE)
	public WebElement visitType;

	@FindBy(xpath = Elements.SEARCHSTATUS)
	public WebElement selectStatus;

	@FindBy(xpath = Elements.PHPNORECORD)
	public WebElement noRecordfound;

	@FindBy(xpath = Elements.FIRSTPAGEBUTTON)
	public WebElement moveToFirstPage;

	@FindBy(xpath = Elements.SETTINGS)
	public WebElement settings;

	@FindBy(xpath = Elements.SETTINGSCHANGESITE)
	public WebElement SettingsChangeSite;

	@FindBy(xpath = Elements.FIRSTNAMECOLUMNGRID)
	public WebElement FirstNameColumnGrid;

	@FindBy(xpath = Elements.LASTNAMECOLUMNGRID)
	public WebElement LastNameColumnGrid;

	@FindBy(xpath = Elements.VISITDATECOLUMNGRID)
	public WebElement VisitDateColumnGrid;

	@FindBy(xpath = Elements.NEXTBTNONGRID)
	public WebElement NextBtnOnGrid;

	@FindBy(xpath = Elements.PRINTFIRSTREPORTBUTTON)
	public WebElement printFirstHraReportButton;

	@FindBy(xpath = Elements.SELECTREPORT)
	public WebElement selectReport;

	@FindBy(xpath = Elements.EXPORTDATABUTTON)
	public WebElement exportDataButton;

	@FindBy(xpath = Elements.DONEBUTTON)
	public WebElement doneButton;

	@FindBy(xpath = Elements.ITEMSPERPAGE)
	public WebElement itemsPerPage;

	@FindBy(xpath = Elements.SITEONPHP)
	public WebElement siteOnPhp;

	@FindBy(xpath = Elements.SETTINGSSITEOPTIONS)
	public WebElement SiteOptions;

	@FindBy(xpath = Elements.HRA)
	public WebElement GridHraBtn;

	@FindBy(xpath = Elements.PPP)
	public WebElement GridPppBtn;

	@FindBy(xpath = Elements.Test)
	public WebElement GridTestBtn;

	@FindBy(xpath = Elements.Diagnosis)
	public WebElement GridDiagnosisBtn;

	@FindBy(xpath = Elements.Snapshot)
	public WebElement GridSnapshotBtn;

	@FindBy(xpath = Elements.Comment)
	public WebElement GridCommentBtn;

	@FindBy(xpath = Elements.Printforms)
	public WebElement GridPrintformsbtn;

	@FindBy(xpath = Elements.MedicalRecords)
	public WebElement GridMedicalRecordsBtn;

	@FindBy(xpath = Elements.Admin)
	public WebElement GridAdminBtn;

	public PHP() {
		PageFactory.initElements(driver, this);
	}

	// Check the presence of Vatica Logo
	public void logoCheck() throws Exception {
		Thread.sleep(5000);
		Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				VaticaLogo);

		Assert.assertTrue(ImagePresent, "Image displayed.");

		/*
		 * if (!ImagePresent) { System.out.println("Image not displayed."); }
		 * else { System.out.println("Image displayed."); }
		 */

	}

	public String siteOnPhp() throws InterruptedException {
		Thread.sleep(2000);
		return siteOnPhp.getText();

	}

	public void clickAddNewVisitButton() {
		AddNewVisitBtn.click();
	}

	// Clicking Logout Button
	public void logOut() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logOut.click();

	}

	public ArrayList<String> getItemsFromGrid(String xpath) {
		ArrayList<String> list = new ArrayList<String>();
		List<WebElement> lstelle = driver.findElements(By.xpath(xpath));
		for (int i = 0; i < lstelle.size(); i++) {
			list.add(i, lstelle.get(i).getText());
		}
		return list;

	}

	// For Sorting Alphabetical List using Bubble sort
	public String[] sortAlphabeticalList(List<String> str) {

		String temp;
		String[] strTemp = new String[str.size()];

		for (int i = 0; i < str.size(); i++) {
			strTemp[i] = str.get(i).toLowerCase();
		}

		for (int i = strTemp.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				int comp = strTemp[j].compareTo(strTemp[j + 1]);
				if (comp > 0) {
					temp = strTemp[j + 1];
					strTemp[j + 1] = strTemp[j];
					strTemp[j] = temp;
				}
			}
		}
		return strTemp;
	}

	public List<String> getTextFromWebElementList(List<WebElement> lst) {

		List<String> lstStr = new ArrayList<String>();
		String temp;

		for (int i = 0; i < lst.size(); i++) {
			temp = lst.get(i).getText().toString();
			lstStr.add(temp);

		}
		return lstStr;

	}

	public List<WebElement> getColumnsOnGrid() {
		List<WebElement> lst = driver.findElements(By.xpath(Elements.COLUMNSONGRID));
		// System.out.println(lst);
		return lst;

	}

	public List<WebElement> getRowsOnGrid() {
		List<WebElement> lst = driver.findElements(By.xpath(Elements.ROWSONGRID));
		// System.out.println(lst);
		return lst;

	}

	public String getDefaultItemsPerPage() throws InterruptedException {

		Thread.sleep(5000);
		WebElement elle = driver.findElement(By.xpath(Elements.ITEMSPERPAGE));
		Select sel = new Select(elle);
		String valueAtDefault = sel.getFirstSelectedOption().getText();
		return valueAtDefault;

	}

	public String lastElemnetText(String childXpath) {
		try {
			Thread.sleep(5000);

			lastPageButton.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int lastRecordNumbr = lastRecordParent.size();
		String lastElementText = driver
				.findElement(By.xpath(Elements.LASTRECORDPARENT + "[" + lastRecordNumbr + "]" + childXpath)).getText();
		System.out.println("last   " + lastElementText);
		return lastElementText;

	}

	public void firstName(String searchFirstNameSupp) {

		String suppFirstName = searchFirstNameSupp;
		firstNameSearch.sendKeys(searchFirstNameSupp);
	}

	public void clearSearchField() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clearButton.click();
	}

	public void lastName(String lastNameSupp) {
		common.explictWaitPresence(20, By.xpath(Elements.SEARCHLASTNAME));
		String suppLastName = lastNameSupp;
		lastNameSearch.sendKeys(lastNameSupp);
	}

	public void searchButton() {
		searchButton.click();
	}

	public void clickSettings() {
		settings.click();
	}

	public void clickChangeSettings() {
		SettingsChangeSite.click();
	}

	public void assertSearchedItem(String elemetTextSupp, WebElement elementInList, String lastElementLocation) {
		String suppElementText = elemetTextSupp;
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (noRecordfound.isDisplayed()) {
			Reporter.log("No Record found");
		} else {
			System.out.println("passed   " + suppElementText);
			System.out.println("1st element    " + elementInList.getText());
			System.out.println("GROUND ZERO");
			Assert.assertTrue(elementInList.getText().toUpperCase().contains(suppElementText));
			System.out.println("here");

			Assert.assertTrue(lastElemnetText(lastElementLocation).toUpperCase().contains(suppElementText));
			moveToFirstPage.click();

		}
	}

	public void dobText(String dobDateSupp) {
		common.explictWaitPresence(20, By.xpath(Elements.SEARCHDOBTEXT));
		String suppDateDob = dobDateSupp;
		dobTextSearch.sendKeys(suppDateDob);
	}

	public void visitDateText(String visitDateTextSupp) {
		common.explictWaitPresence(20, By.xpath(Elements.SEARCHVISITDATETEXT));
		String suppVisitTextDate = visitDateTextSupp;
		visitDateTextSearch.sendKeys(suppVisitTextDate);
	}

	public void selectStatus(String statusSupp) {
		common.explictWaitPresence(20, By.xpath(Elements.SEARCHSTATUS));
		String suppStatus = statusSupp;
		Select s = new Select(selectStatus);
		s.selectByVisibleText(suppStatus);
	}

	public void selectVisitType(String visitTypeSupp) {
		common.explictWaitPresence(20, By.xpath(Elements.SERACHVISITTYPE));
		String suppVisitType = visitTypeSupp;
		Select s = new Select(visitTypeSearch);
		s.selectByVisibleText(suppVisitType);
	}

	public void pdfReport() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		printFirstHraReportButton.click();
		common.explictWaitPresence(5, By.xpath(Elements.SELECTREPORT));
		common.selectByValue(selectReport, 0);
		exportDataButton.click();
		Thread.sleep(20000);
		doneButton.click();
		Thread.sleep(5000);

		Set<String> handles = driver.getWindowHandles();
		String win1 = driver.getWindowHandle();
		handles.remove(win1);
		String win2 = handles.iterator().next();
		driver.switchTo().window(win2);
		common.keyboard_Ctrl_S(driver);
		driver.close();
		driver.switchTo().window(win1);

	}

	public void plainTextReport() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		printFirstHraReportButton.click();
		common.explictWaitPresence(5, By.xpath(Elements.SELECTREPORT));
		common.selectByValue(selectReport, 1);
		exportDataButton.click();
		Thread.sleep(20000);
		doneButton.click();
		Thread.sleep(5000);

		Set<String> handles = driver.getWindowHandles();
		String win1 = driver.getWindowHandle();
		handles.remove(win1);
		String win2 = handles.iterator().next();
		driver.switchTo().window(win2);
		common.keyboard_Ctrl_S(driver);
		driver.close();
		driver.switchTo().window(win1);

	}

	public ArrayList<String> getColumnLabelsOnPHP() {

		int i;
		String lst[] = new String[5];
		ArrayList<String> lst1 = new ArrayList<String>();
		{
			for (i = 0; i < 5; i++) {
				lst[i] = common.readExcel("sites", "columnLabelPHP" + (i + 1));
				lst1.add(lst[i]);
			}

			return lst1;
		}

	}

	public ArrayList<String> expectedSiteOptions() {

		int i;
		String lst[] = new String[8];
		ArrayList<String> lst1 = new ArrayList<String>();
		{
			for (i = 0; i < 8; i++) {
				lst[i] = common.readExcel("sites", "siteOption" + (i + 1));
				lst1.add(lst[i]);
			}

			return lst1;
		}

	}

	// Double Clicking on any webelement
	public void doubleClick(WebDriver driver, WebElement elle) throws InterruptedException {
		// common.implictWait(10);
		// Thread.sleep(10000);
		Actions builder = new Actions(driver);
		builder.doubleClick(elle).build().perform();
		Thread.sleep(7000);
	}

	public ArrayList<String> getSortedFirstNameOnPHPfromDB() throws ClassNotFoundException, SQLException {
		ArrayList<String> lst = new ArrayList<String>();
		int i = 1;

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:sqlserver://192.168.1.51\\VaticaHealth;databasename=VaticaHealthQA", "swsadmin",
				"SeniorWellnessSASpider1!");
		Statement sta = conn.createStatement();

		String Sql2 = "select count(FirstName) from hra where SiteId = 1 ";
		ResultSet rs2 = sta.executeQuery(Sql2);
		while (rs2.next()) {
			int ListSize = Integer.parseInt(rs2.getString(1));
			// System.out.println(ListSize);
		}

		String Sql = "select FirstName from hra where SiteId = 1 order by FirstName asc";
		ResultSet rs = sta.executeQuery(Sql);
		// System.out.println(rs.si);
		while (rs.next()) {
			lst.add(rs.getString("FirstName"));
			// System.out.println(rs.getString("FirstName"));
			// System.out.println(rs.getString("LastName"));
			// boom = rs.getString(2);

		}
		System.out.println(lst.size());
		return lst;
	}

	public ArrayList<String> getSortedLastNameOnPHPfromDB() throws ClassNotFoundException, SQLException {
		ArrayList<String> lst = new ArrayList<String>();
		int i = 1;

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:sqlserver://192.168.1.51\\VaticaHealth;databasename=VaticaHealthQA", "swsadmin",
				"SeniorWellnessSASpider1!");
		Statement sta = conn.createStatement();

		String Sql2 = "select count(LastName) from hra where SiteId = 1 ";
		ResultSet rs2 = sta.executeQuery(Sql2);
		while (rs2.next()) {
			int ListSize = Integer.parseInt(rs2.getString(1));
			// System.out.println(ListSize);
		}

		String Sql = "select LastName from hra where SiteId = 1 order by LastName asc";
		ResultSet rs = sta.executeQuery(Sql);
		// System.out.println(rs.si);
		while (rs.next()) {
			lst.add(rs.getString("LastName"));
			// System.out.println(rs.getString("FirstName"));
			// System.out.println(rs.getString("LastName"));
			// boom = rs.getString(2);

		}
		System.out.println(lst.size());
		return lst;
	}

	public ArrayList<String> getSortedVisitDatesOnPHPfromDB() throws ClassNotFoundException, SQLException {
		ArrayList<String> lst = new ArrayList<String>();
		int i = 1;

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:sqlserver://192.168.1.51\\VaticaHealth;databasename=VaticaHealthQA", "swsadmin",
				"SeniorWellnessSASpider1!");
		Statement sta = conn.createStatement();

		String Sql2 = "select count(1) from hra where SiteId = 1 ";
		ResultSet rs2 = sta.executeQuery(Sql2);
		while (rs2.next()) {
			int ListSize = Integer.parseInt(rs2.getString(1));
			// System.out.println(ListSize);
		}

		String Sql = "select CONVERT(varchar(10),AwvDate ,101) as AwvDate2 from hra where SiteId = 1 order by AwvDate asc";
		ResultSet rs = sta.executeQuery(Sql);
		// System.out.println(rs.si);
		while (rs.next()) {

			if (rs.getString("AwvDate2") != null) {
				lst.add(rs.getString("AwvDate2"));
			}

			else {
				lst.add("");
			}

		}
		System.out.println(lst.size());
		return lst;
	}

	public static void show(ArrayList<String> expectedList) {
		// TODO Auto-generated method stub
		ArrayList<String> lst = expectedList;
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		// System.out.println("Done");
	}
	
	// To verify the sorting of the First Names on the grid on PHP and its consistency on further pages
	public ArrayList<String> getSortedFirstNamesFromPHPGrid() throws InterruptedException {
		common.implictWait(20);
		Thread.sleep(3000);
		FirstNameColumnGrid.click();
		ArrayList<String> listOfFirstNames = new ArrayList<String>();

		while (true) {
			listOfFirstNames.addAll(getItemsFromGrid(Elements.FIRSTNAMESONGRID));
			if (NextBtnOnGrid.isDisplayed() && NextBtnOnGrid.isEnabled()) {
				NextBtnOnGrid.click();
				Thread.sleep(3000);
			} else {
				break;
			}
		}
		System.out.println(listOfFirstNames.size());

		for (int i = 0; i < listOfFirstNames.size(); i++) {
	//		System.out.println(listOfFirstNames.get(i).toString());
		}
		PageToFirstButton.click();
		return listOfFirstNames;
	}
	
	// To verify the sorting of the Last Names on the grid on PHP and its consistency on further pages
		public ArrayList<String> getSortedLastNamesFromPHPGrid() throws InterruptedException {
			common.implictWait(20);
			Thread.sleep(3000);
			LastNameColumnGrid.click();
			ArrayList<String> listOfLastNames = new ArrayList<String>();

			while (true) {
				listOfLastNames.addAll(getItemsFromGrid(Elements.LASTNAMESONGRID));
				if (NextBtnOnGrid.isDisplayed() && NextBtnOnGrid.isEnabled()) {
					NextBtnOnGrid.click();
					Thread.sleep(3000);
				} else {
					break;
				}
			}
			System.out.println(listOfLastNames.size());

			for (int i = 0; i < listOfLastNames.size(); i++) {
				System.out.println(listOfLastNames.get(i).toString());
			}
			PageToFirstButton.click();
			return listOfLastNames;
		}

		// To verify the sorting of the Last Names on the grid on PHP and its consistency on further pages
		public ArrayList<String> getSortedVisitDatesFromPHPGrid() throws InterruptedException {
			common.implictWait(20);
			Thread.sleep(3000);
			VisitDateColumnGrid.click();
			ArrayList<String> listOfVisitDates = new ArrayList<String>();

			while (true) {
				listOfVisitDates.addAll(getItemsFromGrid(Elements.VISITDATEONGRID));
				if (NextBtnOnGrid.isDisplayed() && NextBtnOnGrid.isEnabled()) {
					NextBtnOnGrid.click();
					Thread.sleep(3000);
				} else {
					break;
				}
			}
			System.out.println(listOfVisitDates.size());

			for (int i = 0; i < listOfVisitDates.size(); i++) {
				System.out.println(listOfVisitDates.get(i).toString());
			}
			PageToFirstButton.click();
			return listOfVisitDates;
		}

}
