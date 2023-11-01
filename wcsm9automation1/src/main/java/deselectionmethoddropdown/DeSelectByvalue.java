package deselectionmethoddropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByvalue 
{
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		WebElement multiple = driver.findElement(By.id("multiselect1"));
		Select sel=new Select(multiple);
		sel.selectByValue("volvox");
		sel.selectByValue("Hyundaix");
		sel.selectByValue("swiftx");
		Thread.sleep(3000);
		sel.deselectByValue("volvox");
		
		
		
	}

}
