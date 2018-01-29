package dependencyinversion.after

trait Database {
  def connect: String
	def disconnect: String
}