package synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements 
{
	public static void main(String[] args) 
	{
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.google.com/");
		 driver.switchTo().activeElement().sendKeys("Mobile");
		//List<WebElement> optionmobile = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		// for( Opm:Optionmobile)
		 
		
	}

}
