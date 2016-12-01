package com.vaticahealth.vatica.utils;

import org.openqa.selenium.By;

import com.vaticahealth.vatica.pages.PHP;
import com.vaticahealth.vatica.tests.TestAnnotation;

public  class Elements extends TestAnnotation{
	PHP h = new PHP();
	
	// Login and PHP page
	public static final String VATICAlOGO = "html/body/div[1]/div/div[1]/div[1]/div/div[1]/a/img";
	public static final String loginId = "//input[@id='userName']";
	public static final String loginPassword="//input[@id='password']";
	public static final String loginButton="//button[@id='btn-login']";
	public static final String webSiteOption="//*[@id='mdSelectSite']/select";
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
	public static final String SITEONPHP="html/body/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/ul/li[4]/a";
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
	
		// Search related
		public static final String SEARCHGRIDFIRSTNAME = "//div[@class='ui-grid-canvas']/div/div/div[1]/div/span";
		public static final String SEARCHGRIDLASTNAME = "//div[@class='ui-grid-canvas']/div/div/div[2]/div";
		public static final String SEARCHGRIDDOB = "//div[@class='ui-grid-canvas']/div/div/div[1]/div/small";
		public static final String SEARCHGRIDDOV = "//div[@class='ui-grid-canvas']/div/div/div[3]/div";

		//Grid related 
		 public static final String HRA="//a[text()='H']";
		 public static final String PPP="//a[text()='P']";
		 public static final String Test="//a[text()='T']";
		 public static final String Diagnosis="//a[text()='D']";
		 public static final String Snapshot="//a[contains (@href, '#/home/Snapshot')]";
		 public static final String Comment="//a[contains (@ng-click, 'showProviderComments')]";
		 public static final String Printforms="//a[contains (@ng-click, 'showPrint')]";
		 public static final String MedicalRecords="//a[contains (@ng-click, 'showExport')]";
		 public static final String Admin="//a[contains (@ng-click, 'showAdminAction')]";

// Create a new Visit page
	public static final String MEDICARENUMBER_CV = "//*[@id='medicareNumber']";
	public static final String FIRSTNAME_CV = "//*[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required' and @placeholder='First Name']";
	public static final String LASTNAME_CV = "//*[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required' and @placeholder='Last Name']";
	public static final String DOB_CV = "//*[@id='BI4']";
	public static final String NEXTBTN = "//input[@type='button' and @value='Next']";
	
	// Confirm Patient Eligible details page
	public static final String CONFIRMPATIENTINSUREANCE = "//select[@ng-model='NewHra.ChosenMaPlan']";
	public static final String CONFIRMPATIENTBTN = "//button[text()='Confirm Patient']";
	public static final String FIRSTNAMEVALUE = ".//*[@id='frmCreateHRA']/div/div[1]/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[2]";
	public static final String LASTNAMEVALUE = ".//*[@id='frmCreateHRA']/div/div[1]/div[2]/div[1]/div[1]/table/tbody/tr[3]/td[2]";
	public static final String DOBVALUE = ".//*[@id='frmCreateHRA']/div/div[1]/div[2]/div[1]/div[1]/table/tbody/tr[4]/td[2]";
	public static final String MEDICAREVALUE = ".//*[@id='frmCreateHRA']/div/div[1]/div[2]/div[1]/div[1]/table/tbody/tr[5]/td[2]";
	
	//	Confirm new HRA
	public static final String CONFIRMHRABTN = "//button[@class='btn btn-primary btn-sm' and text()='Confirm']";
	
	
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
	public static final String HOMETAB = "//a[@href='#/home/provider' and @class='grid-action-button top-btn']";
	public static final String HRATAB = "//a[text()='H']";
	public static final String PPPTAB = "//a[text()='P']";
	public static final String TESTSTAB = "//a[text()='T']";
	public static final String DIAGNOSTICSTAB = "//a[text()='D']";
	public static final String SNAPSHOTTAB = "//*[@id='main-wrap']/div[1]/div/div/div[2]/div/div[1]/div/a[6]";
	public static final String COMMENTSTAB = "//a[@ng-click='showCommentsView();']";
	
	
	public static final String SAVE_NEXTBTN = "//button[@data-ng-click='saveAndOpenEsignPopup()']";
	
		//HRA page - Background Information page
		public static final String MEDICARENUMBER = "//*[@id='BI16']";
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
		
		//HRA page - Pre-Visit Work List page
		public static final String FLUSHOTYES = "//input[@type='radio' and @name='TV45']";
		public static final String FLUDATE = "//input[@id='T23LD']";
		public static final String HEMOGLOBINA1CYES = "//input[@type='radio' and @name='TV97']";
		public static final String HEMOGLOBINA1CDATE = "//input[@id='T37LD']";
		public static final String HEMOGLOBINA1CVALUE = "//input[@id='T37H']";
		public static final String PSAYES = "//input[@type='radio' and @name='TV41']";
		public static final String PSADATE = "//input[@id='T21LD']";
		public static final String GLOMERULERYES = "//input[@name='DLV10' and @type='radio']";
		public static final String GLOMERULERDATE = "//input[@id='DL4D']";
		public static final String GLOMERULERSELECT = "//select[@id='DL5']";
		
		//HRA page - Social History page
		public static final String ILLEGALDRUGUSEYES = "//input[@type='radio' and @value='LSV131']";
			public static final String COCAINE = "//input[@id='LS111']";
				public static final String DEPENDENCYCURRENT = "//input[@value='LSV136']";
					public static final String DRUGCOMPLICATIONS = "//*[@id='LS68']";
					
		public static final String ALCOHOLDEPENDENCYCURRENT = "//input[@value='LSV200']";
			public static final String ALCOHOLCOMPLICATIONS = "//*[@id='LS109']";
			
