package week3.day2;

public class JavaConnection implements DatabaseConnection{
	

	public static void main(String[] args) {
		
		JavaConnection java=new JavaConnection();
	//call Method
		java.connect();
		java.disconnect();
		java.executeUpdate();
		java.JREImplements();
}
	
	public void connect() {
		System.out.println("Connected to the DataBase");
	}

	public void disconnect() {
		System.out.println("Disconnected from the DataBase");
	}

	public void executeUpdate() {
		System.out.println("Updated version has been Executed");
	}
	public void JREImplements() {
		System.out.println("Implements correct Version of JRE Library files");
}
}