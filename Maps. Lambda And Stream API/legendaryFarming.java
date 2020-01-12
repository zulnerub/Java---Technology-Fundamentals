import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class legendary {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = 
				new BufferedReader(
						new InputStreamReader(
								System.in
								)
						);
		
		Map<String, Integer> goodies = new LinkedHashMap<>();
		goodies.put("shards", 0);
		goodies.put("fragments", 0);
		goodies.put("motes", 0);
		
		Map<String, Integer> junk = new LinkedHashMap<>();
		String winner = "";
		
		while(winner.equals("")) {
			String[] loot = rd.readLine().toLowerCase().split("\\s+");
			for (int i = 1; i < loot.length; i += 2) {
				switch (loot[i]) {
				case "shards":
						int shards = goodies.get(loot[i]);
						goodies.put("shards", shards + Integer.parseInt(loot[i - 1]));
					break;
				case "fragments":
						int fragments = goodies.get(loot[i]);
						goodies.put("fragments", fragments + Integer.parseInt(loot[i - 1]));
					break;
				case "motes":
						int motes = goodies.get(loot[i]);
						goodies.put("motes", motes + Integer.parseInt(loot[i - 1]));
					break;
				default:
					if (!junk.containsKey(loot[i])) {
						junk.put(loot[i], Integer.parseInt(loot[i - 1]));
					}else {
						int current = junk.get(loot[i]);
						junk.put(loot[i], current + Integer.parseInt(loot[i - 1]));
					}
					break;
				}
				
				if (winner.equals("")) {
					if (goodies.containsKey("shards") && goodies.get("shards") >= 250) {
						winner = "Shadowmourne";
						goodies.put(loot[i], goodies.get("shards") - 250);
						i = loot.length;
					}else if(goodies.containsKey("fragments") && goodies.get("fragments") >= 250) {
						winner = "Valanyr";
						goodies.put(loot[i], goodies.get("fragments") - 250);
						i = loot.length;
					}else if (goodies.containsKey("motes") && goodies.get("motes") >= 250) {
						winner = "Dragonwrath";
						goodies.put(loot[i], goodies.get("motes") - 250);
						i = loot.length;
					}
				}	
			}	
		}
		
		System.out.printf("%s obtained!%n", winner);
		String patern = "%s: %d%n";
		goodies.entrySet()
				.stream()
				.sorted((e1, e2) -> {
					int sort = Integer.compare(e2.getValue(), e1.getValue());
					
					if (sort == 0) {
						sort = e1.getKey().compareTo(e2.getKey());
					}
					
					return sort;
				}).forEach(e -> {
					System.out.println(
							String.format("%s: %d", e.getKey(), e.getValue())
							);
				});
		
		junk.entrySet()
			.stream()
			.sorted((e1, e2) -> 
				e1.getKey().compareTo(e2.getKey())
			)
			.forEach(e -> {
				System.out.printf(patern, e.getKey(), e.getValue());
			});
	}

}
