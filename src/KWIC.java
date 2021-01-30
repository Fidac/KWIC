import pipes_filters.Pipe;
import pipes_filters.Filter;
import pipes_filters.Input;
import pipes_filters.Output;
import pipes_filters.CircularShifter;
import pipes_filters.Alphabetizer;

public class KWIC {	
	public void execute(String file) {
		Pipe inCS = new Pipe();
		Pipe csAl = new Pipe();
		Pipe alOu = new Pipe();
		
		//FileInputStream in = new FileInputStream(file);
		Input input = new Input(inCS, inCS);
		CircularShifter shifter = new CircularShifter(inCS, csAl);
		Alphabetizer alpha = new Alphabetizer(csAl, alOu);
		Output output = new Output(alOu, alOu);
		
		//input.start(); shifter.start();
		//alpha.start(); output.start();
		
	}
}

