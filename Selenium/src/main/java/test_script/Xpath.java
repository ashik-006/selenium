package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base
{
public void xPath() //-//tagname[@attribute='value']
// double slash - current node
{
WebElement xpath1 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
WebElement xpath2 = driver.findElement(By.xpath("//button[@id='button-one"));
WebElement xpath3 = driver.findElement(By.xpath("//input[@id='value-a']"));
WebElement xpath4 = driver.findElement(By.xpath("//input[@id=\'value-b\']"));
WebElement xpath5 = driver.findElement(By.xpath("//button[@id=\"button-two\"]"));

}
public void contains() //-//tag[contains(@attribute,'value')]
{
	WebElement contains1 = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
	WebElement contains2 = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
	
}
public void startsWith()//-//tag[starts-with(@attribute,'value')]
{
	WebElement startswith1 = driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]"));
	WebElement startswith2 = driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
}
public void text()//tag[text()='text']
{
	WebElement text1 = driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebELement text2 = driver.findElement(By.xpath("//label[text()='Enter value A']"));
}
public void and() //tag[@attribute='value'and @attribute='value']
{
	WebElement and1 = driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
	WebElemet and2 = driver.findElement(By.xpath("//button[@class='btn btn-primary' and @id='button-two']"));
}
public void or() //tag[@attribute='value'or @attribute='value']
{
	WebElement or1 = driver.findElement(By.xpath("//input[@class='form-control'or @id='value-a']"));
	WebElement or2 = driver.findElement((By.xpath("//input[@type='text'or @id='single-input-field']"));
}
	public static void main(String[] args) 
	{
		Xpath xpath =new Xpath();
		xpath.initializeBrowser();
		xpath.driverQuitAndClose();
		
	}

}
