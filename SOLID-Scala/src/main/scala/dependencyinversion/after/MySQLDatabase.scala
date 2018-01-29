package dependencyinversion.after

class MySQLDatabase extends Database {
  
  def connect(): String = {
		println("Connecting MySQL DB")
		"MySQL"
	}
	
	def disconnect(): String = {
		println("Disconnecting MySQL DB")
		"Oracle"
	}
	
}