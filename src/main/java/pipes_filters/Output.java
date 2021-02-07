package pipes_filters;

import java.io.IOException;

public class Output extends Filter {

	public Output(Pipe in){
		super(in);
	}
	
	@Override
	public void run() {
		try {
			System.out.println("The final sorted output: ");
			String orderedLines = input.read();
			String[] lines = orderedLines.split("\\n");
			for(String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
