package liskov.readwriter.after;

import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import liskov.after.readwriter.DOCReader;
import liskov.after.readwriter.FileReader;
import liskov.after.readwriter.FileReaderWriter;
import liskov.after.readwriter.FileReaderWriterAction;
import liskov.after.readwriter.OthersReaderWriter;
import liskov.after.readwriter.PDFReaderWriter;
import liskov.after.readwriter.XMLReaderWriter;

public class FileReaderWriterTest {
	
	private FileReaderWriterAction readerWriter = new FileReaderWriterAction();
	
	@Before
	public void setup() {
		Map<String, FileReaderWriter> fileWriterMap = new HashMap<>();
		fileWriterMap.put("PDF", new PDFReaderWriter());
		fileWriterMap.put("XML", new XMLReaderWriter());
		fileWriterMap.put("OTHER", new OthersReaderWriter());
		readerWriter.setFileReaderWriter(fileWriterMap);
		
		Map<String, FileReader> fileReaderMap = new HashMap<>();
		fileReaderMap.put("PDF", new PDFReaderWriter());
		fileReaderMap.put("DOC", new DOCReader());
		fileReaderMap.put("XML", new XMLReaderWriter());
		fileReaderMap.put("OTHER", new OthersReaderWriter());
		readerWriter.setFileReader(fileReaderMap);
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
		try {
			readerWriter.write("PDF");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDOCWrite() {
		try {
			readerWriter.write("DOC");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testXMLWrite() {
		try {
			readerWriter.write("XML");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void tesOtherWrite() {
		try {
			readerWriter.write("OTHER");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
