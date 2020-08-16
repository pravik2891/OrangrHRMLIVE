package test_cases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.Authentication.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import common_functions.Common_Functions;
import page_objects.User_Role_Page_Object;

public class Test_User_Role extends Common_Functions {
	public void moveToUsersPage(){
		Actions actions= new Actions(driver);
		actions.moveToElement(User_Role_Page_Object.adminLink);
		actions.moveToElement(User_Role_Page_Object.userManagementLink);
		actions.moveToElement(User_Role_Page_Object.usersLink);
		actions.click().build().perform();
	}

	public void selectUserRole(){
		Select selectRole= new Select(User_Role_Page_Object.userRole);
		selectRole.selectByIndex(1);
	}

	public void selectStatus(){
		Select selectStatus= new Select(User_Role_Page_Object.userStatus);
		selectStatus.selectByIndex(1);
	}


	@Test
	public void checkUserRole(){
		PageFactory.initElements(driver, User_Role_Page_Object.class);
		
		moveToUsersPage();
		
		selectUserRole();
	
		selectStatus();	
		User_Role_Page_Object.userRoleValue.getText();

		String actualRole=User_Role_Page_Object.userRoleValue.getText();
		String actualStatus=User_Role_Page_Object.userStatusValue.getText();
		
		
		Assert.assertEquals(actualRole, "Admin");
		Assert.assertEquals(actualStatus, "Enabled");
		

	}


}
