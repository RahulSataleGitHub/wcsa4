package seleniumAssignmentBasedOnScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmBtn")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("(//a[@title='Diamond Rings'])[1]")).click();
		
		driver.findElement(By.id("Price-form")).click();
		
		driver.findElement(By.xpath("(//span[@class='prcs-dlh'])[1]")).click();
		Thread.sleep(4000);
		
		driver.close();
	}
}
