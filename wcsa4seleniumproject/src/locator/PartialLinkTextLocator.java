package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://laptop-pon6rpv8/login.do");
		  
		  driver.findElement(By.partialLinkText("License ")).click();
		  Thread.sleep(2000);
		  driver.quit();
		  

		}
}
