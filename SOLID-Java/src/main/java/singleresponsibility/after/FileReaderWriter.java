package singleresponsibility.after;

import java.util.ArrayList;
import java.util.List;

public class FileReaderWriter
{

	public List<String> read(String fileType)
	{
		List<String> fileNames = new ArrayList<>();
		if (fileType == "PDF")
		{
			fileNames = new PDFReaderWriter().read();
		} else if (fileType == "DOC")
		{
			fileNames = new DOCReaderWriter().read();
		} else if (fileType == "XML")
		{
			fileNames = new XMLReaderWriter().read();
		} else
		{
			fileNames = new OthersReaderWriter().read();
		}
		return fileNames;
	}

	public void write(String fileType)
	{
		if (fileType == "PDF")
		{
			new PDFReaderWriter().write();
		} else if (fileType == "DOC")
		{
			new DOCReaderWriter().write();
		} else if (fileType == "XML")
		{
			new XMLReaderWriter().write();
		} else
		{
			new OthersReaderWriter().write();
		}
	}
}
