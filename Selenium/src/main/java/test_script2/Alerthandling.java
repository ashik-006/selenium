package test_script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Alerthandling extends Base
{
	// Alert interface is provided by selenium, 3 types
	//methods-accept,dismiss,getText,sendKeys
	public void simpleAlert() // ok only
	{
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	//inspect green button (simple)
	WebElement simple = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	simple.click();
	String alerttext=driver.switchTo().alert().getText(); // to fetch texts of alerts assisgned to string for printed
	System.out.println(alerttext);
	driver.switchTo().alert().accept(); // switched to alert bcs alert is not an html element	
	}
    public void confirmationAlert() //ok and cancel
    {
	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
	WebElement confirmation = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	confirmation.click();
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
    }
    public void promptAlert() // ok ,cancel with text enter
    {
    	driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
    	WebElement prompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
    	prompt.click();
    	driver.switchTo().alert().sendKeys("ashik");
    	driver.switchTo().alert().accept();
    	//driver.switchTo().alert().dismiss()
    }
public static void main(String[] args)
	{
		Alerthandling alerthandling = new Alerthandling();
		alerthandling.initializeBrowser();
		alerthandling.simpleAlert();
		//alerthandling.confirmationAlert();
		//alerthandling.promptAlert();
		//alerthandling.driverQuitAndClose();

	}

}
