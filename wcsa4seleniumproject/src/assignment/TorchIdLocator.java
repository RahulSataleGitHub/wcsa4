package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TorchIdLocator {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://taguigcity.brightspace.com/d2l/login");
		  
		  driver.findElement(By.name("userName")).sendKeys("rahul");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("password")).sendKeys("rahul@123");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("d2l_1_5_319")).click();
		  Thread.sleep(2000);
		  driver.close();
	}
}
