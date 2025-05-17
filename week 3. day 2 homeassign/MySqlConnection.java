package week3.day2;

public class MySqlConnection extends AbstractionJava{

	public static void main(String[] args) {
		
		MySqlConnection sql=new MySqlConnection();
		//call Method
		sql.JavaEclipse();
		sql.connect();
		sql.disconnect();
		sql.executeUpdate();
		sql.executeQuery();

	}
	//Method1
		public void JavaEclipse() {
			System.out.println("Program has been executed and check for the database");
		}
		//Method2
		public void connect() {
			System.out.println("Connected to the MySql connection");
		}
		//Method3
		public void disconnect() {
			System.out.println("MySql connection has been disconnected");
		}
		//Method4
		public void executeUpdate() {
			System.out.println("Updated Data has been Executed");
		}
		//Method5
		public void executeQuery() {
			System.out.println("Query Executed");
		}
	}

