package com.crm.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.TestBase.TestBase;

public class HomePage extends TestBase  {
	
	@FindBy(xpath= "//span[contains(text(),'Companies')]")
	WebElement companiesLink;
	
	@FindBy(xpath= "//span[contains(text(),'Deals')]")
	WebElement dealsLink;

	public HomePage() throws Exception {
		
		PageFactory.initElements(driver, this);
	}
	
	public CompaniesPage companiesClick() throws Exception
	{
		companiesLink.click();
		return new CompaniesPage();
	}
	public DealsPage dealsClick() throws Exception
	{
		dealsLink.click();
		return new DealsPage();
	}

}
