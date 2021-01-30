package pipes_filters;
import java.io.*;
import pipes_filters.Pipe;
import pipes_filters.Input;
import pipes_filters.Output;
import pipes_filters.CircularShifter;
import pipes_filters.Alphabetizer;

public class KWIC {	
	public void execute(String file) throws IOException {
		Pipe inCS = new Pipe();
		Pipe csAl = new Pipe();
		Pipe alOu = new Pipe();
		
		FileInputStream in = new FileInputStream(new File(file));
		Input input = new Input(inCS, inCS);
		CircularShifter shifter = new CircularShifter(inCS, csAl);
		Alphabetizer alpha = new Alphabetizer(csAl, alOu);
		Output output = new Output(alOu, alOu);
		
		input.run(); shifter.run();
		alpha.run(); output.run();
		
		in.close();
	}
}