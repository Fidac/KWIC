package pipes_filters;

import java.io.IOException;

public class CircularShifter extends Filter {
	
	public CircularShifter(Pipe in, Pipe out){
		super(in, out);
	}
	
	@Override
	public void run() {
		try {
			String lines = input.read();
			
			// call methods that will execute logic of shifted lines
			
			// Finally when the final output (shiftedLines) is built:
			//output.write(shiftedLines)
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
