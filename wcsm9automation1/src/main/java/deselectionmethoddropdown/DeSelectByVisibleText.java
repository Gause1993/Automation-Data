package deselectionmethoddropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByVisibleText
{
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		WebElement variable = driver.findElement(By.id("multiselect1"));
		Select sel=new Select(variable);
		sel.selectByVisibleText("Audi");
		sel.selectByVisibleText("Swift");
		sel.selectByVisibleText("Hyundai");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Swift");
		
	}

}
