package operationaldropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption

{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		WebElement multiple = driver.findElement(By.id("multiselect1"));
		Thread.sleep(2000);
		Select sel=new Select(multiple);
		sel.selectByVisibleText("Swift");
		sel.selectByVisibleText("Hyundai");
		sel.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		WebElement first = sel.getFirstSelectedOption();
		System.out.println(first.getText());
		driver.quit();
		
	}

}
