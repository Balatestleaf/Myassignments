package week3.day2;

public class EbayTestData extends TestData {

	public void enterUsername() {
		System.out.println("Enter username from EbayTestData");
	}
	public void enterPassword() {
		System.out.println("Enter password from EbayTestData");
	}
	public static void main(String[] args) {
		
		EbayTestData Ebay = new EbayTestData();
		Ebay.enterUsername();
		Ebay.enterPassword();
		Ebay.enterCredentials();
		Ebay.navigateToHomePage();

	}

}
