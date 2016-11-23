package com.vaticahealth.vatica.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sun.jna.platform.win32.OaIdl.ELEMDESC;
import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class CreateHRA {
	WebDriver driver = Configuration.driver;
	CommonCode common = new CommonCode();
	

	@FindBy(xpath = Elements.MEDICARENUMBER_CV)
	public WebElement MedicareNumber;

	@FindBy(xpath = Elements.FIRSTNAME_CV)
	public WebElement FirstName;

	@FindBy(xpath = Elements.LASTNAME_CV)
	public WebElement LastName;

	@FindBy(xpath = Elements.DOB_CV)
	public WebElement DOB;

	@FindBy(xpath = Elements.NEXTBTN)
	public WebElement NextBtn;
	

	@FindBy(xpath = Elements.CONFIRMPATIENTINSUREANCE)
	public WebElement ConfirmPatientInsurance;
	
	@FindBy(xpath = Elements.CONFIRMPATIENTBTN)
	public WebElement ConfirmPatientBtn;
	
	@FindBy(xpath = Elements.CONFIRMHRABTN)
	public WebElement ConfirmNewHraBtn;
	
	public CreateHRA() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectByValue(WebElement elle, int sel) throws InterruptedException {
		common.implictWait(10);
		Thread.sleep(5000);
		Select select = new Select(elle);
		select.selectByIndex(sel);
		
	}
	
}
