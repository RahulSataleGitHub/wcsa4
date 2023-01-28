package seleniumAssignmentBasedOnScenarios;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;


public class Scenario7 {

public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmBtn")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]")).click();
		Thread.sleep(2000);
		
		WebElement button = driver.findElement(By.xpath("//input[@id='buy-now']"));
		button.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[.='* This field is required'])[2]"));
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/Screenshotoferror.jpg");
		Files.copy(src, dest);
	    Thread.sleep(4000);
	    
		driver.close();




}
}
