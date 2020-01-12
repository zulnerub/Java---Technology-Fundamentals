import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> wagons = Arrays
				.stream(sc.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		int maxCapacity = Integer.parseInt(sc.nextLine());
		
		List<String> command = Arrays
				.stream(sc.nextLine().split(" "))
				.collect(Collectors.toList());
		
		while (!command.get(0).toLowerCase().equals("end")) {
			if (command.get(0).toLowerCase().equals("add")) {
				wagons.add(Integer.parseInt(command.get(1)));
			}else {
				for (int i = 0; i < wagons.size(); i++) {
					int passengers = wagons.get(i) + Integer.parseInt(command.get(0));
					if (passengers <= maxCapacity) {
						wagons.set(i, passengers);
						break;
					}
				}
			}
			
			command = Arrays
					.stream(sc.nextLine().split(" "))
					.collect(Collectors.toList());
		}
		
		System.out.println(wagons.toString().replaceAll("\\[|,|\\]", ""));
	}

	
	

}
