package openclose.readwriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class OthersReaderWriter implements FileReaderWriter
{
	public void read()
	{
		final URL resource = getClass().getResource("/others");
		final File file = new File(resource.getPath());
		if (file.exists() && file.isDirectory())
		{
			final List<File> files = Arrays.asList(file.listFiles());
			files.sort((File o1, File o2) -> o1.getName().compareTo(o2.getName()));
			System.out.println("Reading others");
			files.forEach(x -> System.out.println(x.getName()));
		}
	}

	public void write()
	{
		try
		{
			final File file = new File("MyTxt.txt");
			if (file.createNewFile())
			{
				System.out.println("File is created!");
			} else
			{
				System.out.println("File already exists.");
			}

			// Write Content
			final FileWriter writer = new FileWriter(file);
			writer.write("Test txt");
			writer.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
