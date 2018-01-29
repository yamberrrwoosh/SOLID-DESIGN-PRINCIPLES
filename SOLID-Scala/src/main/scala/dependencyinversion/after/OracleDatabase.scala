package dependencyinversion.after

class OracleDatabase extends Database {
  def connect(): String = {
		println("Connecting Oracle DB")
		"Oracle"
	}
	
	def disconnect(): String = {
		println("Disconnecting Oracle DB")
		"Oracle"
	}
	
}