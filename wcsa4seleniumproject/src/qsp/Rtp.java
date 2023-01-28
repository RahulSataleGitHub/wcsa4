package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("which browser u want to open!!!");
		String browserValue = sc.next();
		if (browserValue.equalsIgnoreCase("chrome")) {
		    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		    driver = new ChromeDriver();
		    Options manage = driver.manage();
		    Window window = manage.window();
		    window.maximize();
		    driver.get("https://www.instagram.com/");
		    Thread.sleep(4000);
		    driver.close();
			
		} else if (browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/");
			Thread.sleep(4000);
			driver.close();
		} 
		else {
			System.out.println("enter valid browser name!!");
		}

	}

}
