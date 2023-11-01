package operationaldropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions 
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
		sel.selectByVisibleText("Volvo");
		sel.selectByVisibleText("Swift");
		sel.selectByVisibleText("Hyundai");
		List<WebElement> alloptions = sel.getAllSelectedOptions();
		for(WebElement ops:alloptions)
		{
			System.out.println(ops.getText());
		}
		driver.quit();
		
	}

}
