package week4.day1;

public class LoginPageOverriding extends BasePageOverriding{
//implemented method
	public void username() {
		System.out.println("enter username");
	}
	
	public void password() {
		System.out.println("enter password");
	}
	
	//Method overriding
	//unimplemented method
	public void  performCommonTasks(){
		System.out.println("Method got override");
	}
	
	public static void main(String[] args) {
		
		LoginPageOverriding lor= new LoginPageOverriding();
		lor.username();
		lor.password();
		lor.performCommonTasks();
	}

}
