package week3.day2;

public class ButtonWebElement extends WebElement{
//implement submit
	
	public void  submit() {
		System.out.println("Click submit");
	}
	
	
	public static void main(String[] args) {
		ButtonWebElement button=new ButtonWebElement();
		button.submit();
		

	}

}
