package com.new_poc.Init;



import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.DataProvider;

/**
 * Define Seller Test Data
 * 
 */

public class TestData {
	@DataProvider(name = "logdata")
	public static Object[][] Logindata() {
		Object obj[][] = { { "login1", "pass" } };

		return obj;
	}

	/*-----------------------------random data generation methods--------------------*/

	public String orgname() {

		String orgName = "KQ" + "Test"
				+ RandomStringUtils.random(4, "abcdefghijklmnopqrstuvwxyz");

		return orgName;
	}


	
	
}

