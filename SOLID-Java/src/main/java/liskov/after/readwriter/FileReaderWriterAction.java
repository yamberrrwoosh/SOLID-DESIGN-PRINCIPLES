package liskov.after.readwriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FileReaderWriterAction
{
	private Map<String, FileReaderWriter> fileReaderWriter;
	private Map<String, FileReader> fileReader;

	public List<String> read(String fileType)
	{
		List<String> fileNames = new ArrayList<>();
		if (fileReader.containsKey(fileType))
		{
			fileNames = fileReader.get(fileType).read();
		}
		 
		return fileNames;
	}

	public void write(String fileType) throws Exception
	{
		if (fileReaderWriter.containsKey(fileType))
		{
			fileReaderWriter.get(fileType).write();
		} else {
			throw new Exception("File Not Supported");
		}
	}

	public void setFileReaderWriter(Map<String, FileReaderWriter> fileReaderWriter) {
		this.fileReaderWriter = fileReaderWriter;
	}

	public void setFileReader(Map<String, FileReader> fileReader) {
		this.fileReader = fileReader;
	}

}
