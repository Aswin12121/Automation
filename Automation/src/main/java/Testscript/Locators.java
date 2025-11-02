package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	void id()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//WebElement elementname=driver.findElement(By.Locator("locator value"));
		WebElement mssgfield= driver.findElement(By.id("single-input-field"));
		//mssgfield.sendKeys("Aswin");
		WebElement showmssg= driver.findElement(By.id("button-one"));
		//showmssg.click();
		WebElement valA= driver.findElement(By.id("value-a"));
		//valA.sendKeys("11");
		WebElement gettotal= driver.findElement(By.id("button-two"));
		gettotal.click();
	}
	void className()
	{
		WebElement class1= driver.findElement(By.className("clearfix"));
	}

		void name()
		{
			WebElement name1= driver.findElement(By.name("viewport"));
		}
		void linkText()
		{
			WebElement link1= driver.findElement(By.linkText("Ajax Form Submit"));
			WebElement link2= driver.findElement(By.linkText("Jquery Select2"));
			WebElement linn3= driver.findElement(By.linkText("Form Submit"));
		}

		public void partialLinkText()
		{
			WebElement par1= driver.findElement(By.partialLinkText("Ajax F"));
			WebElement par2= driver.findElement(By.partialLinkText("Jquery s"));
			WebElement par3= driver.findElement(By.partialLinkText("Select I"));
		}
	public static void main(String[] args) {
		Locators locators= new Locators();
		locators.BrowserInitialization();
		locators.id();
		locators.className();
		locators.name();
		locators.linkText();
		locators.partialLinkText();

		// TODO Auto-generated method stub

	}

}
