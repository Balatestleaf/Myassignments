package week3.day2;

public class Edge extends Browser {

	public void  takeSnap() {
		System.out.println("take snap");
	}
	public void clearCookies() {
		System.out.println("cookies are cleared");
	}
	public static void main(String[] args) {
		
  Edge edge=new Edge();
  edge.takeSnap();
  edge.clearCookies();
  edge.closeBrowser();
	}

}
