package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testscript.Base;

public class RadioButtonHandling extends Base {
	public void handling()
	{

		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio1= driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement button1= driver.findElement((By.id("button-one")));
		radio1.click();
		button1.click();
	}
	public void isSelected()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radio1= driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		if(radio1.isSelected())
		{
			System.out.println("Male button isclicked");

		}
		else
		{
			radio1.click();
		}
	}


	public static void main(String[] args) {
		RadioButtonHandling radiobuttonhandling= new RadioButtonHandling();
		radiobuttonhandling.BrowserInitialization();
		radiobuttonhandling.handling();
		radiobuttonhandling.isSelected();
		// TODO Auto-generated method stub

	}

}
