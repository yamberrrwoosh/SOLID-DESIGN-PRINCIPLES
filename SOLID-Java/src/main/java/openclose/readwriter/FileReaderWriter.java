package openclose.readwriter;

import java.util.List;

public interface FileReaderWriter
{
	List<String> read();
	void write() throws Exception;
}