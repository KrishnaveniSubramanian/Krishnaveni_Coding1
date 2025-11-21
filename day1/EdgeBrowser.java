package week2.day1;

public class EdgeBrowser {
	
	//Create another Class EdgeBrowser and create an object for Browser in the main method and call 
	//both methods of Browser class of Browser class from EdgeBrowser and execute 

	public static void main(String[] args) {
		Browser browserOption = new Browser();
		browserOption.launchBrowser("Edge browser"); 
		browserOption.loadUrl();
		
		System.out.println(browserOption.loadUrl());
	

	}

}
