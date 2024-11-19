package test_script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Radio_button extends Base
{
public void radioButton()
{
	//click
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	//female is inspected
	WebElement radio1 = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
	radio1.click();
	WebElement radio2 = driver.findElement(By.xpath("//button[@id='button-one']"));
	radio2.click();
	
}
public void isSelected()
{
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	WebElement radio1 = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
	radio1.click();
	Boolean wish=radio1.isSelected(); //is selected by selenium
	System.out.println(wish);
}
public void checkSelect()
{
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	WebElement radio1 = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
	radio1.click();
	Boolean wish=radio1.isSelected(); //is selected by selenium
	System.out.println(wish);
	if(wish)
	{
		System.out.println("female is already selected");
	}
	else
	{
		radio1.click();
		System.out.println("female is selected now");
		
	}
}
public void isEnabled()
{
	
}
public void isdisplayed()
{
	
}
public static void main(String[] args)
	{
	Radio_button radiobutton = new Radio_button();
	radiobutton.initializeBrowser();
	radiobutton.radioButton();
	radiobutton.isSelected();
	radiobutton.checkSelect();
	}

}
