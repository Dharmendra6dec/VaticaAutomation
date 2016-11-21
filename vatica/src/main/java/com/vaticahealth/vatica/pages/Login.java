package com.vaticahealth.vatica.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class Login {
	CommonCode common = new CommonCode();
	WebDriver driver = Configuration.driver;
	Home home = new Home();
	// String url = Configuration.invokeUrl();

	@FindBy(xpath = Elements.loginId)
	public WebElement loginId;

	@FindBy(xpath = Elements.loginPassword)
	public WebElement loginPassword;

	@FindBy(xpath = Elements.loginButton)
	public WebElement loginbutton;

	@FindBy(xpath = Elements.webSiteOption)
	public WebElement webSiteOption;

	@FindBy(xpath = Elements.websiteSubmission)
	public WebElement websiteSubmission;

	@FindBy(xpath = Elements.resetButton)
	public WebElement resetButton;

	@FindBy(xpath = Elements.resetEmailId)
	public WebElement resetEmailId;

	@FindBy(xpath = Elements.submitRequest)
	public WebElement submitRequest;

	@FindBy(xpath = Elements.resetPasswordMessage)
	public WebElement resetPasswordMessage;

	@FindBy(xpath = Elements.rememberMeCheckBox)
	public WebElement rememberMeCheckBox;

	@FindBy(xpath = Elements.privacyPolicy)
	public WebElement privacPolicyLink;

	@FindBy(xpath = Elements.techSupport)
	public WebElement techSupportLink;

	@FindBy(xpath = Elements.PRIVACYTITLE)
	public WebElement privacyTitle;

	@FindBy(xpath = Elements.TECHSUPPORTITLE)
	public WebElement techSupportTitle;

	@FindBy(xpath = Elements.PRIVACYPOLICYCLOSE)
	public WebElement closePrivacyPolicy;

	@FindBy(xpath = Elements.CANCELTECHSUPPORT)
	public WebElement cancelTechSupport;

	@FindBy(xpath = Elements.OKBUTTON)
	public WebElement okButton;

	@FindBy(xpath = Elements.inValidLoginMessgae)
	public WebElement invalidLoginMess;

	public Login() {
		PageFactory.initElements(driver, this);
	}

	public void logging(String Id, String password) {
		String logId1 = Id;
		String logPassword1 = password;
		loginId.sendKeys(logId1);
		loginPassword.sendKeys(logPassword1);
	}

	public void loginButton() {
		loginbutton.click();
	}

	public void resetbutton() {
		resetButton.click();
	}

	public void websiteDropDown(int websiteSelectionSupp) throws InterruptedException {
		common.implictWait(10);
		Thread.sleep(3000);
		//webSiteOption.click();
		Select select = new Select(webSiteOption);
		//Thread.sleep(5000);
		select.selectByIndex(websiteSelectionSupp);
	}

	public void selectWebsiteButton() {
		common.explictWaitClickable(20, websiteSubmission);
		websiteSubmission.click();
	}

	public void resetPassword(String emailId, String passwordResetMessage) {
		common.implictWait(10);
		resetButton.click();
		resetEmailId.sendKeys(emailId);
		submitRequest.click();
		Assert.assertEquals(resetPasswordMessage.getText(), passwordResetMessage);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		okButton.click();

	}

	public void rememberMeOption() {

		rememberMeCheckBox.click();

	}

	public void privacyPolicy(String privacyTitleInput) {
		common.implictWait(10);
		privacPolicyLink.click();
		common.explictWaitPresence(5, By.xpath(Elements.PRIVACYTITLE));
		Assert.assertEquals(privacyTitle.getText(), privacyTitleInput);

	}

	public void closePrivacyPolicy() {
		closePrivacyPolicy.click();
	}

	public void technicalSupportLink(String techSupportInputText) {
		common.implictWait(10);
		techSupportLink.click();
		common.explictWaitPresence(5, By.xpath(Elements.TECHSUPPORTITLE));
		Assert.assertEquals(techSupportTitle.getText(), techSupportInputText);
	}

	public void cancelTechSupport() {
		cancelTechSupport.click();
	}

	public void clearInputField() {
		common.implictWait(10);
		loginId.clear();
		loginPassword.clear();
	}

}
