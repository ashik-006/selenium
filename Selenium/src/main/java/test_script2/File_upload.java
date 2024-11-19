package test_script2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class File_upload extends Base
{
	public void sendKeys()
	{
		// for upload
		/*driver.navigate().to("https://demoqa.com/upload-download");
		WebElement upload1 = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		upload1.sendKeys("C:\\Users\\Smart\\OneDrive\\Desktop\\notes\\JAVA.pdf");	*/
		
		//for choose and upload
		driver.navigate().to("https://practice.expandtesting.com/upload#google_vignette");
		WebElement choose = driver.findElement(By.xpath("//input[@id='fileInput']"));
		choose.sendKeys("C:\\Users\\Smart\\OneDrive\\Desktop\\notes\\JAVA.pdf");
		WebElement upload2 = driver.findElement(By.xpath("//button[@id='fileSubmit']"));
		upload2.click();
	}
	
public void robotClass() throws AWTException 
{
	driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
	WebElement robot1 = driver.findElement(By.xpath("//a[@id='pickfiles']"));
	robot1.click();
	StringSelection stringselection = new StringSelection("C:\\Users\\Smart\\OneDrive\\Desktop\\notes\\JAVA.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
	Robot robot = new Robot();
	robot.delay(250);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_CONTROL); //copy
	robot.keyPress(KeyEvent.VK_V); //paste
	robot.keyRelease(KeyEvent.VK_CONTROL); // button release
	robot.keyRelease(KeyEvent.VK_V); // button release
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
	public static void main(String[] args) throws AWTException 
	{
		File_upload fileupload = new File_upload();
		fileupload.initializeBrowser();
		//fileupload.sendKeys();
		fileupload.robotClass();
		//fileupload.driverQuitAndClose();

	}

}
