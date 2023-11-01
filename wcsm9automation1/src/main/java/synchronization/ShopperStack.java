package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack
{
  public static void main(String[] args) 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	  driver.get("https://www.shoppersstack.com/");
	  driver.findElement(By.id("men")).click();
	  driver.findElement(By.xpath("//img[@alt=\"Levis Mens Regular Fit Tee\"]")).click();
	  
	
  }
}
