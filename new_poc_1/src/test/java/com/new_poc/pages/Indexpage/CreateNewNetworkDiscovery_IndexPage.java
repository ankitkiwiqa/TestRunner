package com.new_poc.pages.Indexpage;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.new_poc.Init.Common;
import com.new_poc.Page.AbstractPage;
import com.new_poc.Page.DashboardPage;

public class CreateNewNetworkDiscovery_IndexPage extends AbstractPage {

	public CreateNewNetworkDiscovery_IndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	Common common = new Common(driver);
	DashboardPage db = new DashboardPage(driver);

	@FindBy(xpath = ".//span[contains(text(),'Admin')]")
	private WebElement link_admin;
	
	@FindBy(xpath = ".//*[contains(text(),'Network Discovery')]")
	private WebElement link_network_discovery;
	
	public void nav_Network_discovery()
	{
		common.pause(3);
		common.move_to_element(link_admin);
		link_admin.click();
		common.pause(1);
		common.move_to_element(link_network_discovery);
		link_network_discovery.click();
	}
	
	
	@FindBy(xpath = ".//*[@id='myTableNetDisAdminJW']/div/header/div[7]/div/a")
	private WebElement btn_add_network_discovery;
	
	@FindBy(xpath = ".//*[@id='titleNewNetworkDiscovery']")
	private WebElement lbl_newNetworkDiscovery;
	
	@FindBy(xpath = ".//*[@id='txtfldDisplayNameCreateDis']")
	private WebElement txt_Discovery_name;
	
	@FindBy(xpath = ".//*[@id='txtSubnetAddress']")
	private WebElement txt_ipRange;
	
	@FindBy(xpath = ".//*[@id='createDiscoveryForm']//section[2]/div/label[1]")
	private WebElement radio_ipRange;
	
	@FindBy(xpath = ".//*[@id='createDiscoveryForm']//section[3]/div/label[2]")
	private WebElement radio_disable;
	
	@FindBy(xpath = ".//*[@id='credProfileLeft']/option[1]")
	private WebElement select_credencial_profile;
	
	@FindBy(xpath = ".//*[@id='deviceLeft']/option[1]")
	private WebElement select_Device_Type;
	
	@FindBy(xpath = ".//*[@id='importNetworkDiscoveryCSVForm']//button[3]")
	private WebElement btn_cancel;
	//    .//*[@id='containerDiv']/div/article//*[contains(text(),'test_001')]
	
	@FindBy(xpath = ".//*[@id='btnSubmitCreateDiscovery']")
	private WebElement btn_save;
	
	@FindBy(xpath = ".//*[@id='myTableNetDisAdmin_filter']/label/input")
	private WebElement txt_search_Box;
	
	String Dname = "Test_"+testdata.orgname();
	
	public void add_Network_discovery()
	{
		
		fill_data();
		
		btn_save.click();
		common.pause(2);
		log("<center> a. Successfull message is Displayes </center></br>");
		
		btn_cancel.click();
		common.pause(2);
		
		
		txt_search_Box.sendKeys(Dname);
		
	
		WebElement networkname = driver.findElement(By.xpath(".//*[@id='containerDiv']/div/article//*[contains(text(),'"+Dname+"')]"));
		if (common.isElementDisplayed(networkname)) {
			log(" <center>b. New Entered Data is Displayed in Network Discovery panel </center> </br>");
		}
		
	}

	
	
	public void fill_data()
	{
		common.pause(1);
		txt_Discovery_name.sendKeys(Dname);
		common.pause(1);
		
		txt_ipRange.sendKeys("192.168.1.1-254");
		common.pause(1);
		
		radio_ipRange.click();
		common.pause(1);
		
		radio_disable.click();
		common.pause(1);
		
		common.doubleclick(select_credencial_profile);
		common.pause(1);
		
		common.doubleclick(select_Device_Type);
		common.pause(1);
	}
	
	
	
	public void save_without_data()
	{
		
		common.pause(3);
		common.waitForElement(btn_add_network_discovery);
		common.move_to_element(btn_add_network_discovery);
		
		common.log("<center> a. click on 'Add' button </center></br>");
		btn_add_network_discovery.click();
		dashboardPage.LabelverificationMethod(lbl_newNetworkDiscovery, " Create New Discovery ");
		
		common.pause(2);
		common.log("<center> b. click on 'save' button </center> </br>");
		btn_save.click();
		common.log("<center> Error Message is Displayed with Messaage \""+Dname+"\" </center> </br>");
	}
	
	
	@FindBy(xpath = "")
	private WebElement btn_reset;
	
	public void reset_form()
	{
		common.pause(3);
		common.waitForElement(btn_add_network_discovery);
		common.move_to_element(btn_add_network_discovery);
		
		common.log("<center> a. click on 'Add' button </center> </br>");
		btn_add_network_discovery.click();
		dashboardPage.LabelverificationMethod(lbl_newNetworkDiscovery, " Create New Discovery ");
		
		common.log("<center> fill data in form </center> </br>");
		fill_data();
		
		common.log("<center> Click on 'Reset' Button </center>  </br>");
		
		common.pause(2);
		btn_reset.click();
	}
}
