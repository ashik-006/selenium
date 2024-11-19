package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import test_script.Base;

public class Flipkart extends Base
{
public void flip() 
{
	driver.navigate().to("https://www.flipkart.com/");
	WebElement flipy1 = driver.findElement(By.xpath("//span[text()='Login']"));
	flipy1.click();
	WebElement flipy2 = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
	flipy2.click();
	flipy2.sendKeys("9947262861");
	WebElement flipy3 = driver.findElement(By.xpath("//button[text()='Request OTP']"));
	flipy3.click();
	
}
public void flip1()
{
	driver.navigate().to("https://www.flipkart.com/");
	WebElement flipy = driver.findElement(By.xpath("//div[@id='toast-ctn']"));
	Select select = new Select(flipy);  //select class by selenium
	select.selectByIndex(1);
	//Actions actions = new Actions(driver);
	//actions.moveToElement(flipy).build().perform();
	//WebElement flipy1 = driver.findElement(By.xpath("//span[text()='Men']"));
	//WebElement flipy2 = driver.findElement(By.xpath(""));
	//flipy2.click();
}
	public static void main(String[] args) 
	{
		Flipkart flipkart = new Flipkart();
		flipkart.initializeBrowser();
		//flipkart.flip();
		flipkart.flip1();

	}

}
