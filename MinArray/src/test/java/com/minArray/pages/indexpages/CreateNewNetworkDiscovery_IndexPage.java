package com.minArray.pages.indexpages;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.minArray.Init.Common;
import com.minArray.Init.TestData;
import com.minArray.page.AbstractPage;
import com.minArray.page.DashboardPage;


public class CreateNewNetworkDiscovery_IndexPage extends AbstractPage {

	public CreateNewNetworkDiscovery_IndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	Common common = new Common(driver);
	DashboardPage db = new DashboardPage(driver);
	TestData testdata = new TestData();
	
	
	@FindBy(xpath = ".//*[@id='main_menu']/ul/li[9]/a/span")
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
	
	@FindBy(xpath = ".//*[@id='bigBox1']//p")
	private WebElement error_msg;
	
	
	String Dname = "";
	
	public void add_Network_discovery()
	{
		
		common.pause(4);
		fill_data();
		
		common.move_to_element(btn_save);
		btn_save.click();
		common.pause(2);
		log("<center> a. Successfull message is Displayes </center></br>");
		
		btn_cancel.click();
		common.pause(2);
		
		
		txt_search_Box.sendKeys(Dname);
		common.pause(2);
	
		WebElement networkname = driver.findElement(By.xpath(".//*[@id='containerDiv']/div/article//*[contains(text(),'"+Dname+"')]"));
		if (common.isElementDisplayed(networkname)) {
			log(" <center> b. New Entered Data is Displayed in Network Discovery panel </center> </br>");
		}
		
	}

	
	
	public void fill_data()
	{
		
		common.pause(1);
		common.move_to_element(txt_Discovery_name);
		Dname = "Test_"+testdata.orgname();
		txt_Discovery_name.sendKeys(Dname);
		common.pause(1);
		
		common.move_to_element(txt_ipRange);
		txt_ipRange.clear();
		txt_ipRange.sendKeys("192.168.1.1-254");
		common.pause(1);
		
		radio_ipRange.click();
		common.pause(1);
		
		radio_disable.click();
		common.pause(1);
		
		common.move_to_element(select_credencial_profile);
		common.doubleclick(select_credencial_profile);
		common.pause(1);
		
		common.move_to_element(select_Device_Type);
		common.doubleclick(select_Device_Type);
		common.pause(1);
	}
	
	
	DashboardPage dashboarsPage = new DashboardPage(driver);
	
	@FindBy(xpath = ".//*[@id='botClose1']")
	private WebElement error_close;
	
	public void save_without_data()
	{
		
		common.pause(4);
		common.waitForElement(btn_add_network_discovery);
		common.move_to_element(btn_add_network_discovery);
		
		common.log("<center> a. click on 'Add' button </center></br>");
		btn_add_network_discovery.click();
		
		common.pause(3);
		dashboarsPage.LabelverificationMethod(lbl_newNetworkDiscovery, " Create New Discovery ");
		
		common.pause(2);
		common.log("<center> b. click on 'save' button </center> </br>");
		common.move_to_element(btn_save);
		btn_save.click();
		common.pause(1);
		common.log("<center> Error Message is Displayed with Messaage As Below </br> <center>"+error_msg.getText()+" </center> </br> </center> </br>");
		
		common.move_to_element(error_close);
		error_close.click();
	}
	
	
	@FindBy(xpath = ".//*[@id='importNetworkDiscoveryCSVForm']/div/div[3]/button[2]")
	private WebElement btn_reset;
	
	public void reset_form()
	{
		common.pause(3);
		common.waitForElement(btn_add_network_discovery);
		common.move_to_element(btn_add_network_discovery);
		
		common.log("<center> a. click on 'Add' button </center> </br>");
		common.move_to_element(btn_add_network_discovery);
		btn_add_network_discovery.click();
		//dashboarsPage.LabelverificationMethod(lbl_newNetworkDiscovery, " Create New Discovery ");
		
		common.log("<center> fill data in form </center> </br>");
		fill_data();
		
		common.log("<center> Click on 'Reset' Button </center>  </br>");
		
		common.pause(2);
		btn_reset.click();
	}
}
