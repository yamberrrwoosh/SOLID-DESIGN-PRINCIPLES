package dependencyinversion.after

class DatabaseHandler {
  
  def connect(db: Database) = {
    db.connect
	}
	
	def disconnect(db: Database) = {
		db.disconnect
	}
}