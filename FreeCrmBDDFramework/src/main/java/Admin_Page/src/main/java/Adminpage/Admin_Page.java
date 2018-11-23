package main.java.Adminpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import main.java.GenericFunctions.Genericfunctions;

public class Admin_Page extends main.java.GenericFunctions.Genericfunctions {

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Username']")
	public static WebElement Edi_Username;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	public static WebElement Edi_Password;

	@FindBy(how = How.XPATH, using = "//input[@value='Login']")
	public static WebElement Edi_login;

}
