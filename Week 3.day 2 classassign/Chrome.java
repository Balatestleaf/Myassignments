package week3.day2;

public class Chrome extends Browser {
	
public void openIncognito() {
	System.out.println("openIncognito");
}
public void clearCache() {
	System.out.println("cache cleared");
}
	public static void main(String[] args) {
		Chrome chrome=new Chrome();
		chrome.clearCache();
		chrome.openIncognito();
	    chrome.navigateBack();

	}

}
