package singleresponsibility.after;

public class FileReaderWriter
{

	public void read(String fileType)
	{
		if (fileType == "PDF")
		{
			new PDFReaderWriter().read();
		} else if (fileType == "DOC")
		{
			new DOCReaderWriter().read();
		} else if (fileType == "XML")
		{
			new XMLReaderWriter().read();
		} else
		{
			new OthersReaderWriter().read();
		}
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
