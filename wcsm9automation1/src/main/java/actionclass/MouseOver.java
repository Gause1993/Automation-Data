package actionclass;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		
		WebElement Blogs = driver.findElement(By.id("blogsmenu"));	
		
		//perform action on blog spot
		 
		Actions act=new Actions(driver);
		act.moveToElement(Blogs).perform();
		
		Thread.sleep(2000);
		WebElement Blogs1 = driver.findElement(By.xpath("//span[text()='SeleniumOneByArun']"));
		
		act.moveToElement(Blogs1).click().build().perform();
		
	}


}
