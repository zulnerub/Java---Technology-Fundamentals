import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countRealNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] nums = Arrays
				.stream(sc.nextLine().split("\\s+"))
				.mapToDouble(Double::parseDouble)
				.toArray();
		
		TreeMap<Double, Integer> someMap = new TreeMap<>();
		
		for (Double num : nums) {
			if(!someMap.containsKey(num)) {
				someMap.put(num, 0);
			}
			int oldValue = someMap.get(num);
			someMap.put(num, oldValue + 1);
		}
		
		for (Map.Entry<Double, Integer> entry : someMap.entrySet()) {
			DecimalFormat df = new DecimalFormat ("#.######");
			System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
		}
		
	}

}
