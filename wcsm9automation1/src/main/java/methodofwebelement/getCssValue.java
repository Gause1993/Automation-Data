package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		String value = driver.findElement(By.linkText("Page One")).getCssValue("cursor");
		System.out.println(value);
		
	}

}
