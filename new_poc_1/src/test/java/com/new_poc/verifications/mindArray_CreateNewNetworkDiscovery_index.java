package com.new_poc.verifications;



import com.new_poc.Init.Common;
import com.new_poc.Init.SeleniumInit;

public class mindArray_CreateNewNetworkDiscovery_index extends SeleniumInit {

Common common = new Common(driver);
	
public void CreateNewNetworkDiscovery()
{
	common.log("Test Case Id : Admin_001 </br>");
	common.log("Test Case Name : Create New Network Discovery </stong></br>");
	
	common.log("<stong> Step 1 : open given URL: http://27.109.14.11:8081 </br>");
	
	common.log("<stong> Step 2 : Enter valide 'UserName' & 'Password' And Click on Login button </stong></br>");
	login_page.AdminLogin();
	
	common.log("<stong> Step 3 : Click on 'Admin' in left navigation menu. Click on 'Network Discovery' under 'Admin' section. </stong></br>");
	createNetwork_indexpage.nav_Network_discovery();
	
	common.log("<stong> Step 4 : Click on 'Save' button without filling Required field </stong></br>");
	createNetwork_indexpage.save_without_data();
	
	common.log("<stong> Step 5 : fill all Required field and click on save button </stong></br>");
	createNetwork_indexpage.add_Network_discovery();
	
	common.log("<stong> Step 6 : fill all Required field and click on 'Reset' Button </stong></br>");
	createNetwork_indexpage.reset_form();
	
	
	
}

}
