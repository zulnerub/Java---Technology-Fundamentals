import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class softUniExamResults {

	public static void main(String[] args) throws IOException {
		BufferedReader rd =
				new BufferedReader(
						new InputStreamReader(
								System.in
								)
						);
		
		String input = "";
		Map<String, Integer> points = new TreeMap<>();
		Map<String, Integer> counter = new TreeMap<>();
		
		while (!"exam finished".equals(input = rd.readLine())) {
			String[] data = input.split("-");
			if (!data[1].equals("banned")) {
				if (!points.containsKey(data[0])) {
					points.put(data[0], Integer.parseInt(data[2]));
				}else {
					if (points.get(data[0]) < Integer.parseInt(data[2])) {
						points.put(data[0],	Integer.parseInt(data[2]));
					}
				}
				
				if (!counter.containsKey(data[1])) {
					counter.put(data[1], 1);
				}else {
					int current = counter.get(data[1]);
					counter.put(data[1], current + 1);
				}
			}else {
				points.remove(data[0]);
			}

		}
		System.out.println("Results:");
		points
				.entrySet()
				.stream()
				.sorted((e1, e2) -> {
					int sort = Integer.compare(e2.getValue(), e1.getValue());
					if(sort == 0) {
						sort = e1.getKey().compareTo(e2.getKey());
					}
					return sort;
				})
				.forEach(e -> {
					System.out.println(
							String.format("%s | %d", e.getKey(), e.getValue())
							);
				});
		
		System.out.println("Submissions:");
		counter
				.entrySet()
				.stream()
				.sorted((e1, e2) -> {
					int sort = Integer.compare(e2.getValue(), e1.getValue());
					if (sort == 0) {
						sort = e1.getKey().compareTo(e2.getKey());
					}
					return sort;
				})
				.forEach(e -> {
					System.out.println(
							String.format("%s - %d", e.getKey(), e.getValue())
							);
				});
				
				
	}

}
