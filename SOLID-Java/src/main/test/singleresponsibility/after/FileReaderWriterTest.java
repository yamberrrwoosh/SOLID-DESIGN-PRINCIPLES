package singleresponsibility.after;

import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class FileReaderWriterTest {
	
	private FileReaderWriter readerWriter = new FileReaderWriter();
	
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
		List<String> fileNames = readerWriter.read("OTHERS");
		assertFalse(fileNames.isEmpty());
		fileNames.forEach(x -> System.out.println(x));
	}
	
	@Test
	public void testPDFWrite() {
		try {
			readerWriter.write("PDF");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDOCWrite() {
		try {
			readerWriter.write("DOC");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testXMLWrite() {
		try {
			readerWriter.write("XML");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void tesOtherWrite() {
		try {
			readerWriter.write("OTHER");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
