package com.vaticahealth.vatica.pages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class Home {
	WebDriver driver = Configuration.driver;
	CommonCode common = new CommonCode();

	@FindBy(xpath = Elements.logOut)
	public WebElement logOut;

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
	public static List<WebElement> columnsOnGrid;
	
	@FindBy(xpath = Elements.ROWSONGRID)
	public static List<WebElement> rowsOnGrid;

	@FindBy(xpath = Elements.LASTNAME)
	public WebElement lastName;

	@FindBy(xpath = Elements.SEARCHDOBTEXT)
	public WebElement dobTextSearch;

	@FindBy(xpath = Elements.TRAVERSEMONTHYEAR)
	public WebElement traversedmonthYear;

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

	public Home() {
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
		WebElement elle = driver.findElement(By.xpath("//select[@class='ng-pristine ng-untouched ng-valid']"));
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

}
