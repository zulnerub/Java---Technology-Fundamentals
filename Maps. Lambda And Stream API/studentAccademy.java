import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class studentAccademy {

	public static void main(String[] args) throws IOException {
		BufferedReader rd =
				new BufferedReader(
						new InputStreamReader(
								System.in
								)
						);
		
		int n = Integer.parseInt(rd.readLine());
		
		String[] data = new String[n * 2];
		
		
		for (int i = 1; i <= n * 2; i++) {
			
			data[i - 1] = rd.readLine();
			
		}
		Map<String, List<Double>> students = new LinkedHashMap<>();
		
		for (int j = 0; j < n * 2; j += 2) {
			if(!students.containsKey(data[j])) {
				students.put(data[j], new ArrayList<>());
				double add = Double.parseDouble(data[j + 1]);
				students.get(data[j]).add(add);
			}else {
				double add = Double.parseDouble(data[j + 1]);
				students.get(data[j]).add(add);
			}
		}
		Map<String, Double> graduates = new LinkedHashMap<>();
		
		students.entrySet().stream()
				.forEach(e -> {
					double sum = 0;
					for (int i = 0; i < e.getValue().size(); i++) {
						sum = sum + e.getValue().get(i);
					}
					sum = (double) sum / e.getValue().size();
					if (sum >= 4.5){
						graduates.put(e.getKey(), sum);
					}
				});
		
		graduates.entrySet().stream()
				.sorted((e1, e2) -> {
					int sort = Double.compare(e2.getValue(), e1.getValue());
					return sort;
				})
				.forEach(e -> {
					System.out.println(
							String.format("%s -> %.2f", e.getKey(), e.getValue())
							);
				});
				
		
		
	}

}
