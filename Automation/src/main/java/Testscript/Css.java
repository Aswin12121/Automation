package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Css extends Base {
	public void tagAndId()
	{
		WebElement tag1= driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement tag2= driver.findElement(By.cssSelector("input#value-a"));
	}
	public void tadAndClass()
	{
		WebElement tag3= driver.findElement(By.cssSelector("div.header-top"));
		WebElement tag4= driver.findElement(By.cssSelector("section.clearfix"));
	}
	public void tagAndAttribute()
	{
		WebElement tag5= driver.findElement(By.cssSelector("type[id=button-one]"));
		WebElement tag6= driver.findElement(By.cssSelector("input[id=single-input-field]"));
	}
	public void tagClassAttribute()
	{
		WebElement tag7= driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
		WebElement tag8= driver.findElement(By.cssSelector("input.form-control[id=valu-a"));
	}

	public static void main(String[] args) {
		Css css = new Css();
		css.BrowserInitialization();
		css.tagAndId();
		css.tadAndClass();
		css.tagAndAttribute();
		css.tagClassAttribute();
		// TODO Auto-generated method stub

	}

}
