package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Testscript.Base;

public class ActionClass extends Base {
	public void dragDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1= driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drop1= driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag1, drop1).perform();
		}
	public void rightClick()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement rightclick1= driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		Actions action= new Actions(driver);
		action.contextClick(rightclick1).perform();
	}
	public void mouseHover()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement mousehover1= driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		Actions action= new Actions(driver);
		action.moveToElement(mousehover1).perform();	
	}
	public void doublrClick()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement doubleclick1= driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		Actions action= new Actions(driver);
		action.doubleClick(doubleclick1).perform();
	}
	public void click()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement click1= driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		Actions action= new Actions(driver);
		action.click(click1).perform();
	}

	public static void main(String[] args) {
		ActionClass actionclass= new ActionClass();
		actionclass.BrowserInitialization();
		actionclass.dragDrop();
		//actionclass.rightClick();
		//actionclass.mouseHover();
		//actionclass.doublrClick();
		//actionclass.click();
	}

}
