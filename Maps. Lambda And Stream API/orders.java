import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class productsInfo {

	public static void main(String[] args) throws IOException {
		BufferedReader rd = 
				new BufferedReader(
						new InputStreamReader(
								System.in
								)
						);
		
		String input = "";
		Map<String, List<Double>> products = new LinkedHashMap<>();
		
		while (!"buy".equals(input = rd.readLine())) {
			String[] data = input.split("\\s+");
			
			if (!products.containsKey(data[0])) {
				products.put(data[0], new ArrayList<>());
				products.get(data[0]).add(Double.parseDouble(data[1]));
				products.get(data[0]).add(Double.parseDouble(data[2]));
			}else {
				products.get(data[0]).set(0, Double.parseDouble(data[1]));
				products.get(data[0]).set(1, Double.parseDouble(data[2]) + products.get(data[0]).get(1));				
			}
		}
		
		products.entrySet().stream()
				.forEach(e -> {			
						System.out.println(
							String.format("%s -> %.2f", e.getKey(), e.getValue().get(0) * e.getValue().get(1))
							);
					});	
				
	}

}