		//HRA page - Family History page
		public static final String COLONPOLYPSYES = "//input[@value='FHV19']";
		public static final String STROKEYES = "//input[@value='FHV7']"; 
		
		//HRA page - Medical Conditions
		public static final String GLAUCOMA = "//input[@id='PH503']";
		public static final String GLAUCOMAPRE = "//input[@id='PH504']";
		public static final String HHD = "//input[@id='PH889']";
		public static final String HHDWITHHEARTDISEASE = "//input[@value='PHV1148']";
		
		//HRA page - Review of Symptoms(ROS)
		public static final String ROSALLNO = "//button[contains(@ng-click,'Symptoms')]";
		
		//HRA page - Self-Assessment
		public static final String HEALTHFAIR = "//input[@value='SAV4']";
		public static final String LITTLEDIFFICULTYINWALKING = "//input[@value='SAV41']";
		
		//HRA page - Fall Risk
		public static final String FALLRISKALLNO = "//button[contains(@ng-click,'Fall Risk')]";
		
		//HRA page - Cognitive Assessment
		public static final String NUMBEROFITEMS2 = "//input[@value='CV3']";
		public static final String CLOCKDRAWINGTESTNORMAL = "//input[@value='CV6']";
		
				
		//HRA page - Biometrics page
		public static final String VISITDATEBIO = "//input[@id='B23']";
		
	
		
	//	Tests/Therapies
	public static final String AWVRADIOBUTTON = "//input[@id='rbAcceptTest68']";
	public static final String IPPERADIOBUTTON = "//input[@id='rbAcceptTest71']";
	public static final String PREVENTIVESERVSELECTALL= "//input[@id='cbxSelectAllIndicated_prev']";
	public static final String OTHERCLINICALTEST = "//input[@id='cbxSelectAllIndicated_other']";
	public static final String REJECTEDTAB = ".//*[@id='main-wrap']/div[2]/div[1]/div/div/div/ul/li[2]/a";
	public static final String ADDTEST = "//input[@id='btnSelectAdditionalTests']";
	public static final String VITAMINDTEST = ".//*[@id='mdPickList']/div/div/div[2]/div[5]/div/input";
	public static final String ADDSELECTEDTEST = "//input[@value='Add Selected Tests']";
	public static final String LIPIDPROFILETESTREJECT = "//*[@id='preventiveHomevhAcc']/div/ul/li[1]/div/div[1]/div[2]/strong/span";
	public static final String HGBA1CTESTREJECT = "//*[@id='otherIndicatedHomevhAcc']/div/ul/li[1]/div/div[1]/div[2]/strong/span";
	
	
	
	// Diagnosis Code Sheet
		public static final String HOMECOUNT = "//a[@href='#uncategorized']"; 
		public static final String REJECTEDCOUNT = "//a[@href='#rejected']";
		public static final String ACCEPTEDCOUNT = "//a[@href='#accepted']";
		public static final String DISEASE1ACCEPT = "//li[1][@class='ng-scope' and @ng-hide='dx.ConflictGroup']/div/div/div[2]/button[1]";
		public static final String DISEASE2ACCEPT = "//li[2][@class='ng-scope' and @ng-hide='dx.ConflictGroup']/div/div/div[2]/button[1]";
		public static final String DISEASE3ACCEPT = "//li[3][@class='ng-scope' and @ng-hide='dx.ConflictGroup']/div/div/div[2]/button[1]";
		public static final String DISEASE4REJECT = "//li[4][@class='ng-scope' and @ng-hide='dx.ConflictGroup']/div/div/div[2]/button[2]";
		public static final String DISEASE5REJECT = "//li[5][@class='ng-scope' and @ng-hide='dx.ConflictGroup']/div/div/div[2]/button[2]";
		public static final String DISEASE6REJECT = "//li[6][@class='ng-scope' and @ng-hide='dx.ConflictGroup']/div/div/div[2]/button[2]";
		
		
			// Diagnose Source Information - Reject page
			public static final String CONDITIONNOTEXIST = "//input[@value='2']";
			public static final String REJECTCOMMENTS = "//textarea[@rows='3']";
			public static final String CONFIRMREJECTBTN = "//button[text()='Confirm Reject']";
		
			
			// Diagnosis Accept page
			public static final String FIRSTICDCODESELECTION = "html/body/div[1]/div/div/div/div[2]/div[2]/div/div/table/tbody/tr[1]/td[2]";
			public static final String  ACCEPTNEXTBTN = "//*[text()='Next']";
			
			
			// Meat Page
			public static final String CONTINUETOMONITORCB = "//input[@value='1' and @name='ClinicalMonitor' ]";
			public static final String EKGCB = "//input[@value='1' and @name='ClinicalEvaluation' ]";
			public static final String EKGDATE = "//input[@placeholder='MM/dd/yyyy']";
			public static final String INREMISSIONCB = "//input[@value='1' and @name='ClinicalAssessment' ]";
			public static final String CONTINUECURRENTTREATMENTCB = "//input[@value='10' and @name='ClinicalTreatment' ]";
			public static final String MEATMEDICATIONCB = "html/body/div[1]/div/div/div[1]/div/div[2]/div[2]/label/span[1]/input";
			public static final String MEATCOMMENTS = "//textarea[@rows='3']";
			public static final String MEATSAVECHANGESBTN = "//*[text()='Save Changes']";
			
			
			// Electronics Signature
			public static final String SIGNBTN = "//*[@id='mdSigning']/div/div/div[3]/button";
			public static final String ESIGNVERIFICATIONMSG = "html/body/div[1]/div/div/div[2]";
			public static final String ESIGNSUCCESSOK = "//button[text()='OK' and @ng-click='close()']";
			
			
			
			//	

}
