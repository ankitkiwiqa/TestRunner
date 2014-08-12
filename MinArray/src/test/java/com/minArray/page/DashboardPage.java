package com.minArray.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.minArray.Init.Common;

public class DashboardPage extends AbstractPage {

	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


Common common = new Common(driver);
	
	
	public void LabelverificationMethod(WebElement webElement,String onForm)
	{
		common.log(webElement.getText()+" Label is Displayed on "+onForm+"</br>");
		
	}

	/*------------------------------------------------------------------------------------------------------------------------*/

}
