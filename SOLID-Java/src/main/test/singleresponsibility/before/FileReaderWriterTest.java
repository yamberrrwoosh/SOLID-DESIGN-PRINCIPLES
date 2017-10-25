package singleresponsibility.before;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FileReaderWriterTest {
	
	private FileReaderWriter readerWriter = new FileReaderWriter();
	
	@Test
	public void testPDFRead() {
		List<String> fileNames = readerWriter.read("PDF");
		assertFalse(fileNames.isEmpty());
		fileNames.forEach(x -> System.out.println(x));
	}

}
