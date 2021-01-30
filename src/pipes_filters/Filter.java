package pipes_filters;

public abstract class Filter implements Runnable{
	protected Pipe input;
	protected Pipe output;
	
	Filter(Pipe in, Pipe out){
		input = in;
		output = out;
	}
	
}
