package singleresponsibility.before;

import static org.junit.Assert.assertFalse;

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
