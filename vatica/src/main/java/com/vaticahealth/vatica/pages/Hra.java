package com.vaticahealth.vatica.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vaticahealth.vatica.config.Configuration;
import com.vaticahealth.vatica.utils.CommonCode;
import com.vaticahealth.vatica.utils.Elements;

public class Hra {

	CommonCode common = new CommonCode();
	WebDriver driver = Configuration.driver;
	// Hra hra = new Hra();

	// Tabs

	@FindBy(xpath = Elements.HOMETAB)
	public WebElement HomeTab;

	@FindBy(xpath = Elements.HRATAB)
	public WebElement HraTab;

	@FindBy(xpath = Elements.TESTSTAB)
	public WebElement TestsTab;

	@FindBy(xpath = Elements.DIAGNOSTICSTAB)
	public WebElement DiagnosticsTab;

	@FindBy(xpath = Elements.SNAPSHOTTAB)
	public WebElement SnapshotTab;

	@FindBy(xpath = Elements.COMMENTSTAB)
	public WebElement CommentsTab;

	@FindBy(xpath = Elements.BACKGROUNDINFOLINK)
	public WebElement BackgroundInformationLink;

	@FindBy(xpath = Elements.PREVISITWORKLISTLINK)
	public WebElement PreVisitWorkListLink;

	@FindBy(xpath = Elements.SOCIALHISTORYLINK)
	public WebElement SocialHistoryLink;

	@FindBy(xpath = Elements.FAMILYHISTORYLINK)
	public WebElement FamilyHistoryLink;

	@FindBy(xpath = Elements.MEDICALCONDITIONSLINK)
	public WebElement MedicalConditionsLink;

	@FindBy(xpath = Elements.REVIEWOFSYMTOMSLINK)
	public WebElement ReviewOfSymptomsLink;

	@FindBy(xpath = Elements.SELFASSESSLINK)
	public WebElement SelfAssessmentLink;

	@FindBy(xpath = Elements.FALLRISKLINK)
	public WebElement FallRiskLink;

	@FindBy(xpath = Elements.BIOMETRICSLINK)
	public WebElement BiometricsLink;

	@FindBy(xpath = Elements.COGNITIVEASSESSLINK)
	public WebElement CognitiveAssessmentLink;

	// Background Information Page

	@FindBy(xpath = Elements.MEDICARENUMBER)
	public WebElement MedicareNumber;

	@FindBy(xpath = Elements.FIRSTNAME_BI)
	public WebElement FirstName;

	@FindBy(xpath = Elements.LASTNAME_BI)
	public WebElement LastName;

	@FindBy(xpath = Elements.MEDICALRECORDNUMBER)
	public WebElement MedicalRecordNumber;

	@FindBy(xpath = Elements.GENDER)
	public WebElement Gender;

	@FindBy(xpath = Elements.DOB_BI)
	public WebElement DOB;

	@FindBy(xpath = Elements.ASPIRINYES)
	public WebElement AspirinYes;

	@FindBy(xpath = Elements.HIGHBLOODPRESSUREMEDYES)
	public WebElement HighBloodPressureMedYes;

	@FindBy(xpath = Elements.ADDMEDICINE)
	public WebElement AddMedicine;

	@FindBy(xpath = Elements.ADDMEDICINENAME)
	public WebElement AddMedicine_Name;

	@FindBy(xpath = Elements.ADDMEDICINEDOSE)
	public WebElement AddMedicineDose;

	@FindBy(xpath = Elements.ADDMEDICINEUNIT)
	public WebElement AddMedicineUnit;

	@FindBy(xpath = Elements.ADDMEDICINEFREQUENCY)
	public WebElement AddMedicineFrequency;

	// Pre-Visit Work List Page

	@FindBy(xpath = Elements.FLUSHOTYES)
	public WebElement FluShotYes;

	@FindBy(xpath = Elements.FLUDATE)
	public WebElement FluDate;

	@FindBy(xpath = Elements.HEMOGLOBINA1CYES)
	public WebElement HemoglobinA1cYes;

	@FindBy(xpath = Elements.HEMOGLOBINA1CDATE)
	public WebElement HemoglobinA1cDate;

	@FindBy(xpath = Elements.HEMOGLOBINA1CVALUE)
	public WebElement HemoglobinA1cValue;

	@FindBy(xpath = Elements.PSAYES)
	public WebElement PsaYes;

	@FindBy(xpath = Elements.PSADATE)
	public WebElement PsaDate;

	@FindBy(xpath = Elements.GLOMERULERYES)
	public WebElement GlomerulerYes;

	@FindBy(xpath = Elements.GLOMERULERDATE)
	public WebElement GlomerulerDate;

	@FindBy(xpath = Elements.GLOMERULERSELECT)
	public WebElement GlomerulerSelect;

	// Social History Page

	@FindBy(xpath = Elements.ILLEGALDRUGUSEYES)
	public WebElement IllegalDrugsYes;

	@FindBy(xpath = Elements.COCAINE)
	public WebElement Cocaine;

	@FindBy(xpath = Elements.DEPENDENCYCURRENT)
	public WebElement DependencyCurrent;

	@FindBy(xpath = Elements.DRUGCOMPLICATIONS)
	public WebElement DrugComplications;

	@FindBy(xpath = Elements.ALCOHOLDEPENDENCYCURRENT)
	public WebElement AlcoholDependency;

	@FindBy(xpath = Elements.ALCOHOLCOMPLICATIONS)
	public WebElement AlcoholComplications;

	// Family History Page

	@FindBy(xpath = Elements.COLONPOLYPSYES)
	public WebElement ColonYes;

	@FindBy(xpath = Elements.STROKEYES)
	public WebElement StrokeYes;

	// Medical Conditions Page

	@FindBy(xpath = Elements.GLAUCOMA)
	public WebElement Glaucoma;

	@FindBy(xpath = Elements.GLAUCOMAPRE)
	public WebElement GlaucomaPre;

	@FindBy(xpath = Elements.HHD)
	public WebElement HHD;

	@FindBy(xpath = Elements.HHDWITHHEARTDISEASE)
	public WebElement HHDWithHearthDisease;

	// Review of Symptoms(ROS) Page

	@FindBy(xpath = Elements.ROSALLNO)
	public WebElement ROSAllNo;

	// Self-Assessment Page

	@FindBy(xpath = Elements.HEALTHFAIR)
	public WebElement FairHealth;

	@FindBy(xpath = Elements.LITTLEDIFFICULTYINWALKING)
	public WebElement LittleDifficultyInWalking;

	// Fall Risk Page

	@FindBy(xpath = Elements.FALLRISKALLNO)
	public WebElement FallRiskAllNo;

	// Cognitive Assessment Page

	@FindBy(xpath = Elements.NUMBEROFITEMS2)
	public WebElement NumberOfItems2;

	@FindBy(xpath = Elements.CLOCKDRAWINGTESTNORMAL)
	public WebElement ClockDrawingTestNormal;

	// Biometrics Page

	@FindBy(xpath = Elements.VISITDATEBIO)
	public WebElement VisitDateBio;

	@FindBy(xpath = Elements.SAVE_NEXTBTN)
	public WebElement Save_NextBtn;

	public Hra() {
		PageFactory.initElements(driver, this);
	}

	public void selectByValue(WebElement elle, int sel) throws InterruptedException {
		common.implictWait(10);
		Thread.sleep(5000);
		Select select = new Select(elle);
		select.selectByIndex(sel);

	}

}
