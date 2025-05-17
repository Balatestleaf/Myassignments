package week3.day2;

public class AjioTestData extends TestData{

	public void enterUsername() {
		System.out.println("Enter username from AjioTestData");
	}
	public void enterPassword() {
		System.out.println("Enter password from AjioTestData");
	}
	public static void main(String[] args) {
		
		AjioTestData Ajio = new AjioTestData();
		Ajio.enterUsername();
		Ajio.enterPassword();
		Ajio.enterCredentials();
		Ajio.navigateToHomePage();

	}

}
