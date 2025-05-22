package week4.day1;

public class BasePageOverriding {
	//Method 1
	public void findElement() {
		System.out.println("Find element");
	}
	//Method 2
	public void  clickElement() {
		System.out.println("click element");
	}
	//Method 3
	public void enterText() {
		System.out.println("enter text of the element");
	}
	//Method 4
	public void  performCommonTasks(){
		System.out.println("output of the element");
	}
	
	public static void main(String[] args) {
	//creating object for the class	
		BasePageOverriding BP = new BasePageOverriding();
	//Method calling	
		BP.findElement();
		BP.clickElement();
		BP.enterText();
		BP.performCommonTasks();
	}

}
