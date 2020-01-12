import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class mergeLists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		List<Double> listOne = Arrays
				.stream(sc.nextLine().split(" "))
				.map(Double::parseDouble)
				.collect(Collectors.toList());
		
		List<Double> listTwo = Arrays
				.stream(sc.nextLine().split(" "))
				.map(Double::parseDouble)
				.collect(Collectors.toList());
		
		int count = Math.min(listOne.size(), listTwo.size());
				
		List<Double> merged = new ArrayList<>();
		
		for (int i = 0; i < count; i++) {
			merged.add(listOne.get(i));
			merged.add(listTwo.get(i));
		}
		
		if (listOne.size() > listTwo.size()) {
			for (int i = count; i < listOne.size(); i++) {
				merged.add(listOne.get(i));
			}
		}else if (listTwo.size() > listOne.size()) {
			for (int i = count; i < listTwo.size(); i++) {
				merged.add(listTwo.get(i));
			}
		}
		
		System.out.println(toPrint(merged));
	}

	static String toPrint(List<Double> merged) {
		DecimalFormat format = new DecimalFormat("0.#");
		String output = "";
		
		for(Double num : merged) {
			output += format.format(num) + " ";
		}
				
		return output.trim();
	}
	
	

}
