package test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import common_functions.Common_Functions;
import page_objects.DashBoard_Page_Object;
import page_objects.Login_Page_Object;

public class Test_Pending_Leave_Request extends Common_Functions {
String actualMessage=null;
	
	
	public void login(){
		
		Login_Page_Object.userName.sendKeys(properties.getProperty("username"));
		Login_Page_Object.password.sendKeys(properties.getProperty("password"));
	}

	public void getPendingLeaveRquests(){
		PageFactory.initElements(driver, DashBoard_Page_Object.class);
		 actualMessage=DashBoard_Page_Object.pendingLeaveRequests.getText();
	}

	@Test
	public void verifyPendingLeaveRequests(){
		login();
		
		getPendingLeaveRquests();
		
		Assert.assertEquals(actualMessage, "No Records are Available");
		
	}

}
