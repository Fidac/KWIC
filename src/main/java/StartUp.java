import pipes_filters.KWIC;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class StartUp {
	public static void main(String args[]) throws IOException {
		
		BufferedReader standardInput = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file path: ");  
		String file = standardInput.readLine();
		
		KWIC kwic = new KWIC();
		kwic.execute(file.toString());
	}
}
