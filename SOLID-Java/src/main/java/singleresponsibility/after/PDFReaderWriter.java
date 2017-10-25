package singleresponsibility.after;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class PDFReaderWriter
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

	public void write()
	{
		try
		{
			final File file = new File("MyPDF.pdf");
			if (file.createNewFile())
			{
				System.out.println("File is created!");
			} else
			{
				System.out.println("File already exists.");
			}

			// Write Content
			final FileWriter writer = new FileWriter(file);
			writer.write("Test pdf");
			writer.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
