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
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Scenario4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ebay.com/");
		
		WebElement searchTextBox = driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']"));
		searchTextBox.click();
		searchTextBox.sendKeys("Apple");
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@class='gh-sb ']"));
		Select sel = new Select(dropDown);
		sel.selectByValue("281");
		
		driver.findElement(By.id("gh-btn")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/screenshot2.jpg");
		Files.copy(src, dest);
		
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//span[.='For Apple Watch Ocean Band Strap iWatch Ultra Series 8 7 6 5 SE 40 44 41 45 49mm']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./ScreenShot/screenshot3.jpg");
		Files.copy(src1, dest1);
	}
}
