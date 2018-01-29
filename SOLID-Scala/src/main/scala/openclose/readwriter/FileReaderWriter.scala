package openclose.readwriter

trait FileReaderWriter {
  def read: List[String]
	def write(fileName: String): Unit
}