package Utils;

import org.openqa.selenium.WebDriver;

import POM.ActitimeCreatNewCustomer;
import POM.ActitimeCreateLeaveType;
import POM.ActitimeCreateTypesOfWork;
import POM.ActitimeDeleteCustomer;
import POM.ActitimeHomePage;
import POM.ActitimeLeaveTypeAndDelete;
import POM.ActitimeLoginPage;
import POM.ActitimeSettingsButton;
import POM.ActitimeTypesOfWorkAndDelete;

public class Base implements Autoconstrant
{
	public static WebDriver driver; 
	public static ActitimeLoginPage login ;
	public static ActitimeHomePage home;
	public static ActitimeSettingsButton settings;
	public static ActitimeCreatNewCustomer newcustomer;
	public static ActitimeDeleteCustomer deletecustomer;
	public static ActitimeCreateTypesOfWork createtypesofwork;
	public static ActitimeTypesOfWorkAndDelete typesofworkanddelete;
	public static ActitimeCreateLeaveType createleavetype;
	public static ActitimeLeaveTypeAndDelete leavetypeanddelete;
}
