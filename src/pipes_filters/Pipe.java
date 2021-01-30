package pipes_filters;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Pipe {
	private PipedReader reader;
	private PipedWriter writer;
	
	Pipe() throws IOException{
		writer = new PipedWriter();
		reader = new PipedReader(writer);
	}
	
	public void write(String file) throws IOException {
		writer.write(file);
	}
	
	public String read() throws IOException {
		int data = reader.read();
		StringBuilder sb = new StringBuilder();
		while(data != -1) {
			sb.append((char) data);
			data = reader.read();
		}
		
		return sb.toString();
	}
	
}
