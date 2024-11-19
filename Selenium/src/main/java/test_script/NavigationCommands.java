package test_script;

public class NavigationCommands extends Base
{
public void navigationCommands()
{
	driver.navigate().to("https://www.amazon.in/");//first obsqura then amazon
	driver.navigate().back();//back to obsqura
	driver.navigate().forward();//forward to amazon
	driver.navigate().refresh();// refresh the page
	}
	public static void main(String[] args) 
	{
		NavigationCommands navigationcommands = new NavigationCommands();
		navigationcommands.initializeBrowser();//first invoke then methods
		navigationcommands.navigationCommands();
		navigationcommands.driverQuitAndClose();

	}

}
