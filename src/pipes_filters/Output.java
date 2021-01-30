package pipes_filters;

import java.io.IOException;

public class Output extends Filter {

	public Output(Pipe in, Pipe out){
		super(in, out);
	}
	
	@Override
	public void run() {
		try {
			String orderedLines = input.read();
			System.out.println(orderedLines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
