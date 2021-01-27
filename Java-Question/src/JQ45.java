import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JQ45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> duplicates = duplicateWord("fileDemo.txt");
		System.out.println(duplicates);
	}
	
	private static List<String> duplicateWord(String fileName){
		List<String> duplicate = new ArrayList<>();
		// write
		File file = new File(fileName);
		List<String> text = new ArrayList<>();
		try (
				FileReader reader = new FileReader(file);
				BufferedReader bufferreader = new BufferedReader(reader)
				) {
			
			String line;
			while ((line = bufferreader.readLine()) != null) {
				String[] words = line.strip().split(" ");
				for(String word: words) {
					if(!text.contains(word)) {
						text.add(word);
					}
					else {
						duplicate.add(word);
					}
				}
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return duplicate;
	}
}
