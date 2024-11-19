package test_script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test_script.Base;

public class Dropdown extends Base
//dropdown listt of choices - select class is provided by selenium
// select tag , input tag is used
// 3methods are used
{
	//select is inspected 
public void index()
{
	
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement index1 = driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select select = new Select(index1);  //select class by selenium
	select.selectByIndex(1); //index by color (1 for selecting red,)	
	
}
public void value()
{
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement value1 = driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select select = new Select(value1);
	select.selectByValue("Yellow"); // select by value from dom
	
}
public void visibleText()
{
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement visible1 = driver.findElement(By.xpath("//select[@id='single-input-field']"));
	Select select = new Select(visible1);
	select.selectByVisibleText("Green");// select by text from dom
}
	public static void main(String[] args) 
	{
		Dropdown dropdown = new Dropdown();
		dropdown.initializeBrowser();
		dropdown.index();
		dropdown.value();
		dropdown.visibleText();
		//dropdown.driverQuitAndClose();	
	}

}
