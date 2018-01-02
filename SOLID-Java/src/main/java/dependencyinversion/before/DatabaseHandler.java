package dependencyinversion.before;

import dependencyinversion.after.Database;

public class DatabaseHandler {
	
	public void connect(Object db) throws Exception {
		if(db instanceof MySQLDatabase) {
			MySQLDatabase mySQL = (MySQLDatabase) db;
			mySQL.connect();
		} else if(db instanceof OracleDatabase) {
			OracleDatabase oracle = (OracleDatabase) db;
			oracle.connect();
		} else {
			throw new Exception("DB not supported");
		}
	}
	
	public void disconnect(Database db) throws Exception {
		if(db instanceof MySQLDatabase) {
			MySQLDatabase mySQL = (MySQLDatabase) db;
			mySQL.disconnect();
		} else if(db instanceof OracleDatabase) {
			OracleDatabase oracle = (OracleDatabase) db;
			oracle.disconnect();
		} else {
			throw new Exception("DB not supported");
		}
	}
}
