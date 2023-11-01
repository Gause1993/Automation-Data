package operationaldropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		WebElement singleselect = driver.findElement(By.id("drop1"));
		WebElement multiselect = driver.findElement(By.id("multiselect1"));
		Select sel=new Select(singleselect);
		System.out.println(sel.isMultiple());
		Thread.sleep(2000);
		Select sel1=new Select(multiselect);
		System.out.println(sel1.isMultiple());
	}

}
