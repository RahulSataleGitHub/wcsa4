package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/RAHUL%20FOLDER/Selenium%20Data/WebElements/MultiDropdown.html");
		
		WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='m1']"));
	    Select sel = new Select(dropDownElement);
	    
	    List<WebElement> alloptions = sel.getOptions();
	    for (WebElement opts : alloptions) 
	    {
		    if (opts.getText().equals("Poha")) 
		    {
			     opts.click();
			     break;
			}	
		}

	}

}