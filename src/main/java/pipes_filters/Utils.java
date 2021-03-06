package pipes_filters;
import java.util.ArrayList;

public final class Utils {

	private Utils() {
	
	}

	//Rebuild all the lines in only one string to be pushed through the pipe
	public static String rebuildString(ArrayList<String[]> lines) {
		System.out.println("Rebuilding...");
		StringBuilder sb = new StringBuilder();
		for(String[] line : lines) {
			for(int j = 0; j < line.length - 1; ++j) {
					sb.append(line[j]);
					sb.append(" ");
				}
			sb.append(line[line.length - 1]);
			sb.append("\n");
		}
		return sb.toString();
	}

	public static String rebuildLineString(String[] line) {
		System.out.println("Rebuilding Line...");
		StringBuilder sb = new StringBuilder();
		for(int j = 0; j < line.length - 1; ++j) {
			sb.append(line[j]);
			sb.append(" ");
		}
		sb.append(line[line.length - 1]);
		return sb.toString();
	}
	
	public static ArrayList<String[]> SplitLinesByWords(String[] lines){
		ArrayList<String[]> linesByWords = new ArrayList<String[]>();
		for(int i = 0; i < lines.length; ++i) {
			String[] line = lines[i].split(" ");
			linesByWords.add(line);
		}
		
		return linesByWords;
	}

	//Method to remove change of lines characters
	public static void RemoveChangeOfLineChars(String[] lines) {

		for(int i = 0; i < lines.length; ++i) {
			String s = lines[i];
			s = s.replaceAll("[\r\n]+$", "");
			lines[i] = s;
		}
	}
}
