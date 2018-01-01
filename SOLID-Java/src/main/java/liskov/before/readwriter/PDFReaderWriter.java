package liskov.before.readwriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class PDFReaderWriter implements FileReaderWriter
{
	private final static Logger LOGGER = Logger.getLogger(PDFReaderWriter.class.getName());
	
	
	public List<String> read()
	{
		List<String> fileNames = new ArrayList<>();
		final URL resource = getClass().getResource("/pdfs");
		final File file = new File(resource.getPath());
		if (file.exists() && file.isDirectory())
		{
			LOGGER.info("Reading PDFs");
			final List<File> files = Arrays.asList(file.listFiles());
			files.sort((File o1, File o2) -> o1.getName().compareTo(o2.getName()));
			fileNames = files.stream().map(x -> x.getName()).collect(Collectors.toList());
		}
		return fileNames;
	}

	public void write() throws Exception
	{
		FileWriter writer = null;
		try
		{
			final File file = new File("src/main/resources/pdfs/MyPDF.pdf");
			if (file.createNewFile())
			{
				LOGGER.info("File is created!");
			} else
			{
				throw new Exception("File already exists.");
			}

			writer = new FileWriter(file);
			writer.write("Test pdf");
		} catch (IOException e)
		{
			LOGGER.log(Level.SEVERE, e.getMessage());
		}
		finally {
			if(writer != null) {
				writer.close();
			}
		}
	}
}
