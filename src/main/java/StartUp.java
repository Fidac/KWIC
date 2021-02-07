import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import pipes_filters.KWIC;

public class StartUp {
	public static void main(String args[]) throws IOException {
		
		BufferedReader standardInput = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter file path: ");  
		String file = standardInput.readLine();
		
		System.out.println("This is the output:  " + file);
		
		KWIC kwic = new KWIC();
		kwic.execute(file.toString());
	}
}
