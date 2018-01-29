package dependencyinversion.before

class DatabaseHandler {
  
  def connect(db: Object) = {
    db match {
      case db: MySQLDatabase => db.connect
      case db: OracleDatabase => db.connect
      case _ => throw new Exception("DB not supported")
    }
	}
	
	def disconnect(db: Object) = {
		db match {
      case db: MySQLDatabase => db.disconnect
      case db: OracleDatabase => db.disconnect
      case _ => throw new Exception("DB not supported")
    }
	}
}