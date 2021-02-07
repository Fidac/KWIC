package main.java.pipes_filters;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Input extends Filter {
	FileInputStream fileIn;
	
	public Input(FileInputStream in, Pipe out) {
		super(in, out);
		fileIn = in;
	}
	
	@Override
	public void run(){
		try {
			var bytes = fileIn.readAllBytes();
			String s = new String(bytes, StandardCharsets.UTF_8);
			output.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
