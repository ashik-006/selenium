package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_browser 
{
	public WebDriver driver;
	public void initializeBrowser()
	{
		driver=new EdgeDriver();
		driver.get("https://selenium.qabible.in/");
	
	}
	public static void main(String[] args) 
	{
	
		Edge_browser obj=new Edge_browser();
		obj.initializeBrowser();
	}

}
