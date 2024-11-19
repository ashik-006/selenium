package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base
{
	public void tagAndId() // tag#id
	{
		WebElement tag1 = driver.findElement(By.cssSelector("button#button-one"));
		WebElement tag2 = driver.findElement(By.cssSelector("input#value-a"));
		WebElement tag4 = driver.findElement(By.cssSelector("input#value-b"));
		WebElement tag5 = driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement tag6 = driver.findElement(By.cssSelector("button#button-two"));
				
	}
	public void tagAndClass() //tag.class
	{
		WebElement class1 = driver.findElement(By.cssSelector("footer.mt-5"));
		WebElement class2 = driver.findElement(By.cssSelector("div.copyright"));
		WebElement class3 = driver.findElement(By.cssSelector("div.mb-sec"));
	}
	public void tagAndAttribute() //tag[attribute='value']
	{
		WebElement attribute1 = driver.findElement(By.cssSelector("input[id='single-input-field']"));
		WebElement attribute2 = driver.findElement(By.cssSelector("button[id='button-one']"));
		WebElement attribute3 = driver.findElement(By.cssSelector("input[id='value-a']"));
	}
	public void tagClassandAttribute() //tag.classname[attribute=value]
	{
		WebElement classattribute1 = driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
		WebElement classattribute2 = driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
		WebElement classattribute3 = driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
		
		
	}
	public static void main(String[] args) 
	{
		CssSelector cssselector = new CssSelector();
		cssselector.initializeBrowser();
		cssselector.driverQuitAndClose();

	}

}
