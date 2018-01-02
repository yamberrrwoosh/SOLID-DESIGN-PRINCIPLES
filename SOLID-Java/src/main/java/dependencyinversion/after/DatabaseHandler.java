package dependencyinversion.after;

public class DatabaseHandler {
	
	public void connect(Database db) {
		db.connect();
	}
	
	public void disconnect(Database db) {
		db.disconnect();
	}
}
