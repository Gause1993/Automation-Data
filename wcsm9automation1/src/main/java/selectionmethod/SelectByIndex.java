package selectionmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
//		WebElement single = driver.findElement(By.id("drop1"));
//		Select sel=new Select(single);
//		for(int i=0;i<=4;i++)
//		{
//			Thread.sleep(2000);
//			sel.selectByIndex(i);
//		}
		
		WebElement multiple = driver.findElement(By.id("multiselect1"));
		Select sel=new Select(multiple);
		for(int i=0;i<=4;i++) 
		{
			sel.selectByIndex(i);
			
		}
		
		
		
	}

}
