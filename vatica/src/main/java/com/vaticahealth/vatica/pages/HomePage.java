package com.vaticahealth.vatica.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

import mx4j.log.Log4JLogger;
//import vatica_util.Xls_Reader;

public class HomePage {

	public WebDriver driver;

	// Xls_Reader read = new
	// Xls_Reader(System.getProperty("user.dir")+"\\src\\vatica_properties\\vatica_data.xlsx");

	@FindBy(xpath = "//div[@class='col-sm-3']//div[5]//select")
	public WebElement Status;

	@FindBy(xpath = "//div[@class='col-sm-3']//div[6]//select")
	public WebElement visitType;

	@FindBy(linkText = "#homepage")
	public WebElement homePageLink;

	@FindBy(linkText = "#udc")
	public WebElement udcLink;

	@FindBy(linkText = "#provider")
	public WebElement providerLink;

	@FindBy(linkText = "#training")
	public WebElement trainingResourcesLink;

	@FindBy(linkText = "#reports")
	public WebElement reportLink;

	@FindBy(linkText = "#/home/exportbulk")
	public WebElement bulkReportButton;

	@FindBy(linkText = "#/home/createhra")
	public WebElement addNewVisitButton;

	@FindBy(xpath = "//a[text()='Log Out']")
	public WebElement logOutButton;

	@FindBy(xpath = "//a[@role='button']")
	public WebElement settingButton;

	@FindBy(xpath = "//li[@has-permission='SiteAdmin']/descendant::a")
	public WebElement siteAdminoption;

	@FindBy(xpath = "//li[@class='dropdown-submenu pull-left']/a")
	public WebElement changeSite;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//li[2]")
	public WebElement siteName;

	String siteNaming = "Demo Hospital 1";

	/*
	 * @FindBys({
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='1468384642497-grid-container']/div[1]/div/div/div/div/div/div[1]/div/div[1]"
	 * ),
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='1468384642497-grid-container']/div[1]/div/div/div/div/div/div[2]/div/div[1]"
	 * ),
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='1468384642497-grid-container']/div[1]/div/div/div/div/div/div[3]/div/div[1]"
	 * ),
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='1468384642497-grid-container']/div[1]/div/div/div/div/div/div[4]/div/div[1]"
	 * ),
	 * 
	 * @FindBy(xpath=
	 * "//div[@id='1468384642497-grid-container']/div[1]/div/div/div/div/div/div[1]/div/div[1]")
	 * }) public List<WebElement> e;
	 */

	@FindBy(xpath = "//div[@id='1468384642497-grid-container']/div[1]/div/div/div/div/div/div[1]/div/div[1]")
	public WebElement h1;

	@FindBy(xpath = "//div[@id='1468384642497-grid-container']/div[1]/div/div/div/div/div/div[2]/div/div[1]")
	public WebElement h2;

	@FindBy(xpath = "//div[@id='1468384642497-grid-container']/div[1]/div/div/div/div/div/div[3]/div/div[1]")
	public WebElement h3;

	@FindBy(xpath = "//div[@id='1468384642497-grid-container']/div[1]/div/div/div/div/div/div[4]/div/div[1]")
	public WebElement h4;

	@FindBy(xpath = "//div[@id='1468384642497-grid-container']/div[1]/div/div/div/div/div/div[5]/div/div[1]")
	public WebElement h5;

	@FindBy(xpath = "//div[@id='1468388955975-grid-container']/div[2]/div/div[1]/div/div[5]/div/a[2]")
	public WebElement hraButton;

	@FindBy(xpath = "//div[@id='1468392915987-grid-container']/div[2]/div/div[1]/div/div[5]/div/a[2]")
	public WebElement preventionButton;

	@FindBy(xpath = "//div[@id='1468392915987-grid-container']/div[2]/div/div[1]/div/div[5]/div/a[3]")
	public WebElement treatmentbutton;

	@FindBy(xpath = "//div[@id='1468392915987-grid-container']/div[2]/div/div[1]/div/div[5]/div/a[4]")
	public WebElement daignosisButton;

