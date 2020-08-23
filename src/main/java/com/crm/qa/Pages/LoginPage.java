package com.crm.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.TestBase.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name= "email")
	WebElement username;
	
	@FindBy(name= "password")
	WebElement password;
	
	@FindBy(xpath= "//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;

	public LoginPage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un, String pw) throws Exception
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		loginbtn.click();
		return new HomePage();
	}

}
