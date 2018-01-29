package dependencyinversion.before

class OracleDatabase {
  def connect(): String = {
		println("Connecting Oracle DB")
		"Oracle"
	}
	
	def disconnect(): String = {
		println("Disconnecting Oracle DB")
		"Oracle"
	}
	
}