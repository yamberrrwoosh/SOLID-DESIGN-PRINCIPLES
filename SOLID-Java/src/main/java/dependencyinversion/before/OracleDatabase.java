package dependencyinversion.before;

public class OracleDatabase {
	
	public void connect() {
		System.out.println("Connecting Oracle DB");
	}
	
	public void disconnect() {
		System.out.println("Disconnecting Oracle DB");
	}
}
