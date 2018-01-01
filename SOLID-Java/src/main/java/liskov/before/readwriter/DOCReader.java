package liskov.before.readwriter;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class DOCReader implements FileReaderWriter
{
	private final static Logger LOGGER = Logger.getLogger(DOCReader.class.getName());
	
	@Override
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

	@Override
	public void write()
	{
		throw new UnsupportedOperationException("Unsupported can't write.");
	}
}
