package dependencyinversion.after;

public class OracleDatabase implements Database {
	
	public void connect() {
		System.out.println("Connecting Oracle DB");
	}
	
	public void disconnect() {
		System.out.println("Disconnecting Oracle DB");
	}
}
