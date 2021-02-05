package pipes_filters;
import java.util.ArrayList;

public final class Utils {
	
	private Utils() {
	
	}
	
	public static String rebuildString(ArrayList<String[]> lines) {
		System.out.println("Rebuilding...");
		StringBuilder sb = new StringBuilder();
		for(String[] line : lines) {
			for(int j = 0; j < line.length; ++j) {
					sb.append(line[j]);
					sb.append(" ");
				}
			sb.append("\n");
		}
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
	
	public static void RemoveChangeOfLineChars(String[] lines) {

		for(int i = 0; i < lines.length; ++i) {
			String s = lines[i];
			s = s.replaceAll("[\r\n]+$", "");
			lines[i] = s;
		}
	}
}
