package com.vaticahealth.vatica.pages;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
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
import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class PHP {
	WebDriver driver = Configuration.driver;
	CommonCode common = new CommonCode();

	@FindBy(xpath = Elements.logOut)
	public WebElement logOut;
	
	// Doe HRA
	@FindBy(xpath="//div[text()='DOE40217']")
	public WebElement DoeHra;

	@FindBy(xpath = Elements.SEARCHFIRSTNAME)
	public WebElement firstNameSearch;

	@FindBy(xpath = Elements.SEARCHBUTTON)
	public WebElement searchButton;

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
	
	@FindBy(xpath= Elements.ADDNEWVISIT)
	public WebElement AddNewVisitBtn;

	@FindBy(xpath = Elements.DOB)
	public WebElement dob;

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

	public PHP() {
		PageFactory.initElements(driver, this);
	}

	public String siteOnPhp() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return siteOnPhp.getText();

	}

	public void logOut() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logOut.click();

	}

	public String getFirstNamesthruDBConnect() throws ClassNotFoundException, SQLException {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://111.125.141.74;databaseName=VaticaHealthLog",
				"user=swsadmin", "password=SeniorWellnessSASpider1!");
		System.out.println("test");
		String boom = null;
		Statement sta = conn.createStatement();
		String Sql = "select top 223 FirstName, HraId from Hra where siteId = 1 order by FirstName asc ";
		ResultSet rs = sta.executeQuery(Sql);
		while (rs.next()) {
			boom = rs.getString(1);

		}
		return boom;
	}

	public List<WebElement> getfirstNamesOnGrid() {
		List<WebElement> lst = driver.findElements(By.xpath(Elements.FIRSTNAMESONGRID));
		// System.out.println(lst);
		return lst;

	}

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

	public void reports(String reportToBePrinted) throws InterruptedException {
		String suppReportToBePrinted = reportToBePrinted;
		Thread.sleep(5000);
		printFirstHraReportButton.click();
		common.explictWaitPresence(5, By.xpath(Elements.SELECTREPORT));
		Select s = new Select(selectReport);
		s.selectByVisibleText(reportToBePrinted);
		exportDataButton.click();
		Set<String> h = driver.getWindowHandles();
		System.out.println(h.size());
		int i = 1;
		for (String m : h) {
			if (i == 2) {
				driver.switchTo().window(m);
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@id='download']")).click();
			}
			i++;

		}

		/*
		 * Actions a = new Actions(driver);
		 * a.sendKeys(Keys.CONTROL,Keys.TAB).build().perform();
		 * System.out.println(driver.getTitle());
		 */

	}

	public ArrayList<String> getColumnLabelsOnPHP() {

		int i;
		String lst[] = new String[5];
		ArrayList<String> lst1 = new ArrayList<String>();
		{
			for (i = 0; i < 5; i++) {
				lst[i] = common.readExcel("get_values", "columnLabelPHP" + (i + 1));
				lst1.add(lst[i]);
			}

			return lst1;
		}

	}
	
	// Double Clicking on any webelement
			public void doubleClick(WebDriver driver, WebElement elle) throws InterruptedException{
			//	common.implictWait(10);
			//	Thread.sleep(10000);
				Actions builder = new Actions(driver);
				builder.doubleClick(elle).build().perform();
				Thread.sleep(7000);
			}

}