	@FindBy(xpath = "//div[@id='1468392915987-grid-container']/div[2]/div/div[1]/div/div[5]/div/a[5]")
	public WebElement cameraButton;

	@FindBy(xpath = "//div[@id='1468392915987-grid-container']/div[2]/div/div[1]/div/div[5]/div/a[6]")
	public WebElement messagebutton;

	@FindBy(xpath = "//div[@id='1468392915987-grid-container']/div[2]/div/div[1]/div/div[5]/div/a[7]")
	public WebElement printButton;

	@FindBy(xpath = "//div[@id='1468392915987-grid-container']/div[2]/div/div[1]/div/div[5]/div/a[8]")
	public WebElement downloadButton;

	@FindBy(xpath = "//div[@id='1468392915987-grid-container']/div[2]/div/div[1]/div/div[5]/div/a[9]")
	public WebElement settingsButton;

	@FindBy(xpath = "//div[@id='1468392915987-grid-container']/div[2]/div/div[15]/div/div[1]/div")
	public WebElement lastRecord;

	@FindBy(className = "ui-grid-pager-first")
	public WebElement firstPage;

	@FindBy(className = "ui-grid-pager-last")
	public WebElement lastpage;

	@FindBy(xpath = "//button[@title='Page back']")
	public WebElement backButton;

	@FindBy(xpath = "//button[@title='Page forward']")
	public WebElement nextButton;

	@FindBy(xpath = "//select [@ng-model='grid.options.paginationPageSize']")
	public WebElement pageSelectionDropDown;
	
	@FindBy(xpath="//div[@id='1468475051489-grid-container']/div[2]/div/div[1]/div/div[1]/div/span")
	public WebElement firstName ;
	
	@FindBy(xpath="//div[@id='1468475051489-grid-container']/div[2]/div/div[1]/div/div[1]/div/small")
	public WebElement dob;

	public HomePage() {
		driver = new FirefoxDriver();
		PageFactory.initElements(driver, this);
	}

