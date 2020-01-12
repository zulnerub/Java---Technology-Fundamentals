import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class minersTasks {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = 
				new BufferedReader (
						new InputStreamReader(
								System.in
								)
						);
		
		String input = "";
		List<String> mining = new ArrayList<>();
		
		while (!"stop".equals(input = rd.readLine())) {
			mining.add(input);
		}
		
		Map<String, Long> result = new LinkedHashMap<>();
		
		for (int i = 0; i < mining.size() / 2; i++) {
			if (!result.containsKey(mining.get(i*2))) {
				result.put(mining.get(i * 2), Long.parseLong(mining.get(i * 2 + 1)));
			}else {
				Long current = result.get(mining.get(i * 2));
				result.put(mining.get(i * 2), Long.parseLong(mining.get(i * 2 + 1)) + current);
			}
		}
			
		result.forEach((key, value) -> {
			System.out.println(
					String.format("%s -> %d", key, value)
					);
		});
	}

}
