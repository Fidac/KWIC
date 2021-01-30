import java.io.IOException;

import pipes_filters.KWIC;

public class StartUp {
	public static void main(String args[]) throws IOException {
		StringBuffer file = new StringBuffer();
		for(int i = 0; i < args.length; ++i)
			file.append(args[i]);
		
		KWIC kwic = new KWIC();
		kwic.execute(file.toString());
	}
}
