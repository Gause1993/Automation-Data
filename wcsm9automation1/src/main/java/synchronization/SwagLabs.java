package synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user\r\n");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[id=\"login-button\"]")).click();
		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);
		List<WebElement> element = driver.findElements(By.partialLinkText("fsffs "));
		System.out.println("element"+ element.size() );
		
	}

}
