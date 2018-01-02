package liskov.readwriter.before;

import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import liskov.before.readwriter.DOCReader;
import liskov.before.readwriter.FileReaderWriter;
import liskov.before.readwriter.FileReaderWriterAction;
import liskov.before.readwriter.OthersReaderWriter;
import liskov.before.readwriter.PDFReaderWriter;
import liskov.before.readwriter.XMLReaderWriter;

public class FileReaderWriterTest {

	private FileReaderWriterAction readerWriter = new FileReaderWriterAction();

	@Before
	public void setup() {
		Map<String, FileReaderWriter> fileReaderWriterMap = new HashMap<>();
		fileReaderWriterMap.put("PDF", new PDFReaderWriter());
		fileReaderWriterMap.put("DOC", new DOCReader());
		fileReaderWriterMap.put("XML", new XMLReaderWriter());
		fileReaderWriterMap.put("OTHER", new OthersReaderWriter());
		readerWriter.setReaderWriter(fileReaderWriterMap);
	}

	@Test
	public void testPDFRead() {
		List<String> fileNames = readerWriter.read("PDF");
		assertFalse(fileNames.isEmpty());
		fileNames.forEach(x -> System.out.println(x));
	}

	@Test
	public void testDOCRead() {
		List<String> fileNames = readerWriter.read("DOC");
		assertFalse(fileNames.isEmpty());
		fileNames.forEach(x -> System.out.println(x));
	}

	@Test
	public void testXMLRead() {
		List<String> fileNames = readerWriter.read("XML");
		assertFalse(fileNames.isEmpty());
		fileNames.forEach(x -> System.out.println(x));
	}

	@Test
	public void testOthersRead() {
		List<String> fileNames = readerWriter.read("OTHER");
		assertFalse(fileNames.isEmpty());
		fileNames.forEach(x -> System.out.println(x));
	}

	@Test
	public void testPDFWrite() throws Exception {
		readerWriter.write("PDF");
	}

	@Test
	public void testDOCWrite() throws Exception {
		readerWriter.write("DOC");
	}

	@Test
	public void testXMLWrite() throws Exception {
		readerWriter.write("XML");
	}

	@Test
	public void tesOtherWrite() throws Exception {
		readerWriter.write("OTHER");
	}

}
