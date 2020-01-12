import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class companiUsers {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = 
				new BufferedReader(
						new InputStreamReader(
								System.in
								)
						);
		String input = "";
		Map<String, Map<String, String>> compEmp = new LinkedHashMap<>();
		while (!"End".equals(input = rd.readLine())) {
			String[] data = input.split(" -> ");
			if(!compEmp.containsKey(data[0])) {
				compEmp.put(data[0], new LinkedHashMap<>());
				compEmp.get(data[0]).put(data[1], data[1]);
			}else {
				compEmp.get(data[0]).putIfAbsent(data[1], data[1]);
			}
		}
		
		compEmp.entrySet().stream()
				.sorted((e1, e2) -> {
					int sort = e1.getKey().compareTo(e2.getKey());
					return sort;
				})
				.forEach(e -> {
					System.out.println(
							String.format("%s", e.getKey())
							);
					e.getValue().entrySet().stream()
							.forEach(d -> {
								System.out.println(
										String.format("-- %s", d.getKey())
										);
							});
				});
	}

}
