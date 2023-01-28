package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMInvalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Flib flib = new Flib();
		int rc = flib.rowCount("./data/OrangeHRMTestData.xlsx","Invalidcreds");
		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData("./data/OrangeHRMTestData.xlsx","Invalidcreds",i,0);
			
			String password = flib.readExcelData("./data/OrangeHRMTestData.xlsx","Invalidcreds",i,1);
			
			WebElement usn = driver.findElement(By.name("username"));
			usn.sendKeys(username);
			Thread.sleep(2000);
			WebElement pass = driver.findElement(By.name("password"));
			pass.sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			
		}
	}
}
