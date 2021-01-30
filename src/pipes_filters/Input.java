package pipes_filters;
import java.io.FileInputStream;
import java.io.IOException;

public class Input extends Filter {
	FileInputStream fileIn;
	
	public Input(FileInputStream in, Pipe entry, Pipe out) {
		super(entry, out);
		fileIn = in;
	}
	
	@Override
	public void run(){
		int data;
		try {
			while((data = fileIn.read()) != -1)
				input.write((char) data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
