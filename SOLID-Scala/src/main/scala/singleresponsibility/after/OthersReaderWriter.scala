package singleresponsibility.after

import java.io.File
import java.io.IOException
import java.util.logging.Level
import java.io.FileWriter
import java.util.logging.Level
import java.util.logging.Logger
import scala.util.control.NonFatal
import scala.util.Try

class OthersReaderWriter {

  val LOGGER = Logger.getLogger(this.getClass.getName)

  def read(): List[String] = {
    val fileNames = {
      LOGGER.info("Reading Others")
      val resource = getClass().getResource("/others")
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
      val file = new File(path + s"others/${fileName}.txt")
      if (file.createNewFile()) {
        LOGGER.info("File is created!")
      } else {
        throw new Exception("File already exists.")
      }
      writer = new FileWriter(file)
      writer.write("Test txt")
    } catch {
      case NonFatal(e) => LOGGER.log(Level.SEVERE, e.getMessage())
    } finally {
      if (writer != null) {
        writer.close()
      }
    }
  }
}