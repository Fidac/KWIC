package main.java.pipes_filters;

import java.io.FileInputStream;

public abstract class Filter implements Runnable{
	protected Pipe input;
	protected Pipe output;
	
	Filter(Pipe in, Pipe out){
		input = in;
		output = out;
	}
	
	Filter(FileInputStream in, Pipe out){
		output = out;
	}
	
	Filter(Pipe in){
		input = in;
	}
	
}
