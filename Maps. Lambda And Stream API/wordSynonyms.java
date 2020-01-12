import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class sinonims {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = Integer.parseInt(sc.nextLine());
		
		Map<String, List<String>> words = new LinkedHashMap<>();
		
		for (int i = 0; i < num; i++) {
			String key = sc.nextLine();
			String value = sc.nextLine();
			
			words.putIfAbsent(	key, new ArrayList<>());
			words.get(key).add(value);
		}
		
		String patern = "%s - %s%n";
		
		for (Map.Entry<String, List<String>> kvp : words.entrySet()) {
			
			String key = kvp.getKey();
			String values = String.join(", ", kvp.getValue());
			
			System.out.printf(patern, key, values);
		}
		
	}

}
