package com.vaticahealth.vatica.utils;

import org.openqa.selenium.By;

import com.vaticahealth.vatica.pages.Home;
import com.vaticahealth.vatica.tests.TestAnnotation;

public  class Elements extends TestAnnotation{
	Home h = new Home();
	public static final String loginId = "//input[@id='userName']";
	public static final String loginPassword="//input[@id='password']";
	public static final String loginButton="//button[@id='btn-login']";
	public static final String webSiteOption="//div[@id='mdSelectSite']/select";
	public static final String websiteSubmission="//button[text()='Select']";
	public static final String resetButton="//button[@id='btn-reset-password']";
	public static final String logOut="//a[text()='Log Out']";
	public static final String resetEmailId="//div[@class='col-md-7']//input";
	public static final String submitRequest="//div[@class='modal-footer clearfix']//button[2]";
	public static final String resetPasswordMessage="//div[@class='modal-content']//div[2]";
	public static final String rememberMeCheckBox="//input[@id='login-remember']";
	public static final String privacyPolicy="//div[@class='pull-left']//a[1]";
	public static final String techSupport="//div[@class='pull-left']//a[2]";
	public static final String PRIVACYTITLE="//h4[@class='modal-title']";
	public static final String TECHSUPPORTITLE="//a[contains(text(),'Technical')]";
	public static final String PRIVACYPOLICYCLOSE="//button[@class='close']";
	public static final String CANCELTECHSUPPORT="//a[text()='Cancel']";
	public static final String OKBUTTON="//button[text()='OK']";
	public static final String inValidLoginMessgae="//div[contains(@class,'text-danger')]";
	public static final String SEARCHFIRSTNAME="//input[@id='firstName']";
	public static final String SEARCHLASTNAME="//input[@id='lastName']";
	public static final String SEARCHDOBTEXT="//input[@id='dob']";
	public static final String SEARCHDOBCALENDER="//div[@id='homepage']/div/div[1]/form/div[3]/div/span/button";
	public static final String SEARCHVISITCAL ="//div[@id='homepage']/div/div[1]/form/div[4]/div/span/button";
	public static final String SEARCHSTATUS="//div[@id='homepage']/div/div[1]/form/div[5]/select";
	public static final String SERACHVISITTYPE="//div[@id='homepage']/div/div[1]/form/div[6]/select";
	public static final String SEARCHBUTTON="//button[@id='searchButton']";
	public static final String CLEARBUTTON="//button[@id='clearButton']";
	public static final String FIRSTNAME="//div[@class='ui-grid-contents-wrapper']/div[1]/div[2]/div/div[1]/div/div[1]/div/span";
	public static final String LASTPAGEBUTTON="//button[@class='ui-grid-pager-last']";
	public static final String LASTRECORDPARENT="//div[@class='ui-grid-contents-wrapper']/div[1]/div[2]/div/div";
	public static final String LASTCHILDFIRSTNAME="/div/div[1]/div/span";
	public static final String LASTNAME ="//div[@class='ui-grid-contents-wrapper']/div[1]/div[2]/div/div[1]/div/div[2]/div";
	public static final String LASTCHILDLASTNAME="/div/div[2]/div";
	public static final String DOB="//div[@class='ui-grid-contents-wrapper']/div[1]/div[2]/div/div[1]/div/div[1]/div/small";
	public static final String LASTCHILDDOB="/div/div[1]/div/small";
	public static final String TRAVERSEMONTHYEAR="//button[@role='heading']";
	public static final String MOVEBACKCALENDER="//table[@class='uib-daypicker']/thead/tr/th[1]/button";
	public static final String MOVEFORWARDCALENDER="//table[@class='uib-daypicker']/thead/tr/th[1]/button";
	public static final String CALENDERDONEBUTTON="//button[text()='Done']";
	public static final String SEARCHVISITDATETEXT="//input[@id='visitDate']";
	public static final String LASTCHILDVISITDATE="/div/div[3]/div";
	public static final String STATUS="//div[2]/div/div[1]/div/div[4]/div/span";
	public static final String LASTSTATUSCHILD="/div/div[4]/div/span";
	public static final String VISITDATE="//div[2]/div/div[1]/div/div[3]/div";
	public static final String VISITTYPE="//div[2]/div/div[1]/div/div[4]/div/small";
	public static final String LASTVISITTYPECHILD="/div/div[4]/div/small";
	public static final String PHPNORECORD="//div[@id='homepage']/div/div[3]";
	public static final String FIRSTPAGEBUTTON="//button[@class='ui-grid-pager-first']";
	public static final String PRINTFIRSTREPORTBUTTON="//div[@class='ui-grid-contents-wrapper']/div[1]/div[2]/div/div[1]/div/div[5]/div/a[8]/i";
	public static final String SELECTREPORT="//div[@id='mdExport']/div/div/div[2]/form/fieldset/div/div/select";
	public static final String EXPORTDATABUTTON="//div[@id='mdExport']/div/div/div[3]/a";
	public static final String DONEBUTTON="//div[@id='mdExport']/div/div/div[3]/button";
	public static final String SITEONPHP="//a[@class='ng-binding'][contains(text(),' Demo Hospital 1')]";
	public static final String COLUMNSONGRID="//span[@class='ui-grid-header-cell-label ng-binding']";
	public static final String SETTINGS="//*[@role='button'][@data-toggle='dropdown']";
	public static final String LOGINBTN="//*[@id='btn-login']";
	public static final String WELCOMEMSG="//*[contains(text(),'Welcome,')]";
	public static final String ITEMSPERPAGE="//select[@class='ng-pristine ng-untouched ng-valid']";
	public static final String ROWSONGRID="//div[@class='ui-grid-viewport ng-isolate-scope']/div/div";
	public static final String FIRSTNAMESONGRID="//div[@class='ngCellText ui-grid-cell-contents  ng-scope']/span";
	public static final String LASTNAMESONGRID="//div[@class='ngCell ui-grid-cell ng-scope ui-grid-disable-selection ui-grid-coluiGrid-000C']/div";
	public static final String NEXTBTNONGRID="//button[@class='ui-grid-pager-next']";
	public static final String ADDNEWVISIT="//a[text()='Add New Visit']";
	
	
	// HRA page
	public static final String BACKGROUNDINFOLINK = "//div[@id='preVisitWorkListAccordionvhAcc']/div/div[1]/div[1]/a";
	public static final String PREVISITWORKLISTLINK = "//div[@id='preVisitWorkListAccordionvhAcc']/div/div[2]/div[1]/a";
	public static final String SOCIALHISTORYLINK = "//div[@id='hraVerticalAccordionvhAcc']/div/div[2]/div[1]/a";
	public static final String FAMILYHISTORYLINK = "//div[@id='hraVerticalAccordionvhAcc']/div/div[3]/div[1]/a";
	public static final String MEDICALCONDITIONSLINK = "//div[@id='hraVerticalAccordionvhAcc']/div/div[4]/div/a";
	public static final String REVIEWOFSYMTOMSLINK = "//div[@id='hraVerticalAccordionvhAcc']/div/div[5]/div[1]/a";
	public static final String SELFASSESSLINK = "//div[@id='hraVerticalAccordionvhAcc']/div/div[7]/div[1]/a";
	public static final String FALLRISKLINK = "//div[@id='hraVerticalAccordionvhAcc']/div/div[8]/div[1]/a";
	public static final String BIOMETRICSLINK = "//div[@id='awvVerticalAccordionvhAcc']/div/div[1]/div[1]/a";
	public static final String COGNITIVEASSESSLINK = "//div[@id='awvVerticalAccordionvhAcc']/div/div[2]/div[1]/a";
	public static final String SAVE_NEXTBTN = "//a[text()='Save/Next']";
	
