package Testscript;

public class BrowserCommands extends Base {
	public void browercommands()//used to inetract with the browser and perform various acions.
	{
		//String Title= driver.getTitle();//get the title of the current page.
		//System.out.println(Title);
		//String Current=driver.getCurrentUrl();//get the url of the current page
		//System.out.println(Current);
		String Page=driver.getPageSource();//get the html source code of the curent page
		System.out.println(Page);
	}

	public static void main(String[] args) {
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.BrowserInitialization();
		browsercommands.browercommands();
		// TODO Auto-generated method stub

	}

}
