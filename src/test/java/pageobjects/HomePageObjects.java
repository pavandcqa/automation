package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {

	WebDriver driver;

	
	
	@FindBy(how = How.XPATH, using = "//a[@title=\"Contact Us\"]")
	WebElement ContactUs;
	
	@FindBy(how = How.XPATH, using = "//a[@class=\"login\"]")
	WebElement signIn;
	
	public HomePageObjects(WebDriver driver)
	{	this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactUsLink()
	{
		boolean status = ContactUs.isDisplayed();
		return status;
	}
	
	public void clickContactUsOnHomePage()
	{
		ContactUs.click();
	}
	
	public boolean verifySignInLinkOnHomePage()
	{
		boolean status = signIn.isDisplayed();
		return status;
	}
	
	public void clickSignInOnHomePage()
	{
		signIn.click();
	}
}
