import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class oddOccurence {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = 
				new BufferedReader(
						new InputStreamReader(
								System.in
								)
						);
		
		String[] words = reader.readLine().toLowerCase().split("\\s+");
		
		Map<String, Integer> wordsCount = new LinkedHashMap<>();
		
		for (int i = 0; i < words.length; i++) {
			if (!wordsCount.containsKey(words[i])) {
				wordsCount.put(words[i], 1);
			}else {
				wordsCount.put(words[i], wordsCount.get(words[i]) + 1);
			}
		}
		List<String> result = new ArrayList<>();
		
		wordsCount.forEach((key, value) -> {
			if (value % 2 == 1) {
				result.add(key);
			}
		});
		
		System.out.println(result.toString().replaceAll("\\[|\\]", ""));
		
	}

}
