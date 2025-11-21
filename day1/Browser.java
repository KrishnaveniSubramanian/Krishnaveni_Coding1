package week2.day1;

public class Browser {
	
	
	//-Create methods as launchBrowser(String browserName) with one input argument 
	//naming convention - camelCase
	
	public void launchBrowser(String browserName) {
		//Print the browserName
		System.out.println("Edge browser");
		
	}
	
	//Create a method loadUrl()
	public String loadUrl () {
		return "URL loaded successfully";
		
	}
	
	
	public static void main (String args[]) {
		
		//Create object in main method
		Browser browserOption = new Browser();
		
		//call two methods
		
		browserOption.launchBrowser("Edge browser"); 
		browserOption.loadUrl();
		
		System.out.println(browserOption.loadUrl());
	
	
	

}
	
}
