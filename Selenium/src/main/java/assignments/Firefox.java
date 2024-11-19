package assignments;

import org.openqa.selenium.WebDriver;

public class Firefox 
{
	public class Firefox_browser
	{
		public WebDriver driver;
		public void initializebrowser()
		{
			Firefox obj=new FirefoxDriver();
			driver.get("https://selenium.qabible.in/");
					
		}
	}

	public static void main(String[] args)
	{
		

	}

}
