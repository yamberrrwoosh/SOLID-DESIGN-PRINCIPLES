package dependencyinversion.after;

public class MySQLDatabase implements Database{
	
	public void connect() {
		System.out.println("Connecting MySQL DB");
	}
	
	public void disconnect() {
		System.out.println("Disconnecting MySQL DB");
	}
}
