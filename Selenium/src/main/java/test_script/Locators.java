package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base
{
public void id()
{
	//WebElement elementname=driver.findElement(By.locator("locatorvalue"));
	WebElement element1 = driver.findElement(By.id("single-input-field"));//by class id method
	element1.sendKeys("hello");
	WebElement showmessage = driver.findElement(By.id("button-one"));
	showmessage.click();
	
}
public void example()
{
	
	WebElement entervaluea = driver.findElement(By.id("value-a"));
	entervaluea.sendKeys("HELLO");
	WebElement entervalueb = driver.findElement(By.id("value-b"));
	entervalueb.sendKeys("WORLD");
	WebElement gettotal = driver.findElement(By.id("button-two"));
	gettotal.click();
	
	WebElement firstname = driver.findElement(By.id("validationCustom01"));
	firstname.sendKeys("ASHIK");
	WebElement lastname = driver.findElement(By.id("validationCustom02"));
	lastname.sendKeys("ASHI");
	WebElement checkbox = driver.findElement(By.id("invalidCheck"));
	checkbox.click();
	//nosubmit
	
	/*WebElement singlecheckbox = driver.findElement(By.id("gridCheck"));
	singlecheckbox.click();
	WebElement multiplecheckbox =driver.findElement(By.id("check-box-one"));
	multiplecheckbox.click();*/
    
	
}
public void className()
{
	
	WebElement date = driver.findElement(By.className("form-control datepicker"));
	WebElement sec = driver.findElement(By.className("mb-sec"));
	WebElement clear = driver.findElement(By.className("clearfix"));
}
public void name()
{
	WebElement name1 = driver.findElement(By.name("viewport"));
	WebElement name2 = driver.findElement(By.name("description"));
	WebElement name3 = driver.findElement(By.name("keywords"));
	
}
public void linkText()
{
	WebElement text1 = driver.findElement(By.linkText("Simple Form Demo"));
	WebElement text2 = driver.findElement(By.linkText("Checkbox Demo"));
	WebElement text3 = driver.findElement(By.linkText("Radio Buttons Demo"));
	
}
public void partialLinkText()
{
	WebElement partial1 = driver.findElement(By.partialLinkText("Select In"));
	WebElement partial2 = driver.findElement(By.partialLinkText("Jquery Sel"));
	WebElement partial3 = driver.findElement(By.partialLinkText("Checkbox D"));
}

	public static void main(String[] args) 
	{
		Locators locatingmethods=new Locators();
		locatingmethods.initializeBrowser();
		locatingmethods.example();
		locatingmethods.id();
		locatingmethods.driverQuitAndClose();
	}

}
