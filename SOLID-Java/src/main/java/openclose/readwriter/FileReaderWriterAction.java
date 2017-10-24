package openclose.readwriter;

import java.util.Map;

public class FileReaderWriterAction
{
	private Map<String, FileReaderWriter> readerWriter;

	public void read(String fileType) throws Exception
	{
		if (readerWriter.containsKey(fileType))
		{
			readerWriter.get(fileType).read();
		} else
		{
			throw new Exception("reader not found");
		}
	}

	public void write(String fileType) throws Exception
	{
		if (readerWriter.containsKey(fileType))
		{
			readerWriter.get(fileType).write();
		} else
		{
			throw new Exception("writer not found");
		}
	}
}
