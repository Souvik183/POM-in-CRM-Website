package com.crm.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.Pages.CompaniesPage;
import com.crm.qa.Pages.DealsPage;
import com.crm.qa.Pages.HomePage;
import com.crm.qa.Pages.LoginPage;
import com.crm.qa.TestBase.TestBase;

public class HomePageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	CompaniesPage companiespage;
	DealsPage dealspage;

	public HomePageTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		loginpage=new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void companiesClick() throws Exception
	{
		companiespage=homepage.companiesClick();
	}
	
	@Test
	public void dealsClick() throws Exception
	{
		dealspage=homepage.dealsClick();
	}
	
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}

}
