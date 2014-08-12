package com.minArray.Init;

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

		String orgName = "KQ" + "ORG"
				+ RandomStringUtils.random(4, "abcdefghijklmnopqrstuvwxyz");

		return orgName;
	}

	public String orgdes() {

		String orgName = "KQ" + "ORG_des"
				+ RandomStringUtils.random(9, "abcdefghijklmnopqrstuvwxyz");

		return orgName;
	}

	public String firname() {
		String firName = "KQ" + "FN"
				+ RandomStringUtils.random(4, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}

	public String midname() {
		String midName = "KQ" + "MN"
				+ RandomStringUtils.random(4, "abcdefghijklmnopqrstuvwxyz");
		return midName;
	}

	public String lastname() {
		String lastName = "KQ" + "LN"
				+ RandomStringUtils.random(4, "abcdefghijklmnopqrstuvwxyz");
		return lastName;
	}

	public String uname() {
		String UName = "KQ"
				+ "UN"
				+ RandomStringUtils.random(4,
						"abcdefghijklmnopqrstuvwxyz0123456789");
		return UName;
	}

	public String PAssword() {
		String password = RandomStringUtils.random(8,
				"abcdefghijklmnopqrstuvwxyz0123456789");
		return password;
	}

	public String EMAIL() {
		String email = RandomStringUtils
				.random(5, "abcdefghijklmnopqrstuvwxyz") + "@mailinator.com";
		return email;
	}

	/*--------------------------------------------------------------------------------------------------------*/

	public String org_pro_entity() {
		String UName = "KQ"
				+ "PR_"
				+ RandomStringUtils.random(4,
						"abcdefghijklmnopqrstuvwxyz0123456789");
		return UName;
	}

	public String dep_pro_entity() {
		String UName = "KQ_"
				+ "PR_"
				+ RandomStringUtils.random(4,
						"abcdefghijklmnopqrstuvwxyz0123456789");
		return UName;
	}

	public String called_as() {

		String orgName = "KQ" + "_"
				+ RandomStringUtils.random(4, "abcdefghijklmnopqrstuvwxyz");

		return orgName;
	}

	public String pro_entity_add() {

		String orgName = "KQ" + "_"
				+ RandomStringUtils.random(10, "abcdefghijklmnopqrstuvwxyz");

		return orgName;
	}

	/*---------------------------------------------------------------------------------------------------*/

	/*-----------------------*/

	/*--------------------random district generation------------------------------------------*/

	public int random_district_no() {
		String d_no = RandomStringUtils.random(1, "0123456789");
		int i = Integer.parseInt(d_no);

		return i;
	}

	/*-------------------------------------------------------------------------------------*/

	/*--------------------random privilege name------------------------------------------*/

	public String random_tender_prepare() {
		String tender_name = "KQ"
				+ "_"
				+ RandomStringUtils.random(2,
						"abcdefghijklmnopqrstuvwxyz0123456789") + "_Prepare";

		return tender_name;
	}

	public String random_tender_author() {
		String tender_name = "KQ"
				+ "_"
				+ RandomStringUtils.random(2,
						"abcdefghijklmnopqrstuvwxyz0123456789") + "_Authorizer";

		return tender_name;
	}

	public String random_tender_Closer() {
		String tender_name = "KQ"
				+ "_"
				+ RandomStringUtils.random(2,
						"abcdefghijklmnopqrstuvwxyz0123456789") + "_Closer";

		return tender_name;
	}

	public String random_tender_Open() {
		String tender_name = "KQ"
				+ "_"
				+ RandomStringUtils.random(2,
						"abcdefghijklmnopqrstuvwxyz0123456789") + "_Open";

		return tender_name;
	}

	/*-------------------------------------------------------------------------------------*/

	/*--------------------------define user random data---------------------------------*/

	public String address() {
		String firName = "KQ" + "Add"
				+ RandomStringUtils.random(10, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}

	public String city() {
		String firName = "KQ" + "CT"
				+ RandomStringUtils.random(4, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}

	public String State() {
		String firName = "KQ" + "ST"
				+ RandomStringUtils.random(4, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}

	public String Country() {
		String firName = "KQ" + "CN"
				+ RandomStringUtils.random(4, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}

	public String zipcode() {
		String firName = RandomStringUtils.random(6, "1234567890");
		return firName;
	}

	/*------------------------------------------------------------------------------------*/

	public String name_of_work() {
		String firName = "KQ" + "NOW"
				+ RandomStringUtils.random(4, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}


	public String brief_introduction_of_work() {
		String firName = "KQ" + "Test_"
				+ RandomStringUtils.random(15, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}

	public String enter_notice_detail() {
		String firName = "KQ" + "Test_"
				+ RandomStringUtils.random(25, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}
	
	
    /*--------------------------------tender creation----------------------------------*/
	
	
	public String testing_reason() {
		String firName = "KQ" + "Test_"
				+ RandomStringUtils.random(10, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}
	
	
	public String testing_procurment_title() {
		String firName = "KQ" + "Test_pr_title_"
				+ RandomStringUtils.random(4, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}
	
	public String testing_Tender_offers_are_invited_for_the_provision_of() {
		String firName = "KQ" + "Tender_offers_are_invited_for_the_provision_of"
				+ RandomStringUtils.random(20, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}
	
	
	public String testing_Estimated_Value_of_the_Procurement() {
		String firName = RandomStringUtils.random(6, "0123456789");
		return firName;
	}
	
	public String approved_amout() {
		String firName = RandomStringUtils.random(7, "0123456789");
		return firName;
	}
	

	public String price_preference() {
		String firName = RandomStringUtils.random(5, "0123456789");
		return firName;
	}

	
	public String note() {
		String firName = "KQ" + "_note_"
				+ RandomStringUtils.random(2, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}
	

	public String item_name() {
		String firName = "KQ" + "_name_"
				+ RandomStringUtils.random(2, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}
	
	public String test_data() {
		String firName = "KQ" + "_test_data_"
				+ RandomStringUtils.random(3, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}
	
	public String item_no() {
		String firName = RandomStringUtils.random(3, "0123456789");
		return firName;
	}

	public String quantity() {
		String firName = RandomStringUtils.random(1, "0123456789");
		return firName;
	}
	
	public String estimated_unit_rates() {
		String firName = RandomStringUtils.random(4, "0123456789");
		return firName;
	}
	
	
    /*-----------------------------------------------------------------------------------*/

	
	public String cheque_number() {
		String firName = RandomStringUtils.random(6, "0123456789");
		return firName;
	}
	
	public String bank_name() {
		String firName ="KQ "+ RandomStringUtils.random(3, "abcdefghijklmnopqrstuvwxyz")+" BANK";
		return firName;
	}


	public String branch() {
		String firName ="KQ "+ RandomStringUtils.random(3, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}

	public String offer_rate() {
		String firName = RandomStringUtils.random(3, "0123456789");
		return firName;
	}

	
	public String telephone_no() {
		String firName = RandomStringUtils.random(10, "0123456789");
		return firName;
	}
	public String test_date_add_item() {
		String firName = RandomStringUtils.random(6, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}
	
	public String commitee_name() {
		String firName = "KQ" + "_committee_"
				+ RandomStringUtils.random(3, "abcdefghijklmnopqrstuvwxyz");
		return firName;
	}
	

}

