package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartNamePrice
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("span[class=\"_30XB9F\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"_3879cV\"  and (text()='Core i5')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		driver.findElement(By.xpath("//div[@class=\"_3879cV\"   and text()='Windows 10']")).click();
	}

}
