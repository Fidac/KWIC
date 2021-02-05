package pipes_filters;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.nio.charset.StandardCharsets;

public class Pipe {
	private PipedReader reader;
	private PipedWriter writer;
	
	Pipe() throws IOException{
		writer = new PipedWriter();
		reader = new PipedReader(writer, 100000);
	}
	
	
	public void write(String s) throws IOException {
		writer.write(s);
		writer.close();
	}
	
	public String read() throws IOException {
		int data;
		StringBuilder sb = new StringBuilder();
		while((data = reader.read()) != -1) {
			sb.append((char) data);
		}
		reader.close();
		return sb.toString();
	}
}
