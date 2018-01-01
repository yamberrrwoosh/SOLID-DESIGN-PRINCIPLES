package openclose.readwriter;

import java.io.IOException;
import java.util.List;

public interface FileReaderWriter
{
	List<String> read();
	void write() throws IOException;
}