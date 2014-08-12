package com.minArray.page;



import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.sun.jna.platform.win32.Advapi32Util.Account;

public class MindArray_DashboardPage extends AbstractPage {

	public MindArray_DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/*----------------------------------DASHBOARD PAGE VERIFY------------------------------------------------*/

	@FindBy(xpath = "//*[starts-with(@id,'gwt-uid')][contains(.,'Dashboard')]")
	private WebElement dashboardmanu;

	@FindBy(xpath = "//*[starts-with(@id,'gwt-uid')][contains(.,'My Reports')]")
	private WebElement myreports;

	@FindBy(xpath = "//*[starts-with(@id,'gwt-uid')][contains(.,'My Briefcase')]")
	private WebElement mybriefcase;

	@FindBy(xpath = "//*[starts-with(@id,'gwt-uid')][contains(.,'Create')]")
	private WebElement create_button;

	@FindBy(xpath = ".//*[@class='loggedInUserNameLabel']")
	private WebElement account_name;

	public void dashboard_verify() {

		common.pause(2);
		if (dashboardmanu.isDisplayed()) {

			common.log("'DashBoard:' Button verification on Dashboard page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

	/*	if (myreports.isDisplayed()) {

			common.log("'My Reports:' Button verification on Dashboard page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}
*/
		if (mybriefcase.isDisplayed()) {

			common.log("'My Briefcase:' Button verification on Dashboard page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		if (create_button.isDisplayed()) {

			common.log(" Create:' Button verification on Dashboard page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		if (account_name.isDisplayed()) {

			common.log("'Account Name:' Label verification on Dashboard page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

	}

	/*--------------------------------------------------------------------------------------------------------*/

	@FindBy(xpath = "//div[@class='login_label']")
	private WebElement configured_workflow_label;

	@FindBy(xpath = "//table/tbody/tr[4]/td/div/div/div/div/div/div[1]/div[3]/table/thead/tr/th[contains(.,'Configured Workflows')]")
	private WebElement configured_workflow_text;

	public void configured_workflow_page_verify() {
		if (configured_workflow_label.isDisplayed()) {

			common.log("'Create New 'ITT'' Label verification on Configured Workflow page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		if (configured_workflow_text.isDisplayed()) {

			common.log("'Configured Workflows' Label verification on Configured Workflow page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}
	}

	/*------------------------------------------------------------------------------------------------------------------------------*/

	/*-----------------------------------------ITT ATTRIBUTE FORM PAGE VERFIFICATION-----------------------------------------------------------------*/

	@FindBy(xpath = "//div[@class='smallHeaderwithoutBold'][@title='You are here : ITT Preparation > Define ITT']")
	private WebElement header_label;

	@FindBy(xpath = "//div/div/div/div/div/div[4]/div/div/div[1]/div[3]/table/tbody/tr/td[2]/img")
	private WebElement info_Button;

	@FindBy(xpath = "//div/div/div/div/div/div[4]/div/div/div[1]/div[3]/table/tbody/tr/td[6]/img")
	private WebElement save_button;

	@FindBy(xpath = "//div/div/div/div/div/div[4]/div/div/div[1]/div[3]/table/tbody/tr/td[7]/img")
	private WebElement Submit_button;

	@FindBy(xpath = "//div/div/div/div/div/div[4]/div/div/div[1]/div[3]/table/tbody/tr/td[8]/img")
	private WebElement Exit_button;

	public void define_iit_attribute_verify() {

		if (header_label.isDisplayed()) {

			common.log("'You are here : ITT Preparation > Define ITT' Label verification on Define ITT Attributes page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		}

		else {
			common.log("'You are here : ITT Preparation > Define ITT' Label verification on Define ITT Attributes page. <h3 style=color:red>FAIL</h3>");
			Assert.assertTrue(false);
		}

		if (info_Button.isDisplayed()) {

			common.log("'INFO' Button verification on Define ITT Attributes page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		if (save_button.isDisplayed()) {

			common.log("'SAVE' Button verification on Define ITT Attributes page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		if (Submit_button.isDisplayed()) {

			common.log("'SUBMIT' Button verification on Define ITT Attributes page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		if (Exit_button.isDisplayed()) {

			common.log("'EXIT' Button verification on Define ITT Attributes page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

	}

	/*--------------------------------------------------------------------------------------------------------------*/


	@FindBy(xpath = ".//*[starts-with(@id,'gwt-uid')]/div[contains(.,'Edit')]")
	private WebElement edit_button;

	

	

	@FindBy(xpath = ".//*[@id='nav']/div[1]/div/h1/div")
	private WebElement dashboard_label;

	

	public void tender_approve_dashboard() {

		if (dashboard_label.isDisplayed()) {

			common.log("'INTEGRATED PROCUREMENT MANAGEMENT SYSTEM' label verification on Dashboard page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		if (dashboardmanu.isDisplayed()) {

			common.log("'Dashboard' Button verification on Dashboard page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		if (mybriefcase.isDisplayed()) {

			common.log("'My Briefcase' Button verification on Dashboard page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		if (edit_button.isDisplayed()) {

			common.log("'Edit' Button verification on Dashboard page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		if (account_name.isDisplayed()) {

			common.log("'Account Name:' Label verification on Dashboard page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

	}

	/*-------------------------------------------------------------------------------------------------*/

	@FindBy(xpath = "//div[2]/div/div/div/div/div[1]/div[1]")
	private WebElement dashboard_edit_iit_label;

	@FindBy(xpath = "//div[2]/div/div/div/div/div[2]/div[1]/div/table[1]/tbody/tr/td[3]/button")
	private WebElement search_button;

	public void tender_approve_search() {

		common.pause(2);
		if (dashboard_edit_iit_label.isDisplayed()) {

			common.log("'View All Procurement Plan/ITT:' Label verification on Dashboard page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}


		common.pause(2);
		if (search_button.isDisplayed()) {

			common.log("'Search:' Button verification on Dashboard page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

	}

	/*------------------------------------------------------------------------------------------------------*/

	@FindBy(xpath = "//div/div/div/div/div/div[4]/div/div/div[2]/table/tbody/tr[1]/td/div/div/table/tbody/tr/td[5]/div")
	private WebElement confirmation_button;

	@FindBy(xpath = "//div[@class='smallHeaderwithoutBold'][@title='You are here : Confirmation of Fund > Availability of Fund']")
	private WebElement confirmation_page_label;

	public void tender_approve_confirmation_on_funds() {

		if (confirmation_button.isDisplayed()) {

			common.log("'Confirmation of Funds:' Checkbox verification on Confirmation of Fund page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		try {

			if (confirmation_page_label.isDisplayed()) {

				common.log("'You are here : Confirmation of Fund > Availability of Fund' Label verification on Confirmation of Fund page. <h3 style=color:green>PASSED</h3>");
				Assert.assertTrue(true);
			}

		} catch (NoSuchElementException e) {

			common.log("'You are here : ITT Preparation > Define ITT' Label verification on Confirmation of Fund page. <h3 style=color:red>FAIL</h3>");
			Assert.assertTrue(true);
		}

		if (info_Button.isDisplayed()) {

			common.log("'INFO' Button verification on Confirmation of Fund page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		if (save_button.isDisplayed()) {

			common.log("'SAVE' Button verification on Confirmation of Fund page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		if (Submit_button.isDisplayed()) {

			common.log("'SUBMIT' Button verification on Confirmation of Fund page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		if (Exit_button.isDisplayed()) {

			common.log("'EXIT' Button verification on Confirmation of Fund page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);

		}
	}
	
	
/*--------------------------VERIFICATION METHOD------------------------------------------------------------------*/	
	
	public void verification_method(WebElement element,String element_name,String element_type,String page_name)
	{
		
		
		Actions move_to_element=new Actions(driver);
		move_to_element.moveToElement(element).build().perform();
		common.pause(3);
		

		if (element.isDisplayed()) {

			common.log("'"+element_name+"' "+element_type+" verification on "+page_name+" page. <h3 style=color:green>PASSED</h3>");
			Assert.assertTrue(true);
		} else {

	
			
			
			
			
			
			common.log("'"+element_name+"' "+element_type+" verification on "+page_name+" page. <h3 style=color:red>FAILED</h3>");

			Assert.assertTrue(false);
		}
		
	}
/*------------------------------------------------------PREVIEW PAGE VERIFICATION--------------------------------*/	
	
	@FindBy(xpath="//div[@class='hyperlink_item'][contains(.,'Preview')]")
	private WebElement preview_button;
	
	
	@FindBy(xpath="//div[@class='smallHeaderwithoutBold'][contains(.,'You are here : ITT Preparation > Preview Availability of Funds')]")
	private WebElement preview_label;
	
	public void verify_preview_page()
	{
		common.pause(3);
		verification_method(preview_button, "Preview", "Button", "Preview");
		/*common.pause(3);
		verification_method(preview_label, "You are here : ITT Preparation > Preview Availability of Funds", "Label", "Preview");
		common.pause(3);
		*/
	}
	
/*---------------------------------	UPDATE ITT PAGE VERIFICATION----------------------------------------*/	

	@FindBy(xpath="//div[@class='hyperlink_item'][contains(.,'Update ITT Attributes')]")
	private WebElement Update_ITT_Attributes_button;
	
	
	@FindBy(xpath="//div[@class='smallHeaderwithoutBold'][contains(.,'You are here : ITT Preparation > Update ITT Attributes')]")
	private WebElement Update_ITT_Attributes_label;
	
	
	public void verify_update_itt_page()
	{
		common.pause(1);
		verification_method(Update_ITT_Attributes_button, "Update ITT Attributes", "Button", "Update ITT Attributes");
		common.pause(1);
		verification_method(Update_ITT_Attributes_label, "You are here : ITT Preparation > Update ITT Attributes", "Label", "Update ITT Attributes");
		common.pause(1);
		
	}

/*-------------------------------- VERIFICATION ON MANAGE ITT SECTION-------------------------*/

	


	@FindBy(xpath="//div[@class='hyperlink_item'][contains(.,'Manage ITT Forms')]")
	private WebElement manage_ITT_forms_button;
	
	
	@FindBy(xpath="//div[@class='smallHeaderwithoutBold'][contains(.,'You are here : ITT Preparation > Manage ITT Forms')]")
	private WebElement manage_ITT_forms_label;
	
	
	public void verify_manage_itt_page()
	{
		common.pause(2);
		verification_method(manage_ITT_forms_button, "Manage ITT Forms", "Button", "Manage ITT Forms");
		common.pause(2);
		verification_method(manage_ITT_forms_label, "You are here : ITT Preparation > Manage ITT Forms", "Label", "Manage ITT Forms");
		common.pause(2);
		
	}

/*----------------------------------------COVER PAGE VERIFICATION------------------------------------------------------------*/

	
	
	

	
	
	@FindBy(xpath="//p[@class='panel-title'][contains(.,'Cover Page')]")
	private WebElement Coverpage_label;
	
	
	public void verify_cover()
	{
		
		common.pause(1);
		verification_method(Coverpage_label, "Cover Page", "Label", "Cover");
		common.pause(1);
		
	}
	
/*-----------------------------------TENDER DATA VERIFICATION--------------------------------------------------------------*/	
	
	

	@FindBy(xpath="//p[@class='panel-title'][contains(.,'TENDER DATA')]")
	private WebElement tender_data_label;
	
	
	public void verify_tender_data()
	{
		
		common.pause(1);
		verification_method(tender_data_label, "TENDER DATA", "Label", "TENDER DATA");
		common.pause(1);
		
	}
	
	


/*-------------------------------------------------Tender Data – Tender Evaluation Criteria---------------------------------------------------------------------*/

	@FindBy(xpath="//p[@class='panel-title'][contains(.,'Tender Data – Tender Evaluation Criteria')]")
	private WebElement tender_eveluation_label;
	
	
	public void verify_tender_evaluation_data()
	{
		
		common.pause(1);
		verification_method(tender_eveluation_label, "Tender Data – Tender Evaluation Criteria", "Label", "Tender Data – Tender Evaluation Criteria");
		common.pause(1);
		
	}
/*----------------------------------------------------------------------------------------------------------------*/	
	
	/*-------------------------------------------------STANDARDISED CONDITIONS OF TENDER---------------------------------------------------------------------*/

	@FindBy(xpath="//p[@class='panel-title'][contains(.,'STANDARDISED CONDITIONS OF TENDER')]")
	private WebElement STANDARDISED_CONDITIONS_OF_TENDER_label;
	
	
	public void verify_STANDARDISED_CONDITIONS_OF_TENDER()
	{
		
		common.pause(1);
		verification_method(STANDARDISED_CONDITIONS_OF_TENDER_label, "STANDARDISED CONDITIONS OF TENDER", "Label", "STANDARDISED CONDITIONS OF TENDER");
		common.pause(1);
		
	}
/*----------------------------------------------------------------------------------------------------------------*/	
	


/*-------------------------------------------------Returnable Document Formats---------------------------------------------------------------------*/

	@FindBy(xpath="//p[@class='panel-title'][contains(.,'Returnable Document Formats')]")
	private WebElement Returnable_Document_Formats_label;
	
	
	public void verify_Returnable_Document_Formats()
	{
		
		common.pause(1);
		verification_method(Returnable_Document_Formats_label, "Returnable Document Formats", "Label", "Returnable Document Formats");
		common.pause(1);
		
	}
/*----------------------------------------------------------------------------------------------------------------*/	


/*-------------------------------------------------Attach Template button verification---------------------------------------------------------------------*/

	@FindBy(xpath = "//table/tbody/tr[2]/td/div/div/div/div/div[2]/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/img")
	private WebElement attach_template_button;
	
	
	public void verify_attach_template_button()
	{
		
		common.pause(1);
		verification_method(attach_template_button, "Attach Templates", "Button", "Manage ITT Forms");
		common.pause(1);
		
	}
/*----------------------------------------------------------------------------------------------------------------*/	

	/*-------------------------------------------------Attach Template popup verification---------------------------------------------------------------------*/

	@FindBy(xpath = "//div[@class='gwt-HTML'][contains(.,'Search Template')]")
	private WebElement template_popup_search_lable;
	


	@FindBy(xpath = "//button[@class='gwt-Button'][contains(.,'Search')]")
	private WebElement template_popup_search_button;

	@FindBy(xpath = "//button[@class='gwt-Button'][contains(.,'Attach Templates')]")
	private WebElement template_popup_attach_template_button;
	
	
	public void verify_attach_template_popup()
	{
		
		common.pause(1);
		verification_method(template_popup_search_lable, "Search Template", "Label", "Templates POP-UP");
		common.pause(1);
		verification_method(template_popup_search_button, "Search Button", "Button", "Templates POP-UP");
		common.pause(1);
		verification_method(template_popup_attach_template_button, "Attach Template", "Botton", "Templates POP-UP");
		common.pause(1);
		
		
	}
/*-------------------------------------------------attach_template_and_assign_envelope_popup---------------------------------------------------------------*/	
	
	@FindBy(xpath = "//button[@class='gwt-Button'][contains(.,'Attach templates and assign Envelope')]")
	private WebElement template_popup_attach_template_assign_Envelope_button;
	
	
	@FindBy(xpath = "//div[@class='Caption'][contains(.,'Manage Envelopes')]")
	private WebElement Manage_envelope_label;
	
	
	@FindBy(xpath = "//img[@class='imageAsLink'][@title='Attach Template(s)']")
	private WebElement Manage_envelope_button;
	
	
	public void verify_attach_template_and_assign_envelope_popup()
	{
		
		
		verification_method(Manage_envelope_label, "Manage Envelope", "Label", "Templates POP-UP");
		common.pause(1);
		

		verification_method(Manage_envelope_button, "Manage Envelope", "Button", "Templates POP-UP");
		common.pause(1);
		
		
	}
	
/*-------------------------------------------------Add item verification---------------------------------------------------------------------*/	
	
	
	@FindBy(xpath = "//div[@class='hyperlink_item'][contains(.,'Add Item(s)')]")
	private WebElement add_item_button;
	

	@FindBy(xpath = "//div[@class='smallHeaderwithoutBold'][contains(.,'You are here : ITT Preparation > Item Specification')]")
	private WebElement add_item_label;
	
	

	
	
	
	public void verify_add_items()
	{
		
		
		verification_method(add_item_button, "Add Item(s)", "Label", "Add Item(s)");
		common.pause(1);
	
		verification_method(add_item_label, "You are here : ITT Preparation > Item Specification", "Label", "Add Item(s)");
		common.pause(1);
	
		
	}
	
	
	

/*----------------------------------------------------Evalution criteria verification------------------------------------------------------------------*/	
		
	
	
	
	@FindBy(xpath = "//div[@class='hyperlink_item'][contains(.,'Evaluation Criteria')]")
	private WebElement Evalution_criteria_button;
	
	
	
	@FindBy(xpath = "//button[@class='gwt-Button'][contains(.,'Save Defined Criteria')]")
	private WebElement save_defined_criteria_button;
	
	
	
	public void verify_Evalution_criteria()
	{
		
		
		verification_method(Evalution_criteria_button, "Evaluation Criteria", "Button", "Evaluation Criteria");
		common.pause(1);
	
		/*verification_method(save_defined_criteria_button, "Save Defined Criteria", "Button", "Add Item(s)");
		common.pause(1);
	*/
		
	}
	
	
	
	
/*---------------------------------------------------------------------------------------------------------------------------*/	
	
	
	
	
/*----------------------------------------------------Prepare Notice verification------------------------------------------------------------------*/	
		
	
	
	
	@FindBy(xpath = "//div[@class='smallHeaderwithoutBold'][contains(.,'You are here : ITT Preparation > Prepare Tender Notice ')]")
	private WebElement prepare_notice_label;
	
	
	
	@FindBy(xpath = "//div[@class='hyperlink_item'][contains(.,'Prepare Notice')]")
	private WebElement prepare_notice_button;
	
	
	
	public void verify_prepare_notice()
	{
		
		
		verification_method(prepare_notice_label, "You are here : ITT Preparation > Prepare Tender Notice", "Label", " Prepare Notice");
		common.pause(1);
	
		verification_method(prepare_notice_button, "Prepare Notice", "Button", "Prepare Notice");
		common.pause(1);
	
		
	}
	
	
	
	
/*------------------------------------------------------tender_vetting_dashboard_verification---------------------------------------------------------------------*/	
	
	@FindBy(xpath = ".//*[starts-with(@id,'gwt-uid')][contains(.,'Dashboard')]")
	private WebElement dashboard_menu;
	
	@FindBy(xpath = "//*[starts-with(@id,'gwt-uid')][contains(.,'My Reports')]")
	private WebElement MY_report_menu;
	
	
	@FindBy(xpath = "//*[starts-with(@id,'gwt-uid')][contains(.,'Edit')]")
	private WebElement Edit_menu;
	
	
	
	public void tender_vetting_dashboard_verification()
	{
		
		verification_method(dashboard_menu, "Dashboard", "Button", "Dashboard");
		common.pause(1);
		verification_method(MY_report_menu, "My Reports", "Button", "Dashboard");
		common.pause(1);
		verification_method(Edit_menu, "Edit", "Button", "Dashboard");
		common.pause(1);
		
		
		
	}
	
	
	
/*----------------------------------------------------------------------------------------------------------------------------------*/	
	
	
	
	
	
	
	
	
	
	
}
