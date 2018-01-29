package openclose.readwriter

import java.io.File
import java.io.IOException
import java.util.logging.Level
import java.io.FileWriter
import java.util.logging.Level
import java.util.logging.Logger
import scala.util.control.NonFatal
import scala.util.Try

class XMLReaderWriter extends FileReaderWriter {
  val LOGGER = Logger.getLogger(this.getClass.getName)

  def read(): List[String] = {
    val fileNames = {
      LOGGER.info("Reading XMLs")
      val resource = getClass.getResource("/xmls")
      val file = new File(resource.getPath())
      if (file.exists() && file.isDirectory()) {
        val files = file.listFiles().sortBy { x => x.getName }
        files.map(x => x.getName).toList
      } else {
        List.empty
      }
    }
    fileNames
  }

  def write(fileName: String): Unit = {
    var writer: FileWriter = null
    val path = "src/main/resources/"
    try {
      val file = new File(path + s"xmls/${fileName}.xml")
      if (file.createNewFile()) {
        LOGGER.info("File is created!")
      } else {
        LOGGER.info("File already exists.")
      }
      writer = new FileWriter(file)
      writer.write("Test xml")
    } catch {
      case NonFatal(e) => LOGGER.log(Level.SEVERE, e.getMessage())
    } finally {
      if (writer != null) {
        writer.close()
      }
    }
  }
  
}