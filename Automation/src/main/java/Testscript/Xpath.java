package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base{
	//absolute path - /html/body/div[1]/form/input[1]

	public void relativeXpath()
	{
		WebElement path1= driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement path2= driver.findElement(By.xpath("//button[@id='button-two']"));
	}
	public void textOff()
	{
		WebElement text1= driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement text2= driver.findElement(By.xpath("//button[text()='Get Total']"));

	}
	public void contains()
	{
		//tag[contains(@attribute,'value')
		WebElement con1= driver.findElement(By.xpath("//input[contains(@id,'lue-a')]"));
		WebElement con2= driver.findElement(By.xpath("//button[contains(@id,'one')]"));
	}
	public void startsWith()
	{
		//tag[starts-with(@attribute,'value')
		WebElement starts1= driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement starts2= driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
	}
	void and()
	{
		//tag[@attribute= 'value' and attribute='value']
		WebElement and1= driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		WebElement and2= driver.findElement(By.xpath("//input[@id='value-a' and @type='text']"));
	}

	void or()
	{
		//tag[@attribute='value' or attribute='value'
	}
	public static void main(String[] args) {
		Xpath xpath= new Xpath();
		xpath.BrowserInitialization();
		xpath.relativeXpath();
		xpath.textOff();
		xpath.startsWith();
		xpath.and();
		xpath.or();


	}

}
