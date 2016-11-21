package com.vaticahealth.vatica.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.utils.CommonCode;		
import com.vaticahealth.vatica.utils.Elements;

public class Hra {
	
	CommonCode common = new CommonCode();
	WebDriver driver = Configuration.driver;
	Home home = new Home();
	
	@FindBy(xpath=Elements.BACKGROUNDINFOLINK)
	public WebElement BackgroundInformationLink;
	
	@FindBy(xpath=Elements.PREVISITWORKLISTLINK)
	public WebElement PreVisitWorkListLink; 

	@FindBy(xpath=Elements.SOCIALHISTORYLINK)
	public WebElement SocialHistoryLink;
	
	@FindBy(xpath=Elements.FAMILYHISTORYLINK)
	public WebElement FamilyHistoryLink;
	
	@FindBy(xpath=Elements.MEDICALCONDITIONSLINK)
	public WebElement MedicalConditionsLink;
	
	@FindBy(xpath=Elements.REVIEWOFSYMTOMSLINK)
	public WebElement ReviewOfSymptomsLink;
	
	@FindBy(xpath=Elements.SELFASSESSLINK)
	public WebElement SelfAssessmentLink;
	
	@FindBy(xpath=Elements.FALLRISKLINK)
	public WebElement FallRiskLink;
	
	@FindBy(xpath=Elements.BIOMETRICSLINK)
	public WebElement BiometricsLink;
	
	@FindBy(xpath=Elements.COGNITIVEASSESSLINK)
	public WebElement CognitiveAssessmentLink;
	
	
	// Background Information Page
	
	@FindBy(xpath=Elements.MEDICARENUMBER)
	public WebElement MedicareNumber;
	
	@FindBy(xpath=Elements.FIRSTNAME_BI)
	public WebElement FirstName;
	
	@FindBy(xpath=Elements.LASTNAME_BI)
	public WebElement LastName;
	
	@FindBy(xpath=Elements.MEDICALRECORDNUMBER)
	public WebElement MedicalRecordNumber;
	
	@FindBy(xpath=Elements.GENDER)
	public WebElement Gender;
	
	@FindBy(xpath=Elements.DOB_BI)
	public WebElement DOB;
	
	@FindBy(xpath=Elements.ASPIRINYES)
	public WebElement AspirinYes;
	
	@FindBy(xpath=Elements.HIGHBLOODPRESSUREMEDYES)
	public WebElement HighBloodPressureMedYes;
	
	@FindBy(xpath=Elements.ADDMEDICINE)
	public WebElement AddMedicine;
	
		@FindBy(xpath=Elements.ADDMEDICINENAME)
		public WebElement AddMedicine_Name;
		
		@FindBy(xpath=Elements.ADDMEDICINEDOSE)
		public WebElement AddMedicineDose;
		
		@FindBy(xpath=Elements.ADDMEDICINEUNIT)
		public WebElement AddMedicineUnit;
	
		@FindBy(xpath=Elements.ADDMEDICINEFREQUENCY)
		public WebElement AddMedicineFrequency;
		
	@FindBy(xpath=Elements.SAVE_NEXTBTN)
	public WebElement Save_NextBtn;
	
	
	public Hra() {
		PageFactory.initElements(driver, this);
	}


}
