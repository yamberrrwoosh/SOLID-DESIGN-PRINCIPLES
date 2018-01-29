package dependencyinversion.before

class MySQLDatabase {
  
  def connect(): String = {
		println("Connecting MySQL DB")
		"MySQL"
	}
	
	def disconnect(): String = {
		println("Disconnecting MySQL DB")
		"MySQL"
	}
	
}