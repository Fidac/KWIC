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
			System.out.println("Alphabetizer: sort the sentences");
			String[] shiftedLines = input.read().trim().split("\\n");
			Utils.RemoveChangeOfLineChars(shiftedLines);

			Arrays.sort(shiftedLines);
			StringBuilder sb = new StringBuilder();
			for(String str : shiftedLines) {
				sb.append(str).append("\n");
			}
			output.write(sb.toString());

			// call methods and execute logic that sort the shiftedLines alphabetically
			// write to the output pipe the orderedLines
			// output.write(orderedLines)
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
