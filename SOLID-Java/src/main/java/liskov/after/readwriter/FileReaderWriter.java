package liskov.after.readwriter;

public interface FileReaderWriter extends FileReader
{
	void write() throws Exception;
}