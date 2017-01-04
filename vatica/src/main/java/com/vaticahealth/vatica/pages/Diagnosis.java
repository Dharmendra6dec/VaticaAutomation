package com.vaticahealth.vatica.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class Diagnosis {

	WebDriver driver = Configuration.driver;
	CommonCode common = new CommonCode();

	@FindBy(xpath = Elements.HOMECOUNT)
	public WebElement HomeCount;

	@FindBy(xpath = Elements.REJECTEDCOUNT)
	public WebElement RejectedCount;

	@FindBy(xpath = Elements.ACCEPTEDCOUNT)
	public WebElement AcceptedCount;

	@FindBy(xpath = Elements.DISEASE1ACCEPT)
	public WebElement Disease1Accept;

	@FindBy(xpath = Elements.DISEASE2ACCEPT)
	public WebElement Disease2Accept;

	@FindBy(xpath = Elements.DISEASE3ACCEPT)
	public WebElement Disease3Accept;

	@FindBy(xpath = Elements.DISEASE4REJECT)
	public WebElement Disease4Reject;

	@FindBy(xpath = Elements.DISEASE5REJECT)
	public WebElement Disease5Reject;

	@FindBy(xpath = Elements.DISEASE6REJECT)
	public WebElement Disease6Reject;

	@FindBy(xpath = Elements.CONDITIONNOTEXIST)
	public WebElement ConditionsNotExist;

	@FindBy(xpath = Elements.REJECTCOMMENTS)
	public WebElement RejectComments;

	@FindBy(xpath = Elements.CONFIRMREJECTBTN)
	public WebElement ConfirmRejectButton;

	@FindBy(xpath = Elements.FIRSTICDCODESELECTION)
	public WebElement FirstIcdCodeSelect;

	@FindBy(xpath = Elements.ACCEPTNEXTBTN)
	public WebElement AcceptNextBtn;

	@FindBy(xpath = Elements.CONTINUETOMONITORCB)
	public WebElement ContinueToMonitorCB;

	@FindBy(xpath = Elements.EKGCB)
	public WebElement EkgCB;

	@FindBy(xpath = Elements.EKGDATE)
	public WebElement EkgDate;

	@FindBy(xpath = Elements.INREMISSIONCB)
	public WebElement InRemissionCB;

	@FindBy(xpath = Elements.SAVE_NEXTBTN)
	public WebElement SaveNextBtn;

	@FindBy(xpath = Elements.CONTINUECURRENTTREATMENTCB)
	public WebElement ContinueCurrentTreatmentCB;

	@FindBy(xpath = Elements.MEATMEDICATIONCB)
	public WebElement MeatMedicationCB;

	@FindBy(xpath = Elements.MEATCOMMENTS)
	public WebElement MeatComments;

	@FindBy(xpath = Elements.ESIGNVERIFICATIONMSG)
	public WebElement EsignSuccessMsg;

	@FindBy(xpath = Elements.ESIGNSUCCESSOK)
	public WebElement EsignSuccessOk;

	/*
	 * @FindBy(xpath= Elements.SIGNBTN) public WebElement SignBtn;
	 */

	@FindBy(xpath = Elements.MEATSAVECHANGESBTN)
	public WebElement MeatSaveChangesBtn;

	public Diagnosis() {
		PageFactory.initElements(driver, this);
	}

	// Click on the Sign HRA button
	public void clickSignHra() throws InterruptedException {
		List<WebElement> lst = driver.findElements(By.xpath(Elements.SIGNBTN));
		System.out.println(lst.size());

		for (int i = 0; i < lst.size(); i++) {
			try {
				lst.get(i).click();
				System.out.println("OK button clicked");
				break;
			} catch (org.openqa.selenium.NoSuchElementException e) {
				e.getMessage();
				System.out.println("Incorrect element : No such element");
			} catch (org.openqa.selenium.ElementNotVisibleException e) {
				System.out.println("Incorrect element : Element not visible");
			}

		}
		
		if (lst.size()==2) {
			WebElement elle = driver.findElement(By.xpath(Elements.SAVE_NEXTBTN));
			Thread.sleep(2000);
			elle.sendKeys(Keys.TAB);
			elle.sendKeys(Keys.TAB);
			Thread.sleep(2000);
			elle.sendKeys(Keys.ENTER);
		}
		// lst.get(2).click();

	}

}
