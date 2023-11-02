package webbasedpopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup
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
        //click on alert box
         
        driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
//        //handle alert pop up and dismiss
//        Alert alt = driver.switchTo().alert();
//        alt.dismiss();
        
        Thread.sleep(2000);
//        //handle alert pop up and get text
//        Alert alert = driver.switchTo().alert();
//        String text = alert.getText();
//        System.out.println(text);
        
//        //handle the alert and accept
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
        
        //handle alert and sendkeys  it will not work
        Alert alt = driver.switchTo().alert();
        alt.sendKeys("Danish");
		
	}

}
