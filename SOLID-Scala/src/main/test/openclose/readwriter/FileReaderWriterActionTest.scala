package openclose.readwriter

import org.scalatest.BeforeAndAfter
import org.scalatest.FunSuite

class FileReaderWriterTest extends FunSuite with BeforeAndAfter {

  private val readerWriter = new FileReaderWriterAction

  test("Read PDFs") {
    val fileNames = readerWriter.read("PDF")
    assert(fileNames.nonEmpty)
    assert(fileNames.contains("a.pdf"))
    assert(fileNames.contains("sample.pdf"))
    assert(fileNames.contains("z.pdf"))
  }

  test("Read Docs") {
    val fileNames = readerWriter.read("DOC")
    assert(fileNames.nonEmpty)
    assert(fileNames.contains("a.doc"))
    assert(fileNames.contains("sample.doc"))
    assert(fileNames.contains("z.doc"))
  }

  test("Read XMLs") {
    val fileNames = readerWriter.read("XML")
    assert(fileNames.nonEmpty)
    assert(fileNames.contains("a.xml"))
    assert(fileNames.contains("z.xml"))
  }

  test("Read Others") {
    val fileNames = readerWriter.read("TXT")
    assert(fileNames.nonEmpty)
    assert(fileNames.contains("a.txt"))
    assert(fileNames.contains("z.txt"))
  }

  test("Write PDFs") {
    readerWriter.write("PDF", "MyPDF");
  }

  test("Write DOCs") {
    readerWriter.write("DOC", "MyDOC");
  }

  test("Write XMLs") {
    readerWriter.write("XML", "MyXML");
  }

  test("Write Others") {
    readerWriter.write("TXT", "MyOther");
  }
  
}