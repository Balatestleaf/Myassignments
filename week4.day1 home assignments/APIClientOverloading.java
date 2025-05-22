package week4.day1;

public class APIClientOverloading {
    //Method 1 with one argument
	public void sendRequest (String endpoint){
		//System.out.println("Connected to API");
		System.out.println(endpoint);
	}
	//Method 2 with three argument
	public void sendRequest (String endpoint,String requestBody,boolean requestStatus) {
		//System.out.println("Connected to API in Method 2");
		//System.out.println("Method 2 requestBody");
		//System.out.println("Connection status Active");
		System.out.println(endpoint+" "+requestBody+" "+requestStatus);
	}
	public static void main(String[] args) {	
		APIClientOverloading API = new APIClientOverloading();
	//Method Overloading
	API.sendRequest("Method 1");
	API.sendRequest("connected", "title", true);
	}

}
