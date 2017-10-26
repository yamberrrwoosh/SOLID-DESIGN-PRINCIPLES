package openclose.readwriter;

import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class FileReaderWriterTest {
	
	private FileReaderWriterAction readerWriter = new FileReaderWriterAction();
	
	@Before
	public void setup() {
		Map<String, FileReaderWriter> fileReaderWriterMap = new HashMap<>();
		fileReaderWriterMap.put("PDF", new PDFReaderWriter());
		fileReaderWriterMap.put("DOC", new DOCReaderWriter());
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
	public void testPDFWrite() {
		readerWriter.write("PDF");
	}
	
	@Test
	public void testDOCWrite() {
		readerWriter.write("DOC");
	}
	
	@Test
	public void testXMLWrite() {
		readerWriter.write("XML");
	}
	
	@Test
	public void tesOtherWrite() {
		readerWriter.write("OTHER");
	}

}
