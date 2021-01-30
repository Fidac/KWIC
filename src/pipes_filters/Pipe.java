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
	
	public void write(char c) throws IOException {
		writer.write(c);
	}
	
	public String read() throws IOException {
		int data;
		StringBuilder sb = new StringBuilder();
		while((data = reader.read()) != -1) 
			sb.append((char) data);
		
		return sb.toString();
	}
	
}
