package testNGPack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1 {
	static WebDriver driver;
  @Test(description = "This Test Case for Sql")
  public void sql()
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.google.co.in/");
	  driver.switchTo().activeElement().sendKeys("Sql");
	  Reporter.log("method of Sql",true);
	  
  }
}
