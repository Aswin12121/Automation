package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testscript.Base;

public class CheckBox extends Base {
	public void handle()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox1= driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkbox1.click();
	}
	public void checkOrNot()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox1= driver.findElement(By.xpath("//input[@id='gridCheck']"));
		if(checkbox1.isSelected())
		{
			System.out.println("Checkbox is alreday selected");

		}
		else
		{
			checkbox1.click();
		}
	}

	public static void main(String[] args) {
		CheckBox checkbox= new CheckBox();
		checkbox.BrowserInitialization();
		checkbox.handle();
		// TODO Auto-generated method stub

	}

}
