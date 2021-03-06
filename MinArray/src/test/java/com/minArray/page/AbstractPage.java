package com.minArray.page;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import com.minArray.Init.Common;
import com.minArray.Init.SeleniumInit;





public class AbstractPage extends SeleniumInit
{
	Common common = new Common(driver);

	public int DRIVER_WAIT = 10;
	/**
	 * Initialize UserAbstractPage.
	 * 
	 * @param Driver
	 *            .
	 */
	public AbstractPage(WebDriver driver) 
	{
		System.out.println("=====Abstract Page=====");
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver,
				DRIVER_WAIT);
		PageFactory.initElements(finder, this);
		this.driver = driver;
	}
	
	


}
