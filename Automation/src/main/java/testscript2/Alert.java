package testscript2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Testscript.Base;

public class Alert extends Base {
	public void simpleAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert1= driver.findElement(By.className("btn-success"));
		alert1.click();
		org.openqa.selenium.Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());//for reading the alert message
		myalert.accept();
	}
	public void  conformationAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert2= driver.findElement(By.className("btn-warning"));
		alert2.click();
		org.openqa.selenium.Alert myalert1=driver.switchTo().alert();
		System.out.println(myalert1.getText());
		myalert1.accept();
		//driver.switchTo().alert().accept();//close alert using OK button
        //driver.switchTo().alert().dismiss();//close alert using cancel button
	}
	public void promptAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert3= driver.findElement(By.className("btn-danger"));
		alert3.click();
		org.openqa.selenium.Alert myPromt=driver.switchTo().alert();
		myPromt.sendKeys("Aswin");
		myPromt.accept();
	}

	public static void main(String[] args) {
		Alert alert= new Alert();
		alert.BrowserInitialization();
		//alert.simpleAlert();
		alert.conformationAlert();
		//alert.promptAlert();
		
		// TODO Auto-generated method stub

	}

}
