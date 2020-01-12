import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class forceBook {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = 
				new BufferedReader(
						new InputStreamReader(
								System.in
								)
						);
		
		String input = "";
		Map<String, TreeSet<String>> forceBook = new HashMap<>();
		
		while(!"Lumpawaroo".equals(input = rd.readLine())) {
			String[] data = Arrays.stream(input
					.split("\\s+\\|\\s+|\\s+->\\s+"))
					.toArray(String[]::new);
			
			if (input.contains("|")) {
				if(!forceBook.containsKey(data[0])) {
					forceBook.put(data[0], new TreeSet<>());
				}
				if(forceBook.entrySet().stream().noneMatch(e -> 
				e.getValue().contains(data[1]))) {
					forceBook.get(data[0]).add(data[1]);
				}

			}else {
				
				forceBook.forEach((key, value) -> {
					value.remove(data[0]);
				});
				
				if(!forceBook.containsKey(data[1])) {
					forceBook.put(data[1], new TreeSet<>());
				}
				
				forceBook.get(data[1]).add(data[0]);
				System.out.printf("%s joins the %s side!%n", data[0], data[1]);
			}
		}
		
		forceBook
				.entrySet()
				.stream()
				.filter(e -> e.getValue().size() > 0)
				.sorted((e1, e2) -> {
					int sort = Integer.compare(e2.getValue().size(), e1.getValue().size());
					if (sort == 0) {
						sort = e1.getKey().compareTo(e2.getKey());
					}
					
					return sort;
				}).forEach(e -> {
					System.out.println(
							String.format("Side: %s, Members: %d", e.getKey(), e.getValue().size())
							);
					e.getValue().forEach(u -> {
						System.out.println(
								String.format("! %s", u)
								);
					});
				});
	}

}
