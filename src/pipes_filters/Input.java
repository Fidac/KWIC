package pipes_filters;
import java.io.FileInputStream;
import java.io.IOException;

public class Input extends Filter {
	FileInputStream fileIn;
	
	public Input(FileInputStream in, Pipe out) {
		super(in, out);
		fileIn = in;
	}
	
	@Override
	public void run(){
		output.write(fileIn);
	}
}
