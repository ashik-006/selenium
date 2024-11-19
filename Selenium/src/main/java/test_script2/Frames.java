package test_script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Frames extends Base
{
	public void frames() // first switch to iframe then click, first click if not wrok check iframe
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement frameimg = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frameimg.click();
	}

	public static void main(String[] args) 
	{
		Frames frames= new Frames();
		frames.initializeBrowser();
		frames.frames();
		//frames.driverQuitAndClose();

	}

}
