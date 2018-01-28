package singleresponsibility.after

import java.io.File
import java.io.IOException
import java.util.logging.Level
import java.io.FileWriter
import java.util.logging.Level
import java.util.logging.Logger
import scala.util.control.NonFatal
import scala.util.Try

class FileReaderWriter {
  val LOGGER = Logger.getLogger(this.getClass.getName)

  def read(fileType: String): List[String] = {
    val fileNames = {
      fileType match {
        case "PDF" => {
          new PDFReaderWriter().read
        }
        case "DOC" => {
          new DocReaderWriter().read
        }
        case "XML" => {
          new XMLReaderWriter().read
        }
        case _ => {
           new OthersReaderWriter().read
        }
      }

    }
    fileNames
  }

  def write(fileType: String, fileName: String): Unit = {
    var writer: FileWriter = null
    fileType match {
      case "PDF" => {
          new PDFReaderWriter().write(fileName)
        }
        case "DOC" => {
          new DocReaderWriter().write(fileName)
        }
        case "XML" => {
          new XMLReaderWriter().write(fileName)
        }
        case _ => {
           new OthersReaderWriter().write(fileName)
        }
    }
  }
}