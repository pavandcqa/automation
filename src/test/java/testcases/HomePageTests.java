package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pageobjects.HomePageObjects;

public class HomePageTests extends TestBase{
	
	HomePageObjects hp = new HomePageObjects(driver);
	
	@Test(priority = 1, groups = {"smoke"})
	public void verifyContactUsPage()
	{
		Assert.assertTrue(hp.verifyContactUsLink(), "ContactUs Page not loaded succesfuly..");
	}
	
	@Test(priority = 2, groups = {"test"})
	public void verifySignInPage()
	{
		Assert.assertTrue(hp.verifySignInLinkOnHomePage(), "SignIn Page not loaded successfully..");
	}

}
