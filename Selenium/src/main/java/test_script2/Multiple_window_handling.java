package test_script2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Multiple_window_handling extends Base
{
public void multipleWindow()
{
	driver.navigate().to("https://webdriveruniversity.com/");
	WebElement contact = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
	contact.click();
	WebElement login = driver.findElement(By.xpath("//h1[text() = 'LOGIN PORTAL']"));
	login.click();
	String parent =driver.getWindowHandle();
	System.out.println("parent  " + parent);
	Set<String> allwindows = driver.getWindowHandles(); // mouseover create local var (set)
	for(String temp:allwindows)
	{
		System.out.println("windows  " +temp);
		driver.switchTo().window(temp);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("**************************************");
	}
	
	
}
	public static void main(String[] args) 
	{
		Multiple_window_handling multiplewindowhandling = new Multiple_window_handling();
		multiplewindowhandling.initializeBrowser();
		multiplewindowhandling.multipleWindow();
		//multiplewindowhandling.driverQuitAndClose();

	}

}
