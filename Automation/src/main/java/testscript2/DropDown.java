package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Testscript.Base;

public class DropDown extends Base {
	public void drop()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown1= driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select= new Select(dropdown1);
		//select.selectByVisibleText("Red");
		//select.selectByIndex(2);
		select.selectByValue("Green");
	}

	public static void main(String[] args) {
		DropDown dropdown =new DropDown();
		dropdown.BrowserInitialization();
		dropdown.drop();
		// TODO Auto-generated method stub

	}

}
