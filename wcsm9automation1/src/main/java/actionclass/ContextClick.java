package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//use action class
		Actions act=new Actions(driver);
		act.contextClick(right).perform();
		
		
	}

}
