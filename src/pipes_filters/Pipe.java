package pipes_filters;
import java.io.FileInputStream;
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
	
	public void write(FileInputStream in) {
		int data;
		try {
			while((data = in.read()) != -1) {
				writer.write((char) data);
			}
			writer.close();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void write(char c) throws IOException {
		System.out.println("I'm in writer: " + c);
		writer.write(c);
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
