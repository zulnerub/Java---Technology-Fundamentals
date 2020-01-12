
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class countCharsInAString {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = 
				new BufferedReader(
						new InputStreamReader(
								System.in
						)				
				);
		
		Map<Character, Integer> chars = new LinkedHashMap<>();
		
		String text = String.join("", reader.readLine().split("\\s+"));
		
		for (int i = 0; i < text.length(); i++) {
			char symbol = text.charAt(i);
			
			if (!chars.containsKey(symbol)) {
				chars.put(symbol, 1);
			}else {
				chars.put(symbol, chars.get(symbol) + 1);
			}
		}
		
		chars.forEach((key, value) -> {
			System.out.println(
					String.format("%c -> %d", key, value)
					);
		});
		
	}

}
