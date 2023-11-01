package selection;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://demoapps.qspiders.com/dropdown");
		WebElement text = driver.findElement(By.xpath("//label[text()='Gender']/following-sibling::select"));
		Select sel=new Select(text);
		//sel.selectByVisibleText("Male");
		//sel.selectByIndex(3);
		//sel.selectByValue("1");
		for(int i=0;i<=3;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
	}

}
