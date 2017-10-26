package openclose.readwriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class DOCReaderWriter implements FileReaderWriter
{
	private final static Logger LOGGER = Logger.getLogger(DOCReaderWriter.class.getName());
	
	public List<String> read()
	{
		List<String> fileNames = new ArrayList<>();
		LOGGER.info("Reading DOCs");
		final URL resource = getClass().getResource("/docs");
		final File file = new File(resource.getPath());
		if (file.exists() && file.isDirectory())
		{
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
			final File file = new File("resource/docs/MyDOC.doc");
			if (file.createNewFile())
			{
				LOGGER.info("File is created!");
			} else
			{
				LOGGER.info("File already exists.");
			}

			final FileWriter writer = new FileWriter(file);
			writer.write("Test doc");
			writer.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
