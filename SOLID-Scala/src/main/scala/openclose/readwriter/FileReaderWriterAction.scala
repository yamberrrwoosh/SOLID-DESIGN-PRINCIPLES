package openclose.readwriter

import java.io.File
import java.io.IOException
import java.util.logging.Level
import java.io.FileWriter
import java.util.logging.Level
import java.util.logging.Logger
import scala.util.control.NonFatal
import scala.util.Try

class FileReaderWriterAction {

  // Can be configurable
  private val readerWriter = Map("PDF" -> new PDFReaderWriter, "DOC" -> new DOCReaderWriter);

  val LOGGER = Logger.getLogger(this.getClass.getName)

  def read(fileType: String): List[String] = {
    val fileNames = {
      val reader = readerWriter.get(fileType)
      if (reader.nonEmpty) {
        reader.get.read()
      } else {
        new OthersReaderWriter().read
      }
    }
    fileNames
  }

  def write(fileType: String, fileName: String): Unit = {
    val writer = readerWriter.get(fileType)
    if (writer.nonEmpty) {
      writer.get.write(fileName)
    } else {
      new OthersReaderWriter().write(fileName)
    }
  }

}