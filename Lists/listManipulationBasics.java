import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> nums = Arrays
				.stream(sc.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		List<String> command = Arrays
				.stream(sc.nextLine().split(" "))
				.collect(Collectors.toList());
		
		while (!command.get(0).toLowerCase().equals("end")) {
			switch (command.get(0).toLowerCase()) {
			case "add":
				nums.add(Integer.parseInt(command.get(1)));
				break;
			case "remove":
				for (int i = 0; i < nums.size(); i++) {
					if (nums.get(i) == Integer.parseInt((command.get(1)))) {
						nums.remove(i);
					}
				}
				break;
			case "removeat":
				nums.remove(Integer.parseInt(command.get(1)));
				break;
			case "insert":
				nums.add(Integer.parseInt(command.get(2)), Integer.parseInt(command.get(1)));
				break;
			}
			
			command = Arrays
					.stream(sc.nextLine().split(" "))
					.collect(Collectors.toList());
			
		}
		
		System.out.println(toPrint(nums));
	}

	 static String toPrint(List<Integer> nums) {
		 String output = "";
		 for(Integer num : nums) {
			 output += num + " ";
		 }	 
		 return output.trim();
	}

}
