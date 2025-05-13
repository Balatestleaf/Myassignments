package week3.day2;

public class Safari extends Browser {

	public void  readerMode() {
		System.out.println("readerMode");
	}
	public void  fullScreenMode() {
		System.out.println("fullScreenMode");
	}
	public static void main(String[] args) {
		
		Safari safari=new Safari();
		safari.readerMode(); 
		safari.fullScreenMode();
		safari.closeBrowser();
	}

}
