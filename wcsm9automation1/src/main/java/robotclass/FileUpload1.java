package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload1 
{
	public static void main(String[] args) throws AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/upload-download");
		//use action class
		WebElement choosefile = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(choosefile).click().perform();
		
		//perform copy action on click board
		Robot rbt=new Robot();
		StringSelection ss = new StringSelection("\"E:\\Danish resume  BE.docx\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//perform ctrl+v action
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_V);
		
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
