package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testscript.Base;

public class Sample extends Base{
	void locate()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement locate= driver.findElement(By.id("value-a"));
		locate.sendKeys("10");
		WebElement locate1 = driver.findElement(By.id("value-b"));
		locate1.sendKeys("20");
		WebElement button= driver.findElement(By.xpath("//button[text()='Get Total']"));
		button.click();
	}


	public static void main(String[] args) {
		Sample sample=new Sample();
		sample.BrowserInitialization();
		sample.locate();
		// TODO Auto-generated method stub

	}

}
