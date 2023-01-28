package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIdLocator {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCj0KCQiA4aacBhCUARIsAI55maGLtp6ydqxuNbX_Wjltpmr19wtZYoiIWSvShbF8fKfTwcS4HMvVmPAaAtv9EALw_wcB%26hvadid%3D398134035836%26hvdev%3Dc%26hvlocphy%3D1007788%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D5927649583414769057%26hvtargid%3Dkwd-294882733100%26hydadcr%3D24542_1971411%26tag%3Dgooginhydr1-21%26ref%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		  
		  driver.findElement(By.name("email")).sendKeys("rahulsatale2001@gmail.com");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("continue")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("password")).sendKeys("rahul@123");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.id("signInSubmit")).click();
		  Thread.sleep(2000);
		  driver.close();
	}
}