		//HRA page - Background Information page
		public static final String MEDICARENUMBER = ".//*[@id='BI16']";
		public static final String FIRSTNAME_BI = "//*[@id='BI1']";
		public static final String LASTNAME_BI = "//*[@id='BI2']";
		public static final String MEDICALRECORDNUMBER = "//*[@id='B14']";
		public static final String GENDER = "//*[@id='BI3']";
		public static final String DOB_BI = "//*[@id='BI4']";
		public static final String ASPIRINYES = "//*[@name='MEV1']";
		public static final String HIGHBLOODPRESSUREMEDYES = "//*[@id='ME4']/label[1]/input";
		public static final String ADDMEDICINE = "//a[@class='btn ng-binding' and @ng-click='addMedication()']";
		public static final String ADDMEDICINENAME = "//*[@id='medicationTable']/tbody/tr[2]/td[1]/input";
		public static final String ADDMEDICINEDOSE = "//*[@id='txtDose0']";
		public static final String ADDMEDICINEUNIT = "//*[@id='unit']";
		public static final String ADDMEDICINEFREQUENCY = "//*[@id='frequency']";
		
	
	// Create a new Visit page
	public static final String MEDICARENUMBER_CV = "//*[@id='medicareNumber']";
	public static final String FIRSTNAME_CV = "//*[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required' and @placeholder='First Name']";
	public static final String LASTNAME_CV = "//*[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required' and @placeholder='Last Name']";
	public static final String DOB_CV = "//*[@id='BI4']";
	public static final String NEXTBTN = "//input[@type='button' and @value='Next']";
	
	// Confirm Patient Eligible details page
	public static final String CONFIRMPATIENTINSUREANCE = "//select[@ng-model='NewHra.ChosenMaPlan']";
	public static final String CONFIRMPATIENTBTN = "//button[text()='Confirm Patient']";
	
	//	Confirm new HRA
	public static final String CONFIRMHRABTN = "//button[@class='btn btn-primary btn-sm' and text()='Confirm']";
		
	

}
