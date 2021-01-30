package pipes_filters;
import java.io.FileInputStream;

public class Input extends Filter {
	FileInputStream fileIn;
	
	public Input(Pipe in, Pipe out){
		super(in, out);
	}
	
	@Override
	public void run() {
		
	}
}
