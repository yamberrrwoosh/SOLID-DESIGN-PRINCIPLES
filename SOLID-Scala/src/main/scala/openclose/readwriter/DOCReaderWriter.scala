package openclose.readwriter

import java.io.File
import java.io.IOException
import java.util.logging.Level
import java.io.FileWriter
import java.util.logging.Level
import java.util.logging.Logger
import scala.util.control.NonFatal
import scala.util.Try

class DOCReaderWriter extends FileReaderWriter{
  private val LOGGER = Logger.getLogger(this.getClass.getName)

  @Override
  def read(): List[String] = {
    val resource = getClass.getResource("/docs")
    val file = new File(resource.getPath)
    if (file.exists() && file.isDirectory) {
      LOGGER.info("Reading DOCs")
      val files = file.listFiles().sortBy { x => x.getName }
      files.map(x => x.getName).toList
    } else {
      List.empty
    }
  }

  @Override
  def write(fileName: String): Unit = {
    var writer: FileWriter = null
    val path = "src/main/resources/"
    try {
      val file = new File(path + s"docs/${fileName}.doc")
      if (file.createNewFile()) {
        LOGGER.info("File is created!")
      } else {
        LOGGER.info("File already exists.")
      }
      writer = new FileWriter(file)
      writer.write("Test doc")
    } catch {
      case NonFatal(e) => LOGGER.log(Level.SEVERE, e.getMessage)
    } finally {
      if (writer != null) {
        writer.close
      }
    }
  }
}