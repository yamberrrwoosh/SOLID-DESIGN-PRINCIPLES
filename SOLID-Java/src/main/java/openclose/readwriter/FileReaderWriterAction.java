package openclose.readwriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FileReaderWriterAction
{
	private Map<String, FileReaderWriter> readerWriter;

	public List<String> read(String fileType)
	{
		List<String> fileNames = new ArrayList<>();
		if (readerWriter.containsKey(fileType))
		{
			fileNames = readerWriter.get(fileType).read();
		}
		
		return fileNames;
	}

	public void write(String fileType)
	{
		if (readerWriter.containsKey(fileType))
		{
			readerWriter.get(fileType).write();
		}
	}

	public void setReaderWriter(Map<String, FileReaderWriter> readerWriter) {
		this.readerWriter = readerWriter;
	}
	
}
