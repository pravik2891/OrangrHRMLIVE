package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard_Page_Object {

	@FindBy(xpath="//*[@id='task-list-group-panel-menu_holder']//following::td[1]")
	public static WebElement pendingLeaveRequests;
}
