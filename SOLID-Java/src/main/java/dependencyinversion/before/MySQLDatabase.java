package dependencyinversion.before;

public class MySQLDatabase {
	
	public void connect() {
		System.out.println("Connecting MySQL DB");
	}
	
	public void disconnect() {
		System.out.println("Disconnecting MySQL DB");
	}
}
