package test_script2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test_script.Base;

public class Table_handling extends Base
{
	public void printTable() 
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		//System.out.println(table.getText()); // to print in eclipse gettext
		String table1 = table.getText(); // EITHER WAY
		System.out.println(table1);
	}
    public void printRow()// /tbody/tr[index]-fortablerow
    {
	    driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	    WebElement row = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[01]"));
	    System.out.println(row.getText());
    }
    public void printCell() // td for  cell
    {
    	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
    	WebElement cell = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[1]"));
    	System.out.println(cell.getText());
    }
    public void assignmentRow()
    {
    	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
    	WebElement row1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[4]"));
    	System.out.println(row1.getText());
    }
    public void assignmentCell()
    {
    	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
    	WebElement cell1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[5]/td[3]"));
    	System.out.println(cell1.getText());
    }
    public void printColumn()
    {
    	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
        WebElement column1 = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
    	for (WebElement cell :column1)
    	{
    		System.out.println(cell.getText());	
    	}
    	
    }
    public void comparecolumn()
	{
    	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
        WebElement column1=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
       // String str1="Ashton Cox";
       /* for(WebElement cell : column1)
        {
        	String str2=cell.getText();
        	if(str1.equals(str2))
        	{
        		System.out.println("got same string "+str "in cell " +str2);
        	}
        }
        */
	}
    public static void main(String[] args) 
	{
		Table_handling tablehandling = new Table_handling();
		tablehandling.initializeBrowser();
		//tablehandling.printTable();
		//tablehandling.printRow();
		//tablehandling.printCell();
		//tablehandling.printColumn();
		//tablehandling.assignmentRow();
		//tablehandling.assignmentCell();
		tablehandling.comparecolumn();
		//tablehandling.driverQuitAndClose();

	}

}
