package pipes_filters;

import java.io.BufferedWriter;
import java.io.FileWriter;
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

			BufferedWriter writer = new BufferedWriter(new FileWriter("./output/indexing.txt"));

			for(String line : lines) {
				System.out.println(line);
				writer.write(line + '\n');
			}
			System.out.println("Exporting to indexing.txt file...");
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
