package com.minArray.pages.indexpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.minArray.Init.Common;
import com.minArray.page.AbstractPage;



public class login_IndexPage extends AbstractPage {

	public login_IndexPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = ".//*[@id='adminUsername']")
	private WebElement txt_username;
	
	@FindBy(xpath = ".//*[@id='adminPassword']")
	private WebElement txt_pass;
	
	@FindBy(xpath = ".//*[@id='logInBtn']")
	private WebElement btn_login;
	
	Common common = new Common(driver);
	
	public void AdminLogin()
	{
		common.pause(3);
		txt_username.sendKeys("admin");
		common.pause(1);
		txt_pass.sendKeys("admin");
		common.pause(1);
		btn_login.click();
		common.pause(3);
	}
}
