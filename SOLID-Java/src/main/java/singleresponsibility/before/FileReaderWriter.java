package singleresponsibility.before;

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

public class FileReaderWriter
{
	private final static Logger LOGGER = Logger.getLogger(FileReaderWriter.class.getName());
	
	public List<String> read(final String fileType)
	{
		List<String> fileNames = new ArrayList<>();
		if (fileType == "PDF")
		{
			final URL resource = getClass().getResource("/pdfs");
			final File file = new File(resource.getPath());
			if (file.exists() && file.isDirectory())
			{
				LOGGER.info("Reading PDFs");
				final List<File> files = Arrays.asList(file.listFiles());
				files.sort((File o1, File o2) -> o1.getName().compareTo(o2.getName()));
				fileNames = files.stream().map(x -> x.getName()).collect(Collectors.toList());
			}
		} else if (fileType == "DOC")
		{
			LOGGER.info("Reading DOCs");
			final URL resource = getClass().getResource("/docs");
			final File file = new File(resource.getPath());
			if (file.exists() && file.isDirectory())
			{
				final List<File> files = Arrays.asList(file.listFiles());
				files.sort((File o1, File o2) -> o1.getName().compareTo(o2.getName()));
				fileNames = files.stream().map(x -> x.getName()).collect(Collectors.toList());
			}
		} else if (fileType == "XML")
		{
			LOGGER.info("Reading XMLs");
			final URL resource = getClass().getResource("/xmls");
			final File file = new File(resource.getPath());
			if (file.exists() && file.isDirectory())
			{
				final List<File> files = Arrays.asList(file.listFiles());
				files.sort((File o1, File o2) -> o1.getName().compareTo(o2.getName()));
				fileNames = files.stream().map(x -> x.getName()).collect(Collectors.toList());
			}
		} else
		{
			final URL resource = getClass().getResource("/others");
			final File file = new File(resource.getPath());
			if (file.exists() && file.isDirectory())
			{
				LOGGER.info("Reading Other files");
				final List<File> files = Arrays.asList(file.listFiles());
				files.sort((File o1, File o2) -> o1.getName().compareTo(o2.getName()));
				fileNames = files.stream().map(x -> x.getName()).collect(Collectors.toList());
			}
		}
		return fileNames;
	}

	public void write(String fileType) throws Exception
	{
		FileWriter writer = null;
		final String path = "src/main/resources/" ;
		if (fileType == "PDF")
		{
			try 
			{
				final File file = new File(path + "pdfs/MyPDF.pdf");
				if (file.createNewFile())
				{
					LOGGER.info("File is created!");
				} else
				{
					LOGGER.info("File already exists.");
				}
				
				writer = new FileWriter(file);
				writer.write("Test pdf");
			} catch (IOException e)
			{
				e.printStackTrace();
			}
			finally {
				writer.close();
			}

		} else if (fileType == "DOC")
		{
			
			try
			{
				final File file = new File(path + "docs/MyDOC.doc");
				if (file.createNewFile())
				{
					LOGGER.info("File is created!");
				} else
				{
					LOGGER.info("File already exists.");
				}

				writer = new FileWriter(file);
				writer.write("Test doc");
			} catch (IOException e)
			{
				e.printStackTrace();
			}
			finally {
				writer.close();
			}
		} else if (fileType == "XML")
		{
			try
			{
				final File file = new File(path + "xmls/MyXML.xml");
				if (file.createNewFile())
				{
					LOGGER.info("File is created!");
				} else
				{
					LOGGER.info("File already exists.");
				}

				writer = new FileWriter(file);
				writer.write("Test xml");
			} catch (IOException e)
			{
				e.printStackTrace();
			}
			finally {
				writer.close();
			}
		} else
		{
			try
			{
				final File file = new File(path + "others/MyTxt.txt");
				if (file.createNewFile())
				{
					LOGGER.info("File is created!");
				} else
				{
					throw new Exception("File already exists.");
				}
				writer = new FileWriter(file);
				writer.write("Test txt");
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
}
