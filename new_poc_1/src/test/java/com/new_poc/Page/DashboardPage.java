package com.new_poc.Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DashboardPage extends AbstractPage {

	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = ".//*[@id='header_logo']")
	public WebElement login_page;

	
	
	public void LabelverificationMethod(WebElement webElement,String onForm)
	{
		log(webElement.getText()+" Label is Displayed on "+onForm+"</br>");
		
	}

	/*------------------------------------------------------------------------------------------------------------------------*/

}