	@Test
	public void launch() {
		driver.get("http://111.125.141.74/hulk.VaticaHealth.Web.UI");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("providerdemo@vaticahealth.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("swsdemotest");
		driver.findElement(By.xpath("//button[@id='btn-login']")).click();
		WebElement k = driver.findElement(By.xpath("//div[@id='mdSelectSite']/select"));
		Select s = new Select(k);
		s.selectByVisibleText("Demo Hospital 1");
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-scope']")).click();
	}

	@Test
	public void homePageButton() {
		try {
			Assert.assertTrue(homePageLink.isDisplayed());
		} catch (Exception e) {
			Reporter.log("Home page not present");
		}
	}

	@Test
	public void udcButton() {
		try {
			Assert.assertTrue(udcLink.isDisplayed());
		} catch (Exception e) {
			Reporter.log("UDC link not present");
		}
	}

	@Test
	public void ProviderButton() {

		try {
			Assert.assertTrue(providerLink.isDisplayed());
		} catch (Exception e) {
			Reporter.log("Provider link not present");
		}
	}

	@Test
	public void trainingResourceButton() {
		try {
			Assert.assertTrue(trainingResourcesLink.isDisplayed());
		} catch (Exception e) {
			Reporter.log("Training Resource link not present");
		}
	}

	@Test
	public void reportLink() {
		try {
			Assert.assertTrue(reportLink.isDisplayed());
		} catch (Exception e) {
			Reporter.log("Report link not present");
		}
	}

	@Test
	public void bulkReportButton() {

		try {
			Assert.assertTrue(bulkReportButton.isDisplayed());
		} catch (Exception e) {
			Reporter.log("Bulk Report button is not present");
		}
	}

	@Test
	public void addNewVisitButton() {

		try {
			Assert.assertTrue(addNewVisitButton.isDisplayed());
		} catch (Exception e) {
			Reporter.log("Add new visist button is not present");
		}
	}

	@Test
	public void logoutButton() {
		try {
			Assert.assertTrue(logOutButton.isDisplayed());
		} catch (Exception e) {
			Reporter.log("Logout button is not present");
		}
	}

	@Test
	public void settingsButton() {
		try {
			settingButton.click();
			Actions a = new Actions(driver);
			a.moveToElement(changeSite).build().perform();
			String[] array = new String[8];
			for (int i = 0; i <= 8; i++) {
				WebElement option = driver
						.findElement(By.xpath("//li[@class='dropdown-submenu pull-left']//ul/li[" + i + "]"));
				array[i] = option.getText();
			}

		} catch (Exception e) {
			Reporter.log("Seetings button not present ");
		}
	}

	@Test
	public void siteName() {
		try {
			Assert.assertEquals(siteName.getText(), siteNaming);
		} catch (Exception e) {
			Reporter.log("Logout button is not present");
		}
		System.out.println("end");
	}

	@Test
	public void listHeader() {
		/*
		 * String[] s = new String[4];
		 * 
		 * for (WebElement item :e) {
		 * 
		 * s[0]=item.getText(); s[1]=item.getText(); s[2]=item.getText();
		 * s[3]=item.getText(); s[4]=item.getText();
		 * 
		 * }
		 */
		Assert.assertEquals(h1.getText(), "First Name");
		Assert.assertEquals(h2.getText(), "Last Name");
		Assert.assertEquals(h3.getText(), "Visit Date");
		Assert.assertEquals(h4.getText(), "Status/Type");
		Assert.assertEquals(h5.getText(), "Actions");

	}

	@Test
	public void hraAction() {
		Assert.assertTrue(hraButton.isDisplayed());

	}

	@Test
	public void preventionAction() {
		Assert.assertTrue(preventionButton.isDisplayed());
	}

	@Test
	public void treatmentButton() {
		Assert.assertTrue(treatmentbutton.isDisplayed());
	}

	@Test
	public void daignosisButton() {
		Assert.assertTrue(daignosisButton.isDisplayed());
	}

	@Test
	public void cameraButton() {
		Assert.assertTrue(cameraButton.isDisplayed());
	}

	@Test(enabled = false)
	public void messageButton() {
		Assert.assertTrue(messagebutton.isDisplayed());
	}

	@Test
	public void printButton() {
		Assert.assertTrue(printButton.isDisplayed());
	}

	@Test
	public void downloadButton() {
		downloadButton.isDisplayed();
	}

	@Test
	public void settingButton() {
		settingsButton.isDisplayed();
	}

	@Test
	public void lastHRARecord() {
		lastRecord.isDisplayed();
		Assert.assertNotNull(lastRecord.getText());
	}

	@Test
	public void moveFirstPage() {
		Assert.assertTrue(firstPage.isDisplayed());
	}

	@Test
	public void movelastRecord() {
		Assert.assertTrue(lastpage.isDisplayed());
	}

	@Test
	public void moveToPreviousPage() {
		Assert.assertTrue(backButton.isDisplayed());
	}

	@Test
	public void moveToNextPage() {
		Assert.assertTrue(nextButton.isDisplayed());
	}

	@Test
	public void selectPageDropDown() {

		String a[] = new String[4];
		List<WebElement> l = null;
		Assert.assertTrue(pageSelectionDropDown.isDisplayed());
		Select s = new Select(pageSelectionDropDown);
		for (int i = 0; i < a.length; i++) {
			l = s.getOptions();
		}
		int i = 0;
		for (WebElement e : l) {
			a[i] = e.getText();
			i++;
		}
		Assert.assertEquals(a[0], 5);
		Assert.assertEquals(a[1], 10);
		Assert.assertEquals(a[2], 15);
		Assert.assertEquals(a[3], 50);

	}
	@Test
	public void assertFirstName()
	{
		Assert.assertNull(firstName.getText());
	}
	@Test
	public void assertDOB()
	{
		Assert.assertNotNull(dob.getText());
	}

}
