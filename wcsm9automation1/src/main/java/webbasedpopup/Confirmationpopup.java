package webbasedpopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmationpopup
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		//click on pop 
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		//click on java script
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(2000);
		//click on confirm
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		//click on confirm pop up
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(2000);
		//        //handle confirm pop up and dismiss
		//        Alert alt = driver.switchTo().alert();
		//        alt.dismiss();

		//        //handle confirm pop up and accept
		//        Alert alt1 = driver.switchTo().alert();
		//        alt1.accept();

		//handle confirm pop up and sendkeys
		Alert alt1 = driver.switchTo().alert();
		alt1.sendKeys("yes");
		alt1.accept();

		//        //handle confirm pop up get text
		//        Alert alt = driver.switchTo().alert();
		//        String text = alt.getText();
		//        System.out.println(text);



	}

}
