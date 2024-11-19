package test_script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Demosite extends Base
{
public void demo1()
{

driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
WebElement element1 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
element1.sendKeys("ASHIK");
WebElement element2 = driver.findElement(By.xpath("//button[@id='button-one']"));
element2.click();

}
public void demo2()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement element3 =driver.findElement(By.xpath("//input[@id='value-a']"));
	element3.sendKeys("10");
	WebElement element4 = driver.findElement(By.xpath("//input[@id='value-b']"));
	element4.sendKeys("5");
	WebElement element5 = driver.findElement(By.xpath("//button[@id='button-two']"));
	element5.click();
	
}

	public static void main(String[] args) 
	{
		Demosite demosite = new Demosite();
		demosite.initializeBrowser();
		//demosite.demo1();
		demosite.demo2();
		demosite.driverQuitAndClose();

	}

}
