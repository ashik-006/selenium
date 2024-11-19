package test_script;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base 

{
	public WebDriver driver;//globally declared //import webdriver
	public void initializeBrowser()
	{
		driver=new ChromeDriver();//loading the driver
		driver.get("https://selenium.qabible.in/");//launch URl
		driver.manage().window().maximize();//to maximize the window
		
	}
	public void driverQuitAndClose() 
	{
		//driver.close();//to close the parent window
		//driver.quit(); //to close all the windows
	}

	public static void main(String[] args) 
	{
		Base base=new Base();
		base.initializeBrowser();
		base.driverQuitAndClose();

	}

}
