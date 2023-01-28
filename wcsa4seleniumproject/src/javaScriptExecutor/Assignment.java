package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/RAHUL%20FOLDER/Selenium%20Data/WebElements/DisabledEnbledElement.html");
		
		WebElement username = driver.findElement(By.id("i1"));
		WebElement password = driver.findElement(By.id("i2"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		if(username.isEnabled())
		{
			username.sendKeys("admin");
			System.out.println("If Block will get Executed");
		}
		else
		{
			jse.executeScript("document.getElementById('i1').value='admin'");
			System.out.println("Else Block will get Executed");
		}
		
		if(password.isEnabled())
		{
			password.sendKeys("manager");
			System.out.println("If Block will get Executed");
		}
		else
		{
			jse.executeScript("document.getElementById('i2').value='manager'");
			System.out.println("Else Block will get Executed");
		}
		
		
	}
}
