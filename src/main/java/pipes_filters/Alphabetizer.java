package pipes_filters;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Alphabetizer extends Filter {

	public Alphabetizer(Pipe in, Pipe out){
		super(in, out);
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Alphabetizer: ");
			String[] shiftedLines = input.read().trim().split("\\n");
			Utils.RemoveChangeOfLineChars(shiftedLines);

			Arrays.sort(shiftedLines);
			System.out.println("Lines...");
			for(int i = 0; i < shiftedLines.length; ++i) {
				System.out.println("Line: " + shiftedLines[i]);
			}
			
			// call methods and execute logic that sort the shiftedLines alphabetically
			// write to the output pipe the orderedLines
			// output.write(orderedLines)
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
