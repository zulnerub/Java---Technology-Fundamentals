import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class parkingLot {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader rd = 
				new BufferedReader (
						new InputStreamReader(
								System.in
								)
						);
		
		LinkedHashMap<String, String> users = new LinkedHashMap<>();
		
		int n = Integer.parseInt(rd.readLine());
		
		for (int i = 0; i < n; i++) {
			String[] input = rd.readLine().split("\\s+");
			
			switch (input[0].toLowerCase()) {
			case "register":
				if (!users.containsKey(input[1])) {
					users.put(input[1], input[2]);
					System.out.printf("%s registered %s successfully%n", input[1], input[2]);
				}else {
					System.out.printf("ERROR: already registered with plate number %s%n", users.get(input[1]));
				}
				break;
			case "unregister":
				if (!users.containsKey(input[1])) {
					System.out.printf("ERROR: user %s not found%n", input[1]);
				}else {
					System.out.printf("%s unregistered successfully%n", input[1]);
					users.remove(input[1]);
				}
				break;
			}
		}
		
		users.entrySet()
			.stream()
			.forEach(e -> {
				System.out.println(
						String.format("%s => %s", e.getKey(), e.getValue())
						);
			});
		
		
	}

}
