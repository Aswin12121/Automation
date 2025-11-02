package Testscript;

public class Navigation extends Base {
	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in");//to visit new page
		driver.navigate().back();//goes back to previous page
		driver.navigate().forward();//goes back to the next page
		driver.navigate().refresh();//refresh current page
	}

	public static void main(String[] args) {
		Navigation navigation= new Navigation();
		navigation.BrowserInitialization();
		navigation.navigationCommands();
		// TODO Auto-generated method stub

	}

}
