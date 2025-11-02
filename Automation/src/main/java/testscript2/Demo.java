package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testscript.Base;

public class Demo extends Base {
	public void check()
	{
		driver.navigate().to("https://selenium.qabible.in/form-submit.php");
		WebElement lock1= driver.findElement(By.id("validationCustom01"));
		lock1.sendKeys("Aswin");
		WebElement lock2= driver.findElement(By.id("validationCustom02"));
		lock2.sendKeys("Kumar");
		WebElement lock3= driver.findElement(By.id("validationCustomUsername"));
		lock3.sendKeys("@aswin");
		WebElement lock4= driver.findElement(By.id("validationCustom03"));
		lock4.sendKeys("Malappuram");
		WebElement lock5= driver.findElement(By.id("validationCustom04"));
		lock5.sendKeys("Kerala");
		WebElement lock6= driver.findElement(By.id("validationCustom05"));
		lock6.sendKeys("666666");
		WebElement button= driver.findElement(By.id("invalidCheck"));
		button.click();
		WebElement button1= driver.findElement(By.xpath("//button[text()='Submit form']"));
		button1.click();
	}

	public static void main(String[] args) {
		Demo demo= new Demo();
		demo.BrowserInitialization();
		demo.check();
		// TODO Auto-generated method stub

	}

}
