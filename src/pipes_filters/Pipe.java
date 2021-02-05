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
		reader = new PipedReader(writer);
	}
	
	public void write(FileInputStream in) {
		System.out.println("Write: " );
		try {
			var bytes = in.readAllBytes();
			String s = new String(bytes, StandardCharsets.UTF_8);
			//System.out.println("Writing: " + s);
			for(int i = 0; i < s.length(); ++i) {
				System.out.println("Writing: " + s.charAt(i));
				writer.write(s.charAt(i));
			}

			System.out.println("Stop Writting: " );
			writer.close();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
