package takeScreenShotDynamic;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListner.class)

public class ActiTimeTestNgLogin extends BaseTest{  //BaseTest from takesScreenshotDynamic pacakge

	@BeforeMethod
	public void setUp()
	{
		initialization();    // Open Browser
	}
	
    @Test
	public void loginPage()
	{
		SoftAssert sa = new SoftAssert();
		String actualLoginPageTitle = driver.getTitle();
		sa.assertEquals(actualLoginPageTitle,"actiTIME - Login");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
	
    @Test
	public void homePage() throws InterruptedException
	{
		SoftAssert sa = new SoftAssert();
		String actualLoginPageTitle = driver.getTitle();
		sa.assertEquals(actualLoginPageTitle,"actiTIME - Login");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		String actualHomePageLogin = driver.getTitle();  // Assert from TestNG
		Assert.assertEquals(actualHomePageLogin,"actiTIME - Enter Time-Track");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
