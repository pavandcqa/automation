package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageobjects.HomePageObjects;

public class TestBase {

protected WebDriver driver;
//protected HomePageObjects hp;
	
	@BeforeMethod
	public void setUp() {
		System.out.println("SetUp Configuration");

		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		System.out.println("Open the browser");
		driver.get("http://automationpractice.com/index.php");
		
		//hp = new HomePageObjects(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("Close Browser configuration");
	}
}
