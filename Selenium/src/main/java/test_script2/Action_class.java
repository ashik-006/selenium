package test_script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import test_script.Base;

public class Action_class extends Base

{
public void doubleClick()
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement drag1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	//WebElement drag2 = driver.findElement(By.xpath("//div[@id='mydropzone']"));
	Actions actions = new Actions(driver);
	actions.doubleClick(drag1).build().perform();
	
}
public void mouseOver() //movetoelement to use mouseover
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement drag1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	Actions actions = new Actions(driver);
	actions.moveToElement(drag1).build().perform();
	
}
public void dragAndDrop()
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement drag1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	WebElement drag2 = driver.findElement(By.xpath("//div[@id='mydropzone']"));
	Actions actions = new Actions(driver);
	actions.dragAndDrop(drag1, drag2).build().perform();
	
}
public void rightClick() // contextclick for rightclicking
{
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement drag1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	Actions actions = new Actions(driver);
	actions.contextClick(drag1).build().perform();
	
}
	public static void main(String[] args) 
	{
		Action_class actionclass = new Action_class();
		actionclass.initializeBrowser();
		//actionclass.doubleClick();
		//actionclass.mouseOver();
		//actionclass.dragAndDrop();
		actionclass.rightClick();
		//actionclass.driverQuitAndClose();
	}

}
