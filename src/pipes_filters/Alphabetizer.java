package pipes_filters;

import java.io.IOException;

public class Alphabetizer extends Filter {

	public Alphabetizer(Pipe in, Pipe out){
		super(in, out);
	}
	
	@Override
	public void run() {
		try {
			String shiftedLines = input.read();
			
			// call methods and execute logic that sort the shiftedLines alphabetically
			// write to the output pipe the orderedLines
			// output.write(orderedLines)
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
