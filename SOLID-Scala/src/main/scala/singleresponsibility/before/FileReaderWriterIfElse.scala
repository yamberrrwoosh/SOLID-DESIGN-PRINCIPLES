package singleresponsibility.before

import java.io.File
import java.io.IOException
import java.util.logging.Level
import java.io.FileWriter
import java.util.logging.Level;
import java.util.logging.Logger;
import scala.util.control.NonFatal
import scala.util.Try

class FileReaderWriterIfElse {
 
  val LOGGER = Logger.getLogger(this.getClass.getName);

  def read(fileType: String): List[String] = {
    val fileNames = {
      if (fileType == "PDF") {
        val resource = getClass.getResource("/pdfs");
        val file = new File(resource.getPath);
        if (file.exists() && file.isDirectory) {
          LOGGER.info("Reading PDFs");
          val files = file.listFiles().sortBy { x => x.getName }
          files.map(x => x.getName).toList
        } else {
          List.empty
        }
      } else if (fileType == "DOC") {
        LOGGER.info("Reading DOCs");
        val resource = getClass.getResource("/docs");
        val file = new File(resource.getPath());
        if (file.exists() && file.isDirectory()) {
          val files = file.listFiles().sortBy { x => x.getName }
          files.map(x => x.getName).toList
        } else {
          List.empty
        }
      } else if (fileType == "XML") {
        LOGGER.info("Reading XMLs");
        val resource = getClass.getResource("/xmls");
        val file = new File(resource.getPath());
        if (file.exists() && file.isDirectory()) {
          val files = file.listFiles().sortBy { x => x.getName }
          files.map(x => x.getName).toList
        } else {
          List.empty
        }
      } else {
        val resource = getClass().getResource("/others");
        val file = new File(resource.getPath());
        if (file.exists() && file.isDirectory()) {
          val files = file.listFiles().sortBy { x => x.getName }
          files.map(x => x.getName).toList
        } else {
          List.empty
        }
      }
    }
    fileNames;
  }

  def write(fileType: String): Unit = {
    var writer: FileWriter = null
    val path = "src/main/resources/";
    if (fileType == "PDF") {
      try {
        val file = new File(path + "pdfs/MyPDF.pdf");
        if (file.createNewFile()) {
          LOGGER.info("File is created!");
        } else {
          LOGGER.info("File already exists.");
        }
        writer = new FileWriter(file);
        writer.write("Test pdf");
      } catch {
        case NonFatal(e) => LOGGER.log(Level.SEVERE, e.getMessage());
      } finally {
        writer.close();
      }
    } else if (fileType == "DOC") {

      try {
        val file = new File(path + "docs/MyDOC.doc");
        if (file.createNewFile()) {
          LOGGER.info("File is created!");
        } else {
          LOGGER.info("File already exists.");
        }
        writer = new FileWriter(file);
        writer.write("Test doc");
      } catch {
        case NonFatal(e) => LOGGER.log(Level.SEVERE, e.getMessage());
      } finally {
        writer.close();
      }
    } else if (fileType == "XML") {
      try {
        val file = new File(path + "xmls/MyXML.xml");
        if (file.createNewFile()) {
          LOGGER.info("File is created!");
        } else {
          LOGGER.info("File already exists.");
        }
        writer = new FileWriter(file);
        writer.write("Test xml");
      } catch {
        case NonFatal(e) => LOGGER.log(Level.SEVERE, e.getMessage());
      } finally {
        if (writer != null) {
          writer.close();
        }
      }
    } else {
      try {
        val file = new File(path + "others/MyTxt.txt");
        if (file.createNewFile()) {
          LOGGER.info("File is created!");
        } else {
          throw new Exception("File already exists.");
        }
        writer = new FileWriter(file);
        writer.write("Test txt");
      } catch {
        case NonFatal(e) => LOGGER.log(Level.SEVERE, e.getMessage());
      } finally {
        if (writer != null) {
          writer.close();
        }
      }
    }
  }
}