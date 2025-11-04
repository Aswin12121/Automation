package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testscript.Base;

public class TableHandling extends Base{
	public void tablePrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table1= driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table1.getText());
	}
	public void rowPrinting()
	{
		WebElement row1= driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]"));
		System.out.println(row1.getText());

	}
	public void cellPrinting()
	{
		WebElement cell1= driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]//td[3]"));
		System.out.println(cell1.getText());
	}
	public void coloumnPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> colo1= driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(WebElement list:colo1)
		{
			System.out.println(list.getText());
		}
	}
	public void check()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement>checkprint= driver.findElements(By.xpath("//table [@id='dtBasicExample']//tbody//tr//td[1]"));
		String name= "Ashton Cox";
		for(WebElement che:checkprint)
		{
			if(che.getText().equalsIgnoreCase(name))
			{
				System.out.println(name +" is present in the table");
			}
		}
	}
	

	public static void main(String[] args) {
		TableHandling tablehandling= new TableHandling();
		tablehandling.BrowserInitialization();
//		tablehandling.tablePrinting();
//		tablehandling.rowPrinting();
//		tablehandling.cellPrinting();
//		tablehandling.coloumnPrinting();
		tablehandling.check();
		// TODO Auto-generated method stub

	}

}
